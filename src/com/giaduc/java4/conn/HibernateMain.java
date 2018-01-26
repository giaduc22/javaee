package com.giaduc.java4.conn;

import com.giaduc.java4.dao.CategoryDao;

public class HibernateMain {

	public static void main(String[] args) {
		CategoryDao categoryDao = new CategoryDao();
		categoryDao.deleteOneCategory(1);
	}
}
