package com.xworkz.social_media.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.social_media.dto.SocialMediaDTO;

public interface SocialMediaDAO {
	
	public void save(SocialMediaDTO dto);
	
	public SocialMediaDTO getByRevenue(float revenue);
	
	public SocialMediaDTO getByAppName(String name);
	
	public SocialMediaDTO getByRatings(double ratings);
	
	public List<SocialMediaDTO> getAll();
	
	public List<String> getAllByAppName();
	
	public int updateRatingsByAppName(double ratings, String appName);
	
	public List<Integer> getIdByAppName(String appName);
	
	public void getAppNameAndRevenueByRatings(double ratings);
	
	public double deleteByRatings(double ratings);

}
