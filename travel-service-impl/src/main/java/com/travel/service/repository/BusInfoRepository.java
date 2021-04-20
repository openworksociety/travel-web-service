package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.BusInfoEntity;

@Repository
public interface BusInfoRepository extends JpaRepository<BusInfoEntity, Long> {

}
