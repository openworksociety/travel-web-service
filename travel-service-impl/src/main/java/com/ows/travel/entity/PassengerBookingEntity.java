package com.ows.travel.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PASSENGER_BOOKING")
public class PassengerBookingEntity extends AuditEntity{
	
	private static final long serialVersionUID = 16214650629204350L;

	@ManyToOne
	@JoinColumn(name = "BUS_ID")
	private BusInfoEntity busInfoEntity;
	
	@Column(name="SEAT_NO")
	private String seatNo;
	
	@ManyToOne
	@JoinColumn(name = "ID_TYPE")
	private IdentityTypeEntity identityTypeEntity;
	
	@Column(name="ID_NUMBER")
	private String idNumber;
	
	@Column(name="IS_PARENT")
	private boolean isParent;
	
	@Column(name="CONTACT")
	private Long contact;
	
	@ManyToOne
	@JoinColumn(name = "TRAVEL_FROM")
	private LocationEntity travelFrom;

	@ManyToOne
	@JoinColumn(name = "TRAVEL_TO")
	private LocationEntity travelTo;
	
	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;
	
	@Column(name="TRAVEL_DATE")
	private Date travelDate;
	
	@ManyToOne
	@JoinColumn(name = "PICKUP_POINT")
	private LocationEntity pickupPoint;
	
	@ManyToOne
	@JoinColumn(name = "DROP_POINT")
	private LocationEntity dropPoint;
	
	
	
	
 	

}
