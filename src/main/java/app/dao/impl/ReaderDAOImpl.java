package app.dao.impl;

import java.util.List;

import app.dao.GenericDAO;
import app.dao.ReaderDAO;
import app.model.Reader;

public class ReaderDAOImpl extends GenericDAO<Integer, Reader> implements ReaderDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<Reader> loadReaders() {
		return getSession().createQuery("FROM Reader").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Reader checkLogin(Reader reader) {
		String hql = "FROM Reader a"
				+ " WHERE a.userName = :username AND a.passWord = :password";
		List<Reader> rs = getSession().createQuery(hql).setParameter("username", reader.getUserName())
				.setParameter("password", reader.getPassWord()).getResultList();
		if (rs.size() == 1) {
			return rs.get(0);
		}
		return null;
	}
	
}
