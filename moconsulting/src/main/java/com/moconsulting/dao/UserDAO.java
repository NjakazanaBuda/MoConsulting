package com.moconsulting.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.moconsulting.enitty.Users;
import com.moconsulting.framework.AbstractDAO;
import com.moconsulting.framework.AbstractDataProvider;
import com.moconsulting.framework.MySQLProvider;

public class UserDAO extends AbstractDAO {

	@Override
	public AbstractDataProvider getDataProvider() {
		
		return new MySQLProvider();
	}
	
	public String addUser(Users user) throws Exception
	{
		super.create(user);
		super.create(user.getLogin());
		return "User has been registered successfully";
		
	}

	@SuppressWarnings("unchecked")
	public List<Users> allUsers() throws Exception
	{
		return (List<Users>)super.getList("select o from User o ");
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> allUser(Long from, int noRows) throws Exception {
	 	String query = "select o from User o ";
	    Map<String, Object> parameters = new Hashtable<String, Object>();
	    
		return (List<Users>)super.getList(query, parameters,from.intValue(),noRows);
	}

}
