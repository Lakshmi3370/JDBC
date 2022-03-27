package com.xworkz.one_to_one.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.one_to_one.DTO.EngineDTO;
import com.xworkz.one_to_one.util.HibernateUtil;

public class EngineDAOImpl implements  EngineDAO{
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public void saveEngine(EngineDTO dto) {
Transaction tx = null;
		
		try(Session session = sessionFactory.openSession();){
			tx= session.beginTransaction();
			session.save(dto);
			tx.commit();
		}	catch(HibernateException e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}
	}
