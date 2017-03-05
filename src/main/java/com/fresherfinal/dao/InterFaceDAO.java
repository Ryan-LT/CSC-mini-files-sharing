package com.fresherfinal.dao;

import java.util.List;

import javax.activation.DataSource;

public interface InterFaceDAO<T> {
	/**
	 * This is the method to be used to initialize database resources.
	 * @param dataSource
	 */
	void getDataSource(DataSource dataSource);
	
	
	/**
	 * This is the method to be used to create a record in the T table.
	 * @param item
	 */
	public void create(T item);

	
	/**
	 * This is the method to be used to list down a record from T
	 * table corresponding to a passed id. 
	 * @param id
	 * @return 
	 */
	public T getItem(Integer id);

	
	/**
	 * This is the method to be used to list down all the records from the
	 * T table. 
	 * @return
	 */
	public List<T> getList();

	
	/**
	 * This is the method to be used to delete a record from T table
	 * corresponding to a passed id.
	 * @param id
	 */
	public void delete(Integer id);
}
