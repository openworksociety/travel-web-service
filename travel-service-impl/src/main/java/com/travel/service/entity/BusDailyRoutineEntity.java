package com.travel.service.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name = "BUS_DAILY_ROUTINE")
public class BusDailyRoutineEntity extends AuditEntity{
	
	private static final long serialVersionUID = -3273325073217185665L;

	@ManyToOne
	@JoinColumn(name = "ROUTE_FROM")
	private LocationEntity routeFrom;
	
	@ManyToOne
	@JoinColumn(name = "ROUTE_TO")
	private LocationEntity routeTo;
	
	@ManyToOne
	@JoinColumn(name = "BUS_ID")
	private BusInfoEntity busInfoEntity;
	
	@Column(name = "TRAVEL_DATE")
	private LocalDate travelDate;
	
	@Column(name = "START_TIME")
	private LocalTime startTime;
	
	@Column(name = "END_TIME")
	private LocalTime endTime;
	
	@ManyToOne
	@JoinColumn(name = "DRIVER_ID")
	private EmployeeEntity driver;
	
	@ManyToOne
	@JoinColumn(name = "ASSIST_DRIVER_ID")
	private EmployeeEntity assistDriver;
	
	@ManyToOne
	@JoinColumn(name = "CLEANER_ID")
	private EmployeeEntity cleaner;
}
