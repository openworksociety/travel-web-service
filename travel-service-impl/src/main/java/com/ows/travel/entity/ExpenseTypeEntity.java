package com.ows.travel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ows.travel.entity.common.AuditEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Table(name = "EXPENSE_TYPE")
public class ExpenseTypeEntity extends AuditEntity{
	
	private static final long serialVersionUID = 4031974685526019924L;

}
