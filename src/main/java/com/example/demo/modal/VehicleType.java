package com.example.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_type")
public class VehicleType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vehicle_type_id")
	private Integer vehicleId;
	@Column(name="vehicle_name")
	private String vehicleType;
	@Column(name="created_date")
	private String createdDate;
	
	public VehicleType() {
		
	}
	public VehicleType(String vehicleType, String createdDate) {
		this.vehicleType = vehicleType;
		this.createdDate = createdDate;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
