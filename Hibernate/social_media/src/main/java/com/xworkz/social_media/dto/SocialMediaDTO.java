package com.xworkz.social_media.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="social_media")
@NamedQueries(value= {
		@NamedQuery(name="fetchByRatings", query="Select social FROM SocialMediaDTO AS social" +" where social.ratings=4.4"),
@NamedQuery(name = "fetchByRevenue" ,query = "Select social FROM SocialMediaDTO AS social" +" where social.revenue=4.78"),
@NamedQuery(name = "fetchAllByAppName", query = "Select social.appName FROM SocialMediaDTO As social"),
@NamedQuery(name ="updateRatingsByAppName", query ="UPDATE SocialMediaDTO media SET media.ratings=:newRatings where media.appName =:name"),
@NamedQuery(name ="fetchAppIdByAppName", query = "Select social.id FROM SocialMediaDTO AS social" + " where social.appName=:appNames"),
@NamedQuery(name ="deleteByRatings", query="delete from SocialMediaDTO media"+ " where media.ratings=:Rratings")
})
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
