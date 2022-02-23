package com.xworkz.social_media.dao;

import com.xworkz.social_media.dto.SocialMediaDTO;

public interface SocialMediaDAO {
	
	public void save(SocialMediaDTO dto);
	
	public SocialMediaDTO getByRevenue(float revenue);
	
	public SocialMediaDTO getByAppName(String name);

}
