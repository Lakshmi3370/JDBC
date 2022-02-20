package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dao.CricketDAO;
import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class RunnerCricket {

	public static void main(String[] args) {
		
		CricketDetailsDTO cricketdetailsdto = new CricketDetailsDTO();
		cricketdetailsdto.setNoOfPlayers((byte)15);
		cricketdetailsdto.setTeamName("RCB");
		cricketdetailsdto.setCaptainName("Virat");
		cricketdetailsdto.setMatchesPlayed(105);
		
		CricketDetailsDTO cricketdetailsdto1 = new CricketDetailsDTO();
		cricketdetailsdto1.setNoOfPlayers((byte)17);
		cricketdetailsdto1.setTeamName("SRH");
		cricketdetailsdto1.setCaptainName("David Warner ");
		cricketdetailsdto1.setMatchesPlayed(89);
		
		CricketDetailsDTO cricketdetailsdto2 = new CricketDetailsDTO();
		cricketdetailsdto2.setNoOfPlayers((byte)18);
		cricketdetailsdto2.setTeamName("PBKS");
		cricketdetailsdto2.setCaptainName("Sanju Samson");
		cricketdetailsdto2.setMatchesPlayed(89);
		
		
		
		CricketDAO cricketdao = new CricketDAO();
		//cricketdao.saveCricketDetails(cricketdetailsdto);
		//cricketdao.saveCricketDetails(cricketdetailsdto1);
		//cricketdao.saveCricketDetails(cricketdetailsdto2);

		
		}

}
