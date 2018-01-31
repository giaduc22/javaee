package com.giaduc.java4.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.giaduc.java4.conn.HibernateUtil;
import com.giaduc.java4.model.Book;

public class BookDao {

	private int pageSize = 13;
	private int lastPageNumber = 0;
	private Session session;

	@SuppressWarnings("deprecation")
	public int lastPageNumber(String type, int categoryId, int authorId) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			switch (type) {
//			case "all":
//
//				break;

			case "category":
				criteria.add(Restrictions.eq("category", categoryId));
				break;
			case "author":
				criteria.add(Restrictions.eq("author_id", authorId));
				break;
			default:
				break;
			}
			

			criteria.setProjection(Projections.rowCount());
			Long countResults = (Long) criteria.uniqueResult();
			lastPageNumber = (int) (Math.ceil((double) countResults / pageSize));
			session.getTransaction().commit();
			System.out.println("Total count: " + countResults);
			return lastPageNumber;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return this.lastPageNumber;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Book> getBookByPage(int page) {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Book> books = new ArrayList<>();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			criteria.setFirstResult((page - 1) * pageSize);
			criteria.setMaxResults(pageSize);
			books = criteria.list();
			session.getTransaction().commit();
			return books;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Book> getBookByCate(int categoryId, int page) {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Book> books = new ArrayList<>();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			criteria.add(Restrictions.eq("category", categoryId));
			criteria.setFirstResult((page - 1) * pageSize);
			criteria.setMaxResults(pageSize);
			books = criteria.list();
			session.getTransaction().commit();
			return books;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Book> getBookByAuthor(int authorId, int page) {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Book> books = new ArrayList<>();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			criteria.add(Restrictions.eq("author_id", authorId));
			criteria.setFirstResult((page - 1) * pageSize);
			criteria.setMaxResults(pageSize);
			books = criteria.list();
			session.getTransaction().commit();
			return books;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Book> getAllBook() {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Book> books = new ArrayList<>();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			books = criteria.list();
			session.getTransaction().commit();
			return books;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public Book getOneBook(int bookId) {
		Book book = new Book();
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			book = session.get(Book.class, bookId);
			session.getTransaction().commit();
			return book;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public boolean addOneBook(Book book) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(book);
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

	public boolean deleteOneBook(int bookId) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Book book = session.get(Book.class, bookId);
			session.delete(book);
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
