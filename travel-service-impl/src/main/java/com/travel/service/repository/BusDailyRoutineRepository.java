package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.BusDailyRoutineEntity;

@Repository
public interface BusDailyRoutineRepository extends JpaRepository<BusDailyRoutineEntity, Long> {

}
