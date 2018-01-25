package com.giaduc.java4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.giaduc.java4.conn.MySQLUtils;
import com.giaduc.java4.model.Book;

public class BookDao {

	private Connection connection;

	public BookDao() {
		connection = new MySQLUtils().getMySQLConnection();
	}

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from book");
			while (resultSet.next()) {
				Book book = new Book();
				book.setId(resultSet.getInt("id"));
				book.setTitle(resultSet.getString("title"));
				book.setAuthor_id(resultSet.getInt("author_id"));
				book.setPrice(resultSet.getDouble("price"));
				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;
	}
	
}
