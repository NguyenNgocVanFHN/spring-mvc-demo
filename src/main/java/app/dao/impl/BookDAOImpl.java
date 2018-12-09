package app.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import app.dao.BookDAO;
import app.dao.GenericDAO;
import app.model.Book;

public class BookDAOImpl extends GenericDAO<Integer, Book> implements BookDAO {

	@Override
	public List<Book> searchBookUsingCretial(String name, Integer price) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<Book> cr = builder.createQuery(Book.class);
		Root<Book> root = cr.from(Book.class);
		cr.select(root);

		Predicate nameRestriction = builder.and(builder.like(root.get("name"), "%" + name + "%"));
		Predicate genderRestriction = builder.and(builder.equal(root.get("price"), price));

		cr.where(nameRestriction, genderRestriction);
		return getSession().createQuery(cr).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> loadBooks() {
		return getSession().createQuery("FROM Book").getResultList();
	}
	
}
