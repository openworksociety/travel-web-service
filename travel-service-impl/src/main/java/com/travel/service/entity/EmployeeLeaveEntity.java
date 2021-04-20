package com.travel.service.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@Table(name = "EMPLOYEE_EXPENSE")
public class EmployeeLeaveEntity extends AuditEntity{
	
	private static final long serialVersionUID = -3454853312658925301L;
	
	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private EmployeeEntity employeeEntity;
	
	@Column(name="LEAVE_DATE")
	private LocalDate leaveDate;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="REASON")
	private String reason;

}
