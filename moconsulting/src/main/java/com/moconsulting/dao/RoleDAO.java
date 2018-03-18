package com.moconsulting.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.moconsulting.enitty.Roles;
import com.moconsulting.framework.AbstractDAO;
import com.moconsulting.framework.AbstractDataProvider;
import com.moconsulting.framework.MySQLProvider;

public class RoleDAO extends AbstractDAO {

	@Override
	public AbstractDataProvider getDataProvider() {
		
		return new MySQLProvider();
	}
	
	public String addRole(Roles role) throws Exception
	{
		super.create(role);
		//super.create(role.getLogin());
		return "User has been registered successfully";
		
	}

	@SuppressWarnings("unchecked")
	public List<Roles> allRoles() throws Exception
	{
		return (List<Roles>)super.getList("select o from Roles o ");
	}
	
	@SuppressWarnings("unchecked")
	public List<Roles> allRoles(Long from, int noRows) throws Exception {
	 	String query = "select o from Roles o ";
	    Map<String, Object> parameters = new Hashtable<String, Object>();
	    
		return (List<Roles>)super.getList(query, parameters,from.intValue(),noRows);
	}
	
	@SuppressWarnings("unchecked")
	public List<Roles> showRoles() throws Exception
	{
		return (List<Roles>)super.getListColumn("select r.rolename from Roles r");
	}

}
