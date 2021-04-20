package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.BusPointEntity;

@Repository
public interface BusPointRepository extends JpaRepository<BusPointEntity, Long> {

}
