package com.xworkz.onetomany.runner;

import com.xworkz.onetomany.dao.EngineDAOImpli;
import com.xworkz.onetomany.dto.EngineDTO;
import com.xworkz.onetomany.dto.VehicleDTO;

public class RunnerClass {

	public static void main(String[] args) {

		
		VehicleDTO dto = new VehicleDTO();
		dto.setCompany("TVS");
		dto.setModel("XL");
		dto.setPrice(59900);


		EngineDTO engineDTO = new EngineDTO();
		engineDTO.setNoOfCylinder(4);
		engineDTO.setNoOfStroke(3);
		engineDTO.setCapacity(430);

		engineDTO.setVehicle(dto);

		EngineDAOImpli impl = new EngineDAOImpli();
		impl.saveEngine(engineDTO);
	}

}
