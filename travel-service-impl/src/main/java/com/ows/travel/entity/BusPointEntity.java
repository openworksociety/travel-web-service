package com.ows.travel.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ows.travel.entity.common.AuditEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Table(name = "BUS_POINT")
public class BusPointEntity extends AuditEntity{
	
	private static final long serialVersionUID = 5268659544009641714L;

}
