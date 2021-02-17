package com.travel.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "VEHICLE")
public class VehicleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "VEHICLE_ID")
  private Long id;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "NUMBER")
  private String number;

  @Column(name = "COLOR")
  private String color;

  @Column(name = "DEACTIVE")
  private boolean deactive;

}
