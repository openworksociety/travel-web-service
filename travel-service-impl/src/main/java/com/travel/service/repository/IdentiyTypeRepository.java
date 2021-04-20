package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.IdentiyTypeEntity;

@Repository
public interface IdentiyTypeRepository extends JpaRepository<IdentiyTypeEntity, Long> {

}
