package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Author implements Serializable {

	private Integer id;
	private String name;
	private List<Book> books = new ArrayList<Book>(0);
	
	public Author() {
	}

	public Author(Integer id, String name, ArrayList<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
