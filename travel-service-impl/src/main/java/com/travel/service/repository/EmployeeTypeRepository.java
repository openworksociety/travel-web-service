package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.EmployeeTypeEntity;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeTypeEntity, Long> {

}
