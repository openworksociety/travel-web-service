package com.ows.travel.events;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ows.travel.repository.PrivilegeRepository;
import com.ows.travel.repository.RoleRepository;
import com.ows.travel.repository.UserRepository;
import com.ows.travel.security.enums.Privilege;
import com.ows.travel.security.enums.Role;
import com.ows.travel.security.model.PrivilegeEntity;
import com.ows.travel.security.model.RoleEntity;
import com.ows.travel.security.model.UserEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SecurityDataSetupListener implements ApplicationListener<ContextRefreshedEvent> {

	boolean alreadySetup = false;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PrivilegeRepository privilegeRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("Application start event called...");
		if (alreadySetup)
			return;
		PrivilegeEntity readPrivilege = createPrivilegeIfNotFound(Privilege.READ.name());
		PrivilegeEntity writePrivilege = createPrivilegeIfNotFound(Privilege.WRITE.name());
		PrivilegeEntity deletePrivilege = createPrivilegeIfNotFound(Privilege.DELETE.name());

		List<PrivilegeEntity> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege, deletePrivilege);
		createRoleIfNotFound(Role.ROLE_ADMIN.name(), adminPrivileges);
		createRoleIfNotFound(Role.ROLE_USER.name(), Arrays.asList(readPrivilege));
		createRoleIfNotFound(Role.ROLE_MANAGER.name(), Arrays.asList(readPrivilege, writePrivilege));
		createRoleIfNotFound(Role.ROLE_AGENCY.name(), Arrays.asList(readPrivilege, writePrivilege));

		createUserIfNotFound("admin", Role.ROLE_ADMIN);
		createUserIfNotFound("user", Role.ROLE_USER);
		createUserIfNotFound("manager", Role.ROLE_USER);
		createUserIfNotFound("agency", Role.ROLE_USER);

		alreadySetup = true;
	}

	private void createUserIfNotFound(String username, Role role) {
		UserEntity entity = userRepository.findByUsername(username);
		if (Objects.isNull(entity)) {
			RoleEntity userRole = roleRepository.findByName(role.name());
			UserEntity user = UserEntity.builder().username(username).password(bcryptEncoder.encode(username))
					.roles(Arrays.asList(userRole)).build();
			userRepository.save(user);
		}
	}

	@Transactional
	private PrivilegeEntity createPrivilegeIfNotFound(String name) {
		PrivilegeEntity privilege = privilegeRepository.findByName(name);
		if (Objects.isNull(privilege)) {
			privilege = PrivilegeEntity.builder().name(name).build();
			privilegeRepository.save(privilege);
		}
		return privilege;
	}

	@Transactional
	private RoleEntity createRoleIfNotFound(String name, List<PrivilegeEntity> privileges) {
		RoleEntity roleEntity = roleRepository.findByName(name);
		if (Objects.isNull(roleEntity)) {
			roleEntity = RoleEntity.builder().name(name).privileges(privileges).build();
			roleRepository.save(roleEntity);
		}
		return roleEntity;
	}

}
