package com.travel.service.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Table(name = "EMPLOYEE_TYPE")
public class EmployeeTypeEntity extends AuditEntity{
	
	private static final long serialVersionUID = -1888107624980194773L;

}
