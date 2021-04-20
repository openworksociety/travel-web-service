package com.travel.service.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Table(name = "EXPENSE_TYPE")
public class ExpenseTypeEntity extends AuditEntity{
	
	private static final long serialVersionUID = 4031974685526019924L;

}
