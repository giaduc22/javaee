package com.giaduc.java4.test;

import com.giaduc.java4.dao.AuthorDao;
import com.giaduc.java4.dao.BookDao;
import com.giaduc.java4.dao.CategoryDao;
import com.giaduc.java4.model.Author;
import com.giaduc.java4.model.Book;

public class HibernateMain {

	public static void main(String[] args) {
		BookDao bookDao = new BookDao();
		Book book = new Book();
		
//		book.setTitle("Book 1");
//		book.setPrice(500);
//		book.setWeight(40);
//		book.setNumber_of_pages(100);
//		book.setCategory(2);
//		book.setAuthor_id(1);
//		book.setImage("book1");
//		bookDao.addOneBook(book);
		
//		for (int i = 21; i <= 22; i++) {
//			book.setTitle("Book " + i);
//			book.setPrice(500);
//			book.setWeight(40);
//			book.setNumber_of_pages(100);
//			book.setCategory(2);
//			book.setAuthor_id(1);
//			book.setImage("book" + i);
//			bookDao.addOneBook(book);
//		}
		
		
//		bookDao.getBookByCate(3);
		
		
//		bookDao.deleteOneBook(102);

		// AuthorDao authorDao = new AuthorDao();
		// Author author = new Author();
		// author.setName("giaduc");
		//
		// authorDao.addOneAuthor(author);
		//

	}
}
