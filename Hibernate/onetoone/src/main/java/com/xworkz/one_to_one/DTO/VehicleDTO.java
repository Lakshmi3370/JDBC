package com.xworkz.one_to_one.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "vehicle")
public class VehicleDTO {
	
	@Id
	@Column(name = "vehicle_id")
	@GenericGenerator(name= "auto", strategy ="increment")
	@GeneratedValue(generator= "auto")
	private int vehicleId;
	private String company;
	private String model;
	private int price;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "VehicleDTO [vehicleId=" + vehicleId + ", company=" + company + ", model=" + model + ", price=" + price
				+ "]";
	}
	

}
