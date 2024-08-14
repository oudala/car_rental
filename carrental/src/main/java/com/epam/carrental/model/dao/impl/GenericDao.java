package com.epam.carrental.model.dao.impl;

import java.util.List;

public interface GenericDao<T> {
	//  C R U D 
	
	//Creat 
	int insertItem(T item);
	
	//ReadAllItem 
	
	List<T> getAllItems();
	
	//ReadItemById 
	
	T getItemById(long id);
	
	//Update 
	
	int updateItem(T item);
	
	//DeleteItem 
	
	int DeleteItem(long id);
	 
}
