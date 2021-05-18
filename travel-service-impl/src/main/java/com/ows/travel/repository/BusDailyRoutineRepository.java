package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.BusDailyRoutineEntity;

@Repository
public interface BusDailyRoutineRepository extends JpaRepository<BusDailyRoutineEntity, Long> {

}
