package com.xworkz.social_media.runner;

import java.util.Iterator;
import java.util.List;

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

		
		socialMediaDTO1.setId(3);
		socialMediaDTO1.setAppName("Twitter");
		socialMediaDTO1.setRevenue(4.98f);
		socialMediaDTO1.setVersion(3.2);
		socialMediaDTO1.setRatings(3.5);
		
		SocialMediaDAOImpli dao = new SocialMediaDAOImpli();
		//dao.save(socialMediaDTO);
		//dao.save(socialMediaDTO1);
		//System.out.println(dao.getByRevenue(4.78f));
		
		//System.out.println(dao.getByAppName("Facebook"));
		
		//SocialMediaDTO getratings = dao.getByRatings(4.4);
		//System.out.println(getratings);
		
		//List<SocialMediaDTO> getall = dao.getAll();
	
		/*for (SocialMediaDTO socialmedia : getall) {
			System.out.println(socialmedia);
			System.out.println(socialmedia.getId());
			System.out.println(socialmedia.getAppName());
			System.out.println(socialmedia.getRevenue());
			System.out.println(socialmedia.getVersion());
			System.out.println(socialmedia.getRatings());

			
		}*/
		
	/*List<String> getallbyAppName =	dao.getAllByAppName();
		
for (String string : getallbyAppName) {
	System.out.println(string);
	
}	*/
		
	/*int rowAffected =	dao.updateRatingsByAppName(4.5, "FaceBook");
	System.out.println(rowAffected);*/
		
		
		
	
	List<Integer> getallIdandAppname = dao.getIdByAppName("Facebook");
	for (Integer socialMedia1 : getallIdandAppname) {
		System.out.println(socialMedia1);
		
	}
	
	
  dao.getAppNameAndRevenueByRatings(4.9);

		
		double delete = dao.deleteByRatings(3.5);
		System.out.println(delete);
		
	}
}
		
	


