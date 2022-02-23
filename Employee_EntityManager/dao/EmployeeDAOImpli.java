package com.xworkz.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.HibernateException;

import com.xworkz.employee.dto.EmployeeDTO;
import com.xworkz.employee.util.HibernateUtil;

public class EmployeeDAOImpli implements EmployeeDAO {

	@Override
	public void save(EmployeeDTO dto) {
		
		EntityManagerFactory factory = HibernateUtil.getSessionFactory();
		EntityManager entityManager = factory.createEntityManager();

		try {

			entityManager.getTransaction().begin();

			entityManager.persist(dto);

			entityManager.getTransaction().commit();


	}catch(HibernateException e) {
		e.printStackTrace();
	}finally {
		if(entityManager!=null)
			entityManager.close();

			
	}
		
		
	}
	
	
	
}
