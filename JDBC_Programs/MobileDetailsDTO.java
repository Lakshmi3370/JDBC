package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class MobileDetailsDTO implements Serializable {
	
	
	private String brand;
	private int price;
	private String color;
	private float display;
	private int Rom;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setDisplay(float display) {
		this.display = display;
	}
	public float getDisplay() {
		return display;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	public int getRom() {
		return Rom;
	}
}
