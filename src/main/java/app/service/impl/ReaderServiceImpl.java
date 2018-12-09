package app.service.impl;

import java.io.Serializable;

import app.model.Reader;
import app.service.ReaderService;

public class ReaderServiceImpl extends BaseServiceImpl implements ReaderService {

	@Override
	public Reader findById(Serializable key) {
		return getReaderDAO().findById(key);
	}

	@Override
	public Reader saveOrUpdate(Reader entity) {
		return getReaderDAO().saveOrUpdate(entity);
	}

	@Override
	public boolean delete(Reader entity) {
		try {
			getReaderDAO().delete(entity);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Reader checkLogin(Reader reader) {
		return getReaderDAO().checkLogin(reader);
	}

}
