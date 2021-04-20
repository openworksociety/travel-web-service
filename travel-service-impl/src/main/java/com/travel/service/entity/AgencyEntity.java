package com.travel.service.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.travel.service.entity.common.AuditEntity;

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
@Table(name = "AGENCY_ALLOCATION")
public class AgencyEntity extends AuditEntity{
	
	private static final long serialVersionUID = -6136978085318056010L;

	@ManyToOne
	@JoinColumn(name = "LOCATION_ID")
	private LocationEntity locationEntity;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CONTACT")
	private Long contact;
	
	@Column(name="JOIN_DATE")
	private LocalDate joinDate;
	
	@Column(name="DISCONTINUED_DATE")
	private LocalDate discontinuedDate;

}
