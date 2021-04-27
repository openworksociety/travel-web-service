package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.IdentityTypeEntity;

@Repository
public interface IdentityTypeRepository extends JpaRepository<IdentityTypeEntity, Long> {

}
