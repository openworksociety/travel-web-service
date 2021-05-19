package com.ows.travel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ows.travel.entity.common.AuditEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Table(name = "IDENTITY_TYPE")
public class IdentityTypeEntity extends AuditEntity{
	private static final long serialVersionUID = 8551452294863904223L;
	

}
