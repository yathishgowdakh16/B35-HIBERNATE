package org.tnsif.service;

import java.awt.print.Book;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;

import antlr.collections.List;

@SuppressWarnings("unused")
public class BookServiceImpl implements BookService{
private BookDao dao;
	

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id);
	}

	@Override
	public long getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public long getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public Long getBooksCount() {
		// TODO Auto-generated method stub
		return dao.getBooksCount();
	}

	@Override
	public long getBookByPrice(int low, int high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}

}
