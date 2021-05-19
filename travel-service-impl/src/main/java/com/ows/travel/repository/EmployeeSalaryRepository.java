package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.EmployeeSalaryEntity;

@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalaryEntity, Long> {

}
