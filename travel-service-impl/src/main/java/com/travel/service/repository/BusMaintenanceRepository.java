package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.BusMaintenanceEntity;

@Repository
public interface BusMaintenanceRepository extends JpaRepository<BusMaintenanceEntity, Long> {

}
