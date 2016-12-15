package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static  Connection createConnection() //Function to create connection
	{
		Connection con = null;		// Free up the connection resource
		String url = "jdbc:mysql://localhost:3306/shoppingcart";  // jdbc connection string url
		String username = "root"; 	// setting username of database in String
		String password = "root"; 	// setting password of database in String
		try
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver"); // Register the driver with the DriverManager.
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}

			con = DriverManager.getConnection(url, username, password);	// Establishing a connection with Database.
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}

		return con;
	}
}
