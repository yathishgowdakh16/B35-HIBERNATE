package org.tnsif.dao;

import java.awt.print.Book;

public interface BookDao {
	//abstract method
		Book getBookById(int id);
		long getAllBooks();
		long getAuthorBooks(String author);
		Long getBooksCount();
		long getBookByPrice(int low,int high);
}
