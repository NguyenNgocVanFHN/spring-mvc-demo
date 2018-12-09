package app.dao;

import java.util.List;

import app.model.Reader;

public interface ReaderDAO extends BaseDAO<Integer, Reader> {
	
	List<Reader> loadReaders();
	
	Reader checkLogin(Reader reader);
	
}
