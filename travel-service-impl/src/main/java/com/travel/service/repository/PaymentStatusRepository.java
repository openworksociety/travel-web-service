package com.travel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.service.entity.PaymentStatusEntity;

@Repository
public interface PaymentStatusRepository extends JpaRepository<PaymentStatusEntity, Long> {

}
