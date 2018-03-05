package com.moconsulting.dao;

import java.util.logging.Logger;

import com.moconsulting.enitty.Users;

public class Test {

	public static void main(String[] args)
	{
		try
		{
			UserDAO dao = new UserDAO();
			
			Users user = new Users();
			
			user.setFirstname("Bafana");
			user.setLastname("Buda");
			
			dao.addUser(user);
		}
		catch(Exception err)
		{
			Logger.getGlobal().info("Error " + err.getMessage());
			err.printStackTrace();
		}
	}
}
