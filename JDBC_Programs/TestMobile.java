package com.xworkz.jdbc.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.jdbc.dao.MobileDAO;
import com.xworkz.jdbc.dto.MobileDetailsDTO;

public class TestMobile {


	public static void main(String[] args) {
		
		
		
		MobileDAO mobiledao = new MobileDAO();
		
		mobiledao.UpdateMobileRomByBrand();
		mobiledao.DeleteMobileByPrice();
		
		mobiledao.getBrandAndPriceByRom();
		mobiledao.getBrandAndPriceByDisplay(0);
		
		
MobileDetailsDTO mobiledetaisdto = new MobileDetailsDTO();
		
		mobiledetaisdto.setBrand("Apple");
		mobiledetaisdto.setPrice(45000);
		mobiledetaisdto.setColor("Red");
		mobiledetaisdto.setDisplay((float) 4.7);
		mobiledetaisdto.setRom(128);
		
MobileDetailsDTO mobiledetaisdto1 = new MobileDetailsDTO();
		
		mobiledetaisdto1.setBrand("Oppo");
		mobiledetaisdto1.setPrice(15000);
		mobiledetaisdto1.setColor("White");
		mobiledetaisdto1.setDisplay((float) 4.4);
		mobiledetaisdto1.setRom(64);
		
MobileDetailsDTO mobiledetaisdto2 = new MobileDetailsDTO();
		
		mobiledetaisdto2.setBrand("Moto");
		mobiledetaisdto2.setPrice(14000);
		mobiledetaisdto2.setColor("Gray");
		mobiledetaisdto2.setDisplay((float) 4.2);
		mobiledetaisdto2.setRom(12);
		
		List<MobileDetailsDTO> mobileList = new ArrayList<MobileDetailsDTO>();
		mobileList.add(mobiledetaisdto);
		mobileList.add(mobiledetaisdto1);
		mobileList.add(mobiledetaisdto2);
		
		mobiledao.insertMobileDetailsDTO(mobileList);
		
		
		
	}

}
