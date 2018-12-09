package app.dao;

import java.util.List;

import app.model.Book;

public interface BookDAO extends BaseDAO<Integer, Book> {
	
	List<Book> searchBookUsingCretial(String name, Integer price);
	
	List<Book> loadBooks();
	
}
