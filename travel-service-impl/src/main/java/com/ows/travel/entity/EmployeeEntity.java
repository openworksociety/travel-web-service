package com.ows.travel.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ows.travel.entity.common.AuditEntity;

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
@Table(name = "EMPLOYEE")
public class EmployeeEntity extends AuditEntity{

	private static final long serialVersionUID = 2412501498098035013L;

	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
	
	@ManyToOne
	@JoinColumn(name="ID_TYPE")
	private IdentityTypeEntity identityTypeEntity;
	
	@Column(name="ID_NUMBER")
	private String idNumber;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private EmployeeTypeEntity employeeTypeEntity;
	
	@Column(name="JOIN_DATE")
	private LocalDate joinDate;
	
	@Column(name="LAST_WORKING_DAY")
	private LocalDate lastWorkingDay;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CONTACT")
	private Long contact;
	
	@Column(name="SALARY")
	private BigDecimal salary;
	
	
}
