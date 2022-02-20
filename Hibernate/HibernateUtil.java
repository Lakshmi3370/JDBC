package com.xowrkz.sports.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private HibernateUtil() {
		
	}
	
	private static final SessionFactory sessiFactory;
	
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		sessiFactory =  configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		
		return sessiFactory;
	
		}
}
