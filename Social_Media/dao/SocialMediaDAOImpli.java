package com.xworkz.social_media.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.social_media.dto.SocialMediaDTO;
import com.xworkz.social_media.util.HibernateUtil;

public class SocialMediaDAOImpli implements SocialMediaDAO {
	
	private SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
	


	@Override
	public void save(SocialMediaDTO dto) {
		Session session = null;
		Transaction tx = null;
	try {
		 session = sessionfactory.openSession();
		 session.save(dto);
		 tx = session.beginTransaction();
		 if(tx!=null) 
		 tx.commit();
		 System.out.println("save successfully");
		
	}
	catch(HibernateException e) {
		e.printStackTrace();
			tx.rollback();
		
	}
		finally {
			if(session!=null)
				session.close();
		}
	}

	@Override
	public SocialMediaDTO getByRevenue(float revenue) {
		
		Session session = null;
		SocialMediaDTO dto = null;
		
		try {
			session = sessionfactory.openSession();
			Query query = session.createNamedQuery("fetchByRevenue");
			dto = (SocialMediaDTO) query.uniqueResult();
			 System.out.println(dto.getAppName());
			
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
		return dto;
	}

	@Override
	public SocialMediaDTO getByAppName(String name) {
		Session session = null;
		SocialMediaDTO dto = null;

		try {
			String hql ="select social from SocialMediaDTO social where social.appName= '"+name+"' ";

		session = sessionfactory.openSession();
		Query query = session.createQuery(hql);
		
		 dto = (SocialMediaDTO) query.uniqueResult();
		 System.out.println(dto.getAppName());

		 System.out.println("Fetched successfully");


		}
		
		catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		return dto;
		}

}
