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
@Table(name = "EMPLOYEE_SALARY")
public class EmployeeSalaryEntity extends AuditEntity{
	
	private static final long serialVersionUID = 9110834822105603603L;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private EmployeeEntity employeeEntity;
	
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	
	@Column(name = "PAYMENT_DATE")
	private LocalDate paymentDate;
	
	@Column(name = "PAYMENT_STATUS")
	private PaymentStatusEntity paymentStatusEntity;
	
}
