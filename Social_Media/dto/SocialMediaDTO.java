package com.xworkz.social_media.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="social_media")
@NamedQuery(name = "fetchByRevenue" ,query = "Select social FROM SocialMediaDTO social where social.revenue=4.78")
public class SocialMediaDTO {
	
	@Id
	private int id;
	@Column(name="app_name")
	private String appName;
	private float revenue;
	private double version;
	private double ratings;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public float getRevenue() {
		return revenue;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	

}
