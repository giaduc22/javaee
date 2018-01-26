package com.giaduc.java4.conn;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.giaduc.java4.model.Author;
import com.giaduc.java4.model.Category;

public class HibernateUtil {

	// XML based configuration
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

}
