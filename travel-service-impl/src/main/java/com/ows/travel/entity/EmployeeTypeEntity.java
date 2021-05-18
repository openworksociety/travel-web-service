package com.ows.travel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ows.travel.entity.common.AuditEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Table(name = "EMPLOYEE_TYPE")
public class EmployeeTypeEntity extends AuditEntity{
	
	private static final long serialVersionUID = -1888107624980194773L;

}
