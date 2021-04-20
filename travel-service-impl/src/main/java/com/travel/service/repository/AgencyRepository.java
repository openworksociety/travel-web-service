package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.AgencyEntity;

@Repository
public interface AgencyRepository extends JpaRepository<AgencyEntity, Long> {

}
