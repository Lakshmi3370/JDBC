package com.xworkz.credit_card.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.credit_card.dto.CreditCardDTO;

public class CreditCardDAOImpli implements CreditCardDAO {

	@Override
	public void saveCard(CreditCardDTO cardDTO) {

		
		// step1
		Configuration cfg = new Configuration();
		cfg.configure();

		// step2
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		// step3
		Session session = sessionfactory.openSession();

		// step4
		Transaction transaction = session.beginTransaction();
		
		// step5
		session.save(cardDTO);
		transaction.commit();

		// step6
		session.close();
		
		System.out.println("Data added");

	}

}
