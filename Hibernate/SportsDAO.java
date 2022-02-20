package com.xworkz.sports.dao;

import com.xworkz.sports.dto.SportsDTO;

public interface SportsDAO {
	
	public void saveSports(SportsDTO sportsdto);
	public SportsDTO getSportsById(int sportsId);
	public SportsDTO updateCountryOriginById(String countryOrigin, int sportsId);
	public SportsDTO deleteById(int sportsId);

}
