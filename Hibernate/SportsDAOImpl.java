package com.xworkz.sports.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xowrkz.sports.util.HibernateUtil;
import com.xworkz.sports.dto.SportsDTO;

public class SportsDAOImpl implements SportsDAO {

	@Override
	public void saveSports(SportsDTO sportsdto) {

		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.configure();

			SessionFactory sessionfactory = configuration.buildSessionFactory();

			session = sessionfactory.openSession();

			Transaction transaction = session.beginTransaction();

			session.save(sportsdto);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {

			if (session != null)
				session.close();

		}

	}

	@Override
	public SportsDTO getSportsById(int sportsId) {
		Session session = null;
		SportsDTO sportsdto = null;
		try {

			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

			session = sessionfactory.openSession();
			sportsdto = session.get(SportsDTO.class, sportsId);
		}

		catch (HibernateException e) {
			e.printStackTrace();
		} finally {

			if (session != null)
				session.close();

		}

		return sportsdto;
	}

	@Override
	public SportsDTO updateCountryOriginById(String countryOrigin, int sportsId) {
		Session session = null;
		SportsDTO sportsdto = null;
		Transaction trx = null;
		try {

			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

			session = sessionfactory.openSession();

			trx = session.beginTransaction();
			//System.out.println(session.contains(sessionfactory));
			sportsdto = session.get(SportsDTO.class, sportsId);

			if (sportsdto != null) {
				System.out.println(sportsdto);
				sportsdto.setCountryOfOrigin(countryOrigin);
				session.update(sportsdto);
				trx.commit();

			}
		} catch (HibernateException e) {
			e.printStackTrace();
			trx.rollback();
		} finally {
			if (session != null)
				session.close();

		}

		return sportsdto;
	}

	@Override
	public SportsDTO deleteById(int sportsId) {
		Session session = null;
		SportsDTO sportsdto = null;
		Transaction trx = null;
		try {

			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

			session = sessionfactory.openSession();
			trx = session.beginTransaction();
			

			sportsdto = session.get(SportsDTO.class, sportsId);
			if (sportsdto != null) {
				sportsdto.getSportsId();
				session.delete(sessionfactory);
				trx.commit();

			}

		}

		catch (HibernateException e) {
			e.printStackTrace();
			trx.rollback();
		}

		finally {
             if(session!=null)
            	 session.close();
            	 
		}
		return sportsdto;
	}

}
