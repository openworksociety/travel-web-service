package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.ExpenseTypeEntity;

@Repository
public interface ExpenseTypeRepository extends JpaRepository<ExpenseTypeEntity, Long> {

}
