package com.moconsulting.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

import com.moconsulting.enitty.Users;
import com.moconsulting.enitty.Roles;

public class Test {

	public static void main(String[] args)
	{
		try
		{
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String date = "2018-03-10";
			Date myDate = formatter.parse(date);
			java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

			UserDAO dao = new UserDAO();
			RoleDAO roledao = new RoleDAO();
			
			Users user = new Users();
			Users user1 = new Users();
			Users user2 = new Users();
			
			Roles role = new Roles();
			Roles role1 = new Roles();
			Roles role2 = new Roles();
			
			role.setRolename("Manager");
			role1.setRolename("Programmer");
			role2.setRolename("Tester");
			roledao.addRole(role);
			roledao.addRole(role1);
			roledao.addRole(role2);
			
			
			user.setFirstname("Bafana");
			user.setLastname("Buda");
			user.setCellnumber("0728906921");
			user.setCreatedBy("Buda Testing");
			user.setCreatedDate(sqlDate);
			user.setEmailaddress("njakazana.buda@gmail.com");
			user.setIdnumber("9010205853089");
			
			user1.setFirstname("Mpho");
			user1.setLastname("Latakgomo");
			user1.setCellnumber("0728906921");
			user1.setCreatedBy("Buda Testing");
			user1.setCreatedDate(sqlDate);
			user1.setEmailaddress("njakazana.buda@gmail.com");
			user1.setIdnumber("9010205853089");
			
			
			
			user2.setFirstname("Joshua");
			user2.setLastname("Tatana");
			user2.setCellnumber("0728906921");
			user2.setCreatedBy("Buda Testing");
			user2.setCreatedDate(sqlDate);
			user2.setEmailaddress("njakazana.buda@gmail.com");
			user2.setIdnumber("9010205853089");
			
			dao.addUser(user);
			dao.addUser(user1);
			dao.addUser(user2);
			List showroles = roledao.showRoles();
			
			System.out.println("Total Number Of Records : "+showroles.size());
			Iterator it = showroles.iterator();
			
			while(it.hasNext())
			 {
			 String i = (String)it.next();
			 System.out.println("Role Name : "+i.toString());
			 System.out.println("---------------------------");
			 
			 } 
			 
		}
		catch(Exception err)
		{
			Logger.getGlobal().info("Error " + err.getMessage());
			err.printStackTrace();
		}
	}
}
