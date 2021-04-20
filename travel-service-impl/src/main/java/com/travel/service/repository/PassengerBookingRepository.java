package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.PassengerBookingEntity;

@Repository
public interface PassengerBookingRepository extends JpaRepository<PassengerBookingEntity, Long> {

}
