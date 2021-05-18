package com.ows.travel.entity;

import java.math.BigDecimal;

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
@Table(name = "DAILY_BUS_EXPENSE")
public class DailyBusExpenseEntity extends AuditEntity{
	
	private static final long serialVersionUID = 945263585526658809L;

	@ManyToOne
	@JoinColumn(name = "BUS_ID")
	private BusInfoEntity busInfoEntity;
	
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	
	@Column(name = "REASON")
	private String reason;

	@ManyToOne
	@JoinColumn(name = "EXPENSE_TYPE")
	private ExpenseTypeEntity expenseTypeEntity;
	
	@ManyToOne
	@JoinColumn(name = "PAID_BY")
	private EmployeeEntity paidByEntity;
	
	

}
