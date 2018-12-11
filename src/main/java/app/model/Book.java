package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

public class Book implements Serializable{

	public Integer id;
	
	@Size(min=1, message="This field can not be null")
	private String name;

	private Integer price;
	private Author author;
	private List<Borrow> borrows = new ArrayList<Borrow>(0);
	
	public Book() {
	}

	public Book(Integer id, String name, Integer price, Author author, List<Borrow> borrows) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.borrows = borrows;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}
	
}
