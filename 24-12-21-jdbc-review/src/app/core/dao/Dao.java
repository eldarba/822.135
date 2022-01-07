package app.core.dao;

import java.util.List;

public interface Dao<T, ID> {

	String DB_URL = "jdbc:mysql://localhost:3306/db5";
	String DB_USER = "root";
	String DB_PASS = "1234";

	ID create(T bean) throws Exception;

	T findById(ID id) throws Exception;

	List<T> findAll() throws Exception;

	void update(T bean) throws Exception;

	boolean delete(ID id) throws Exception;

}
