package com.ows.travel.entity;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "EMPLOYEE_EXPENSE")
public class EmployeeExpenseEntity extends AuditEntity{
	
	private static final long serialVersionUID = 554512391296435959L;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private EmployeeEntity employeeEntity;
	
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	
	@Column(name = "REASON")
	private String reason;
	
	@Column(name = "PAID_DATE")
	private Date paidDate;
	
}
