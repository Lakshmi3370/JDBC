package com.xworkz.social_media.runner;

import com.xworkz.social_media.dao.SocialMediaDAOImpli;
import com.xworkz.social_media.dto.SocialMediaDTO;

public class RunnerSocialMedia {

	public static void main(String[] args) {

		SocialMediaDTO socialMediaDTO = new SocialMediaDTO();
		
		socialMediaDTO.setId(1);
		socialMediaDTO.setAppName("Instagram");
		socialMediaDTO.setRevenue(4.78f);
		socialMediaDTO.setVersion(1.8);
		socialMediaDTO.setRatings(4.9);
		
		SocialMediaDTO socialMediaDTO1 = new SocialMediaDTO();

		
		socialMediaDTO1.setId(2);
		socialMediaDTO1.setAppName("FaceBook");
		socialMediaDTO1.setRevenue(3.08f);
		socialMediaDTO1.setVersion(2.5);
		socialMediaDTO1.setRatings(4.4);
		
		SocialMediaDAOImpli dao = new SocialMediaDAOImpli();
		//dao.save(socialMediaDTO);
		//dao.save(socialMediaDTO1);
		System.out.println(dao.getByRevenue(4.78f));
		
		//System.out.println(dao.getByAppName("Facebook"));
		
	}

}
