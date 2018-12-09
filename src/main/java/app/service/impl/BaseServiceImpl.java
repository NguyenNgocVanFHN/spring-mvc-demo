package app.service.impl;

import app.dao.BookDAO;
import app.dao.ReaderDAO;

public class BaseServiceImpl {
	
	private BookDAO bookDAO;
	private ReaderDAO readerDAO;

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public ReaderDAO getReaderDAO() {
		return readerDAO;
	}

	public void setReaderDAO(ReaderDAO readerDAO) {
		this.readerDAO = readerDAO;
	}
	
}
