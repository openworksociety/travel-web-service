package com.ows.travel.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "BUS_INFO")
public class BusInfoEntity extends AuditEntity {
	
	private static final long serialVersionUID = -9052859472392247876L;

	@Column(name = "BUS_NUMBER")
	private String busNumber;
	
	@Column(name = "SERVICE_START_DATE")
	private Date serviceStartDate;
	
	@Column(name = "SERVICE_END_DATE")
	private Date serviceEndDate;
	
}
