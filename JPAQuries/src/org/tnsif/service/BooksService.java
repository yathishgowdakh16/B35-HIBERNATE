package org.tnsif.service;

import java.awt.print.Book;

import antlr.collections.List;

@SuppressWarnings("unused")
public interface BookService {
	//abstract method
			Book getBookById(int id);
			long getAllBooks();
			long getAuthorBooks(String author);
			Long getBooksCount();
			long getBookByPrice(int low,int high);
}
