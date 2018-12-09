package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Reader implements Serializable{
	
	private Integer id;
	private String name;
	private String userName;
	private String passWord;
	private List<Borrow> borrows = new ArrayList<Borrow>(0);
	
	public Reader() {
	}

	public Reader(Integer id, String name, String userName, String passWord, List<Borrow> borrows) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.passWord = passWord;
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

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
