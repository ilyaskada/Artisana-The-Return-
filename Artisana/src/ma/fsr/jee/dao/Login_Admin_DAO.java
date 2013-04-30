package ma.fsr.jee.dao;

import ma.fsr.jee.bean.Admin;

import java.sql.*;

public class Login_Admin_DAO {
	
		 static Connection currentCon = null;
		 static ResultSet rs = null;
		
		 public static  Admin login (Admin bean)
			{
			Statement stmt = null;
			String login_admin_dao=bean.getLogin_Admin();
			String pass_admin_dao=bean.getPass_Admin();
//			String username = bean.getUsername();
//			String password = bean.getPassword();
			String searchQuery = "select * from admin where login_Adim='" + login_admin_dao + "' AND pass_Admin='" + pass_admin_dao + "'";
			 
			try
			{
			//connecting to the DB
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean userExists = rs.next();
			 
			if (!userExists)
			{
			System.out.println("Username/Password entered is Incorrect or User doesnot Exists.");
			bean.setValid(false);
			}
			else if (userExists)
			{
			String login = rs.getString("login_Adim");
			String pass = rs.getString("pass_Admin");
			System.out.println("Welcome " + login);
			bean.setLogin_Admin(login_admin_dao);
			//bean.setFirstName(firstName);
			bean.setLogin_Admin(pass);
			//bean.setLastName(lastName);
			bean.setValid(true);
			}
			 
			}
			catch (Exception ex)
			{
			System.out.println("Log In failed: An Exception has occurred! " + ex);
			}
			return bean;
				
}
	}
