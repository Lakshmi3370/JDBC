package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class CricketDAO {
	
	public boolean saveCricketDetails(CricketDetailsDTO dto) {
		
		//String insertQuery = "INSERT INTO cricket_details VALUES(15, 'rcb', 'virat', 104)";
		
		String insertQuery = "INSERT INTO cricket_details VALUES (" +dto.getNoOfPlayers()+" ',"+dto.getTeamName()+"',"+dto.getCaptainName()
		+"', "+dto.getMatchesPlayed()+")";
		
		
		//step1:
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			//step2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "lakshmi@1997");
			//step3
			stmt = con.createStatement();
			//step4
		   stmt.execute("INSERT INTO cricket_details VALUES(16, 'csk', 'msd', 80)");

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}
	
	

}
