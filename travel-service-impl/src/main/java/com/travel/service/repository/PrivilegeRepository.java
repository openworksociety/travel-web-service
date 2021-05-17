package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travel.service.security.model.PrivilegeEntity;

@Repository
public interface PrivilegeRepository extends JpaRepository<PrivilegeEntity, Long> {

  PrivilegeEntity findByName(String name);

}
