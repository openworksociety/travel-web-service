package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.DailyBusExpenseEntity;

@Repository
public interface DailyBusExpenseRepository extends JpaRepository<DailyBusExpenseEntity, Long> {

}