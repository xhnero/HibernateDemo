package com.hib.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration  configuration = new Configuration();
			configuration.configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory();
			
			
		}catch (Exception e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
