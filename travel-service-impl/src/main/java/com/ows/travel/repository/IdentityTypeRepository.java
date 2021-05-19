package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.IdentityTypeEntity;

@Repository
public interface IdentityTypeRepository extends JpaRepository<IdentityTypeEntity, Long> {

}
