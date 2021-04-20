package com.travel.service.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGENCY_ALLOCATION")
public class AgencyAllocationEntity extends AuditEntity {
	
	private static final long serialVersionUID = -2508297199500941392L;

	@ManyToOne
	@JoinColumn(name = "AGENCY_ID")
	private AgencyEntity agencyEntity;
	
	@Column(name="SEAT_NO")
	private String seatNo;
	
	@Column(name="IS_BOOKED")
	private boolean isBooked;
	
	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;
	
	
}
