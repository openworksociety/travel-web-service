package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.PassengerBookingEntity;

@Repository
public interface PassengerBookingRepository extends JpaRepository<PassengerBookingEntity, Long> {

}
