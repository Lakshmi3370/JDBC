package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.xworkz.jdbc.dto.MobileDetailsDTO;

public class MobileDAO {
	
	public boolean saveMobileDetails(MobileDetailsDTO dto) {
		
		//String insertQuery ="INSERT INTO mobile_details VALUES (" +dto.getBrand()+"',"+dto.getPrice()+
			//	"',"+dto.getColor()+"',"+dto.getDisplay()+"',"+dto.getRom()+")";
		System.out.println("Saved Successfully");
		
		Connection con=null;
		Statement stmt= null;
		
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
			stmt = con.createStatement();

			//stmt.execute("Insert into mobile_details values ('Vivo',17000,'Gray',4.4,32)");
			//stmt.execute("insert into mobile_details (brand, price, display,Rom)values ('Oneplus', 35000, 5.1, 128)");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
				stmt.close();
				if(con!=null);
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		return false;
		
		
	}
public void UpdateMobileRomByBrand() {
			
		Connection con=null;
		Statement stmt= null;
		
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
			con.setAutoCommit(false);
			stmt = con.createStatement();

			stmt.executeUpdate("Update mobile_details SET Rom=132 where brand = 'Vivo'");
			stmt.executeUpdate("Update mobile_details SET Rom 138899999999 where brand = 'vivo'");
			con.commit();
		}
		catch(SQLException e) {
			
			try {
				if(con!=null)
				con.rollback();
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(stmt!=null)
				stmt.close();
				if(con!=null);
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
}
		public void DeleteMobileByPrice() {
			
			Connection con=null;
			Statement stmt= null;
			
			try {
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
				stmt = con.createStatement();

				stmt.execute("DELETE FROM mobile_details where price = '27000'");	
			}
			catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(stmt!=null)
					stmt.close();
					if(con!=null);
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			}
}
		public void getBrandAndPriceByRom() {
			try(Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
				Statement statement = connection.createStatement();
					ResultSet resultset = statement.executeQuery("Select brand, price from mobile_details where Rom =32");)		{
				
				if(resultset.next()) {
					System.out.println(resultset.getString("brand"));
					System.out.println(resultset.getInt("price"));
					
				}
				else {
					System.out.println("No date found");
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
				
			}
		
		
		
		public void getBrandAndPriceByDisplay(float display) {
			try {
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
			PreparedStatement statement = connection.prepareStatement("select price,brand from mobile_details where display >=?");
			statement.setFloat(1, display);
					ResultSet resultset = statement.executeQuery();
				while(resultset.next()) {
					System.out.println("brand");
					System.out.println("price");
				}
	
			}
			
			catch(SQLException e) {
				e.printStackTrace();
	
			}
		
			
				
			}
		
		public void insertMobileDetailsDTO (List<MobileDetailsDTO> mobileList) {
			
			String query = "insert into mobile_details values(? ,?, ?, ?, ?)";
			Connection connection = null;
			PreparedStatement statement = null;
			
			try {
				
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "lakshmi@1997");
			    statement =connection.prepareStatement(query);
			    for (int i = 0; i < mobileList.size(); i++) {
			    MobileDetailsDTO mobiledto = mobileList.get(i);
			    statement.setString(1, mobiledto.getBrand());
			    statement.setInt(2, mobiledto.getPrice());
			    statement.setString(3, mobiledto.getColor());
			    statement.setFloat(4, mobiledto.getDisplay());
			    statement.setInt(5,mobiledto.getRom());
					statement.execute();
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(statement!=null)
					statement.close();
					
					if(connection!=null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			}
}