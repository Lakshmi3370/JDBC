package com.xworkz.movies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MoviesDetails {

	public static void main(String[] args) throws SQLException, IOException, FileNotFoundException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "lakshmi@1997");
		
		Statement stmt = con.createStatement();
		
		String sql ="create table movies values ( sl_num int,movies_name VARCHAR(20),released_year int,director VARCHAR(15),budget bigint)";
        stmt.execute(sql);
        
		FileInputStream fis = new FileInputStream("C:\\Users\\Lakshmi.DESKTOP-EA2CSFD\\Desktop\\movies\\Movies_Details.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = 	workbook.getSheet("Movies_Details");
		
		 int rows =  sheet.getLastRowNum();
		 for (int i = 1; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);
			int slNo = (int) row.getCell(0).getNumericCellValue();
			String moviesName = row.getCell(1).getStringCellValue();
			int releasedYear = (int) row.getCell(2).getNumericCellValue();
			String director = row.getCell(3).getStringCellValue();
			int budget = (int) row.getCell(0).getNumericCellValue();
			
			sql = "insert into movies values('"+slNo+"','"+moviesName+"', '"+releasedYear+"', '"+director+"','"+budget+"')";

            stmt.execute(sql);
           stmt.execute("commit");

		}
		workbook.close();
		fis.close();
		con.close();
		System.out.println("Successfully inserted data");
		
	}

}
