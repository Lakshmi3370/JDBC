package com.xworkz.one_to_one.runner;

import com.xworkz.one_to_one.DAO.EngineDAOImpl;
import com.xworkz.one_to_one.DTO.EngineDTO;
import com.xworkz.one_to_one.DTO.VehicleDTO;

public class RunnerClass {

	public static void main(String[] args) {
		
		VehicleDTO vehicleDTO  = new VehicleDTO();
		vehicleDTO.setCompany("TVS");
		vehicleDTO.setModel("XL");
		vehicleDTO.setPrice(59000);
		
		
		EngineDTO engineDTO = new EngineDTO();
		engineDTO.setNoOfStrokes(8);
		engineDTO.setNoOfClinders(4);
		engineDTO.setCapacity(547.88);
		engineDTO.setVehicle(vehicleDTO);
		
		System.out.println(engineDTO);
		
		
		EngineDAOImpl dao = new EngineDAOImpl();
		dao.saveEngine(engineDTO);
		
	}

}
