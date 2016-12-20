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
	ResultSet resultSet = null;		 //Reference to ResultSet object is deleted
	int i;

	public  int addItems() throws SQLException
	{
		try 
		{
			con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
			String query="insert into cartitems(ProductId, Quantity, ItemPrice) values(?,?,?)";
			preparedStatement = con.prepareStatement(query);	//query to be executed
			i=preparedStatement.executeUpdate();
		}
		finally
		{


		}
		System.out.println(" CartItems DAO:"+resultSet.toString());
		return i;
	}

	public ResultSet showcartItems() throws Exception
	{
		try 
		{
			con = DBConnection.createConnection();	                            // calling createConnection of DBConnectuion class in con
			preparedStatement = con.prepareStatement("select * from cartitems");	                    //query to be executed
			resultSet = preparedStatement.executeQuery();	                   //saving execured query resultSet

		}
		finally
		{

			//				con.close();		//closing connection

		}
		System.out.println("DAO:"+resultSet.toString());
		return resultSet;
	}




}
