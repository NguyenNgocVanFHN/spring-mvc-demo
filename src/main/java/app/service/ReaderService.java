package app.service;

import app.model.Reader;

public interface ReaderService extends BaseService<Integer, Reader> {
	
	Reader checkLogin(Reader reader);
	
}
