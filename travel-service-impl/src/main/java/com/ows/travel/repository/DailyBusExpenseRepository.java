package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.DailyBusExpenseEntity;

@Repository
public interface DailyBusExpenseRepository extends JpaRepository<DailyBusExpenseEntity, Long> {

}
