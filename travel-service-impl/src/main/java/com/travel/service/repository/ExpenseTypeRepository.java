package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.ExpenseTypeEntity;

@Repository
public interface ExpenseTypeRepository extends JpaRepository<ExpenseTypeEntity, Long> {

}
