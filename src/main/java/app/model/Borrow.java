package app.model;

import java.io.Serializable;
import java.sql.Date;

public class Borrow implements Serializable {
	
	private Integer id;
	private Date borrowDate;
	private Integer state;
	private Reader reader;
	private Book book;
	
	public Borrow() {
	}

	public Borrow(Integer id, Date borrowDate, Integer state, Reader reader, Book book) {
		super();
		this.id = id;
		this.borrowDate = borrowDate;
		this.state = state;
		this.reader = reader;
		this.book = book;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
