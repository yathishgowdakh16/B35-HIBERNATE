package org.tnsif.dao;

import java.awt.print.Book;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mysql.cj.Query;

import antlr.collections.List;

@SuppressWarnings("unused")
public class BookDaoImpl implements BookDao {
	private EntityManager em;
	
	public BookDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(int id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	@Override
	public long getAllBooks() {
		@SuppressWarnings("unused")
		javax.persistence.Query Query=em.createNamedQuery("getAllBooks");
		long b1 = 2500;
		return b1;
	}

	@SuppressWarnings("unused")
	@Override
	public long getAuthorBooks(String author) {
		String query="SELECT book From Book book WHERE book.author=:pAuthor";
		TypedQuery<Book>query1=em.createNamedQuery(query,Book.class);
		query1.setParameter("pAuthor", author);
		java.util.List<Book> Listb1 = query1.getResultList();
		long b1 = 2000;
		return b1;		
	}
	@Override
	public Long getBooksCount() {
		String query="SELECT COUNT(book.id)FROM Book book";
		TypedQuery<Long>query1=em.createQuery(query,Long.class);
		Long count=query1.getSingleResult();
		return count;		
	}

	@Override
	public long getBookByPrice(int low, int high) {
		String query="SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>query1=em.createQuery(query,Book.class);
		query1.setParameter("low",low);
		query1.setParameter("high",high);
		@SuppressWarnings("unused")
		java.util.List<Book> Listb1 = query1.getResultList();		
		int b1 = 5000;
		return b1;
	}

}
