package com.travel.service.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "BUS_MAINTENANCE")
public class BusMaintenanceEntity extends AuditEntity{

	private static final long serialVersionUID = -2988441549706298951L;

	@ManyToOne
	@JoinColumn(name = "BUS_ID")
	private BusInfoEntity busInfoEntity;
	
	@ManyToOne
	@JoinColumn(name = "SERVICE_BY")
	private EmployeeEntity serviceBy;
	
	@Column(name = "SERVICE_DATE")
	private LocalDate serviceDate;
	
	@ManyToOne
	@JoinColumn(name = "SERVICE_PLACE")
	private LocationEntity servicePlaceEntity;
	
	@Column(name = "NOTE")
	private String note;
	
	@Column(name = "TOTAL_BILL")
	private BigDecimal totalBill;
	
	@ManyToOne
	@JoinColumn(name = "PAYEMENT_STATUS")
	private PaymentStatusEntity paymentStatusEntity;
	
}
