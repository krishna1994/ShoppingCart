package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.util.DBConnection;

public class CartItemsDAO 
{
	Connection con = null;		//  Reference to connection object is deleted
	PreparedStatement preparedStatement = null;		//Reference to Preparedstatement object is deleted
	ResultSet resultSet = null;		 //Refrence to ResultSet object is deleted
	int i;

	public  int addItems() throws SQLException
	{
		try 
		{
			con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
			String query="insert into";
			preparedStatement = con.prepareStatement(query);	//query to be executed
			i=preparedStatement.executeUpdate();



		}
		finally
		{

			//				con.close();		//closing connection

		}
		System.out.println(" CartItems DAO:"+resultSet.toString());



		return i;
	}
	
	
	 

}
