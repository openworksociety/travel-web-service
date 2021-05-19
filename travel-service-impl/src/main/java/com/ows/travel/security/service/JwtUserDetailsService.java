package com.ows.travel.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ows.travel.repository.UserRepository;
import com.ows.travel.security.model.PrivilegeEntity;
import com.ows.travel.security.model.RoleEntity;
import com.ows.travel.security.model.UserEntity;
import com.ows.travel.service.dto.JwtRequest;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepository.findByUsername(username);
		if (Objects.isNull(user)) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}

		User validUser = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthorities(user.getRoles()));

		return validUser;
	}

	private List<GrantedAuthority> getAuthorities(List<RoleEntity> roles) {
		return getGrantedAuthorities(getPrivileges(roles));
	}

	private List<String> getPrivileges(List<RoleEntity> roles) {
		List<String> privileges = new ArrayList<>();
		List<PrivilegeEntity> collection = new ArrayList<>();
		for (RoleEntity role : roles) {
			collection.addAll(role.getPrivileges());
		}
		for (PrivilegeEntity item : collection) {
			privileges.add(item.getName());
		}
		return privileges;
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (String privilege : privileges) {
			authorities.add(new SimpleGrantedAuthority(privilege));
		}
		return authorities;
	}

	public JwtRequest save(JwtRequest user) {
		UserEntity newUser = UserEntity.builder().username(user.getUsername())
				.password(bcryptEncoder.encode(user.getPassword())).build();
		UserEntity savedUser = userRepository.save(newUser);
		return JwtRequest.builder().username(savedUser.getUsername()).password(savedUser.getPassword()).build();
	}
}
