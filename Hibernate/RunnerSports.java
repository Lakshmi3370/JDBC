package com.xowrkz.sports.runner;

import com.xworkz.sports.dao.SportsDAOImpl;
import com.xworkz.sports.dto.SportsDTO;

public class RunnerSports {

	public static void main(String[] args) {
		
		SportsDTO sportsdto = new SportsDTO();
		sportsdto.setSportsId(20);
		sportsdto.setSportsType("outdoor");
		sportsdto.setName("FootBall");
		sportsdto.setNoOfPlayers(11);
		sportsdto.setCountryOfOrigin("India");
		
		SportsDTO sportsdto1 = new SportsDTO();
		sportsdto1.setSportsId(25);
		sportsdto1.setSportsType("Outdoor");
		sportsdto1.setName("cricket");
		sportsdto1.setNoOfPlayers(15);
		sportsdto1.setCountryOfOrigin("Uk");
		
		SportsDAOImpl sportsdao = new SportsDAOImpl();
		
		sportsdao.saveSports(sportsdto);
		sportsdao.saveSports(sportsdto1);

		System.out.println(sportsdao.getSportsById(20));
		
		sportsdao.updateCountryOriginById("Austria", 25);
		System.out.println(sportsdao.deleteById(25));
		

	}

}
