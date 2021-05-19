package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.AgencyAllocationEntity;

@Repository
public interface AgencyAllocationRepository
		extends JpaRepository<AgencyAllocationEntity, Long>, QueryByExampleExecutor<AgencyAllocationEntity> {

}
