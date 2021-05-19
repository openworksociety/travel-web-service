package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.EmployeeLeaveEntity;

@Repository
public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeaveEntity, Long> {

}
