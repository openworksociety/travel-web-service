package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.BusPointEntity;

@Repository
public interface BusPointRepository extends JpaRepository<BusPointEntity, Long> {

}
