package app.service.impl;

import java.io.Serializable;
import java.util.List;

import app.model.Book;
import app.service.BookService;

public class BookServiceImpl extends BaseServiceImpl implements BookService {

	@Override
	public Book findById(Serializable key) {
		return getBookDAO().findById(key);
	}

	@Override
	public Book saveOrUpdate(Book entity) {
		return getBookDAO().saveOrUpdate(entity);
	}

	@Override
	public boolean delete(Book entity) {
		try {
			getBookDAO().delete(entity);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Book> searchBooks(String name, Integer price) {
		return getBookDAO().searchBookUsingCretial(name, price);
	}

	@Override
	public List<Book> loadBooks() {
		return getBookDAO().loadBooks();
	}

	@Override
	public boolean deleteBook(Integer id) {
		try {
			return delete(findById(id));
		} catch (Exception e) {
			throw e;
		}
	}

}
