package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.BusInfoEntity;

@Repository
public interface BusInfoRepository extends JpaRepository<BusInfoEntity, Long> {

}
