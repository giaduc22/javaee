package com.giaduc.java4.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.giaduc.java4.conn.HibernateUtil;
import com.giaduc.java4.model.Author;

public class AuthorDao {

	private Session session;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Author> getAllAuthor() {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			List<Author> authors = new ArrayList<>();
			Criteria criteria = session.createCriteria(Author.class);
			authors = criteria.list();
			session.getTransaction().commit();
			return authors;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public boolean addOneAuthor(Author author) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(author);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	public boolean editOneCategory(Author author) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(author);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	public boolean deleteOneCategory(int authorId) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Author author = session.get(Author.class, authorId);
			session.delete(author);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
}
