package com.xworkz.employee.runner;

import com.xworkz.employee.dao.EmployeeDAO;
import com.xworkz.employee.dao.EmployeeDAOImpli;
import com.xworkz.employee.dto.EmployeeDTO;

public class RunnerEmployee {

	public static void main(String[] args) {
		EmployeeDTO employeedto = new EmployeeDTO();
		employeedto.setEmployeeId(1);
		employeedto.setEmployeeName("John");
		employeedto.setDesignation("Associate Software Engineer");
		employeedto.setSalary(45555.09f);
		
		EmployeeDAOImpli dao = new EmployeeDAOImpli();
			
			dao.save(employeedto);
		
	}

}
