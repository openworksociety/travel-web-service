package com.travel.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Table(name = "IDENTIY_TYPE")
public class IdentiyTypeEntity extends AuditEntity{
	
	
	private static final long serialVersionUID = 8551452294863904223L;
	
	@Column(name="VALUE")
	private String value;
	

}
