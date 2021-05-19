package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.BusMaintenanceEntity;

@Repository
public interface BusMaintenanceRepository extends JpaRepository<BusMaintenanceEntity, Long> {

}
