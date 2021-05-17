package com.travel.service.security.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import com.travel.service.repository.PrivilegeRepository;
import com.travel.service.repository.RoleRepository;
import com.travel.service.repository.UserRepository;
import com.travel.service.security.model.PrivilegeEntity;
import com.travel.service.security.model.RoleEntity;

public class SecurityDataSetupLoader implements ApplicationListener<ContextRefreshedEvent> {

  boolean alreadySetup = false;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private PrivilegeRepository privilegeRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  @Transactional
  public void onApplicationEvent(ContextRefreshedEvent event) {

    if (alreadySetup) {
      return;
    }
    Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
    Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

    List<Privilege> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege);
    createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
    createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

    Role adminRole = roleRepository.findByName("ROLE_ADMIN");
    User user = new User();
    user.setFirstName("Test");
    user.setLastName("Test");
    user.setPassword(passwordEncoder.encode("test"));
    user.setEmail("test@test.com");
    user.setRoles(Arrays.asList(adminRole));
    user.setEnabled(true);
    userRepository.save(user);

    alreadySetup = true;
  }

  @Transactional
  PrivilegeEntity createPrivilegeIfNotFound(String name) {

    PrivilegeEntity privilege = privilegeRepository.findByName(name);
    if (privilege == null) {
      privilege = new PrivilegeEntity(name);
      privilegeRepository.save(privilege);
    }
    return privilege;
  }

  @Transactional
  RoleEntity createRoleIfNotFound(String name, List<PrivilegeEntity> privileges) {

    RoleEntity role = roleRepository.findByName(name);
    if (role == null) {
      role = RoleEntity.builder().name(name).build();
      role.setPrivileges(privileges);
      roleRepository.save(role);
    }
    return role;
  }
}
