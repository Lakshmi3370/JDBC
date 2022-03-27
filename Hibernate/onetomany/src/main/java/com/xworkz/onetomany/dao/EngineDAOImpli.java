package com.xworkz.onetomany.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.onetomany.dto.EngineDTO;
import com.xworkz.onetomany.util.HibernateUtil;

public class EngineDAOImpli implements EngineDAO{

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	@Override
	public void saveEngine(EngineDTO dto) {

		Session session = null;
		Transaction tx = null;

		try {
			session = factory.openSession();
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
