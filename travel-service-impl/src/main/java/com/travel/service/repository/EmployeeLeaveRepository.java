package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.EmployeeLeaveEntity;

@Repository
public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeaveEntity, Long> {

}
