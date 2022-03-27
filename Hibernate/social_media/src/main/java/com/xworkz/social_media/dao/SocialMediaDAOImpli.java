package com.xworkz.social_media.dao;

import java.util.List;
import java.util.concurrent.ExecutionException;

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

	@Override
	public SocialMediaDTO getByRatings(double ratings) {
		try (Session sesion = sessionfactory.openSession();){
				Query<SocialMediaDTO> query = sesion.createNamedQuery("fetchByRatings");
				 return query.uniqueResult();
				 
					
		
	}
	
	catch(HibernateException e) {
		e.printStackTrace();
	}
		return null;
		
		
	}

	@Override
	public List<SocialMediaDTO> getAll() {
		
		String hql ="select social from SocialMediaDTO social";
		try(Session session = sessionfactory.openSession();){
			Query<SocialMediaDTO> query = session.createQuery(hql);
			List<SocialMediaDTO> dtos = query.list();
			return dtos;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;	
		
	}

	@Override
	public List<String> getAllByAppName() {
		
		try (Session session = sessionfactory.openSession();){
		Query<String> query = session.createNamedQuery("fetchAllByAppName");
		List<String>  dtos =	query.list();
		return dtos;
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}

		return null;
		
	}

	@Override
	public int updateRatingsByAppName(double ratings, String appName) {
		Transaction tx = null;
		
		int rowsAfftected = 0;
	
		try (Session session = sessionfactory.openSession();){
			tx = session.beginTransaction();
			Query<String> query = session.createNamedQuery("updateRatingsByAppName");
			query.setParameter("newRatings", ratings);
			query.setParameter("name", appName);
			rowsAfftected =query.executeUpdate();
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null);
			tx.rollback();
		}

		return rowsAfftected;
	
	
	}

	@Override
	public List<Integer> getIdByAppName(String appName) {
		
		try(Session session = sessionfactory.openSession();){
			Query<Integer> query = session.createNamedQuery("fetchAppIdByAppName");
			query.setParameter("appNames", appName);
			List<Integer> dtos = query.list();
			return dtos;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public void getAppNameAndRevenueByRatings(double ratings) {
		
		String hql = "select social.appName,social.revenue from SocialMediaDTO social where social.ratings=:Rratings";
		
		try(Session session = sessionfactory.openSession();){
			Query query = session.createQuery(hql);
			query.setParameter("Rratings", ratings);
			query.list();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public double deleteByRatings(double ratings) {
		Transaction tx = null;
		double rowsdeleted = 0.0;
		try(Session session = sessionfactory.openSession();){
			tx= session.beginTransaction();

			Query<Object> query = session.createNamedQuery("deleteByRatings");
			query.setParameter("Rratings", ratings);
			rowsdeleted = query.executeUpdate();
			tx.commit();
		}
	
	catch(Exception e) {
		e.printStackTrace();
		
	}
		
		return 0.0;
	}
		
}
