package com.travel.service.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Table(name = "PAYMENT_STATUS")
public class PaymentStatusEntity extends AuditEntity{ 
	
	private static final long serialVersionUID = 8862932924559084687L;

}
