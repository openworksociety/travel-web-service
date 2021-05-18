package com.ows.travel.entity.audit;

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
@Table(name = "AUDIT_AGENCY")
public class AuditAgencyEntity extends AuditEntity{
	
	private static final long serialVersionUID = -6884667980802658375L;
	
	@Column(name="AGENCY_ID")
	private Long agencyId;
	
	//TODO need to add some more fields

}
