package com.giaduc.java4.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.giaduc.java4.conn.HibernateUtil;
import com.giaduc.java4.model.Book;
import com.giaduc.java4.model.Category;

public class CategoryDao {

	private Session session = null;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Category> getAllCategory() {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			List<Category> categories = new ArrayList<>();
			Criteria criteria = session.createCriteria(Category.class);
			categories = criteria.list();
			session.getTransaction().commit();
			return categories;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public Category getOneCategory(int categoryId) {
		Category category = new Category();
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			category = session.get(Category.class, categoryId);
			session.getTransaction().commit();
			return category;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public boolean addOneCategory(Category category) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(category);
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

	public boolean editOneCategory(Category category) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(category);
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

	public boolean deleteOneCategory(int categoryId) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Category category = session.get(Category.class, categoryId);
			session.delete(category);
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
