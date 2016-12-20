package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.bean.CartItemsBean;
import com.shopping.util.DBConnection;

public class CartItemsDAO 
{
	Connection con = null;		//  Reference to connection object is deleted
	PreparedStatement preparedStatement = null;		//Reference to Preparedstatement object is deleted
	ResultSet resultSet = null;		 //Reference to ResultSet object is deleted
	int i;
	CartItemsBean cartItemsBean=new CartItemsBean();
	public  int addItems() throws SQLException
	{
		int quantity=cartItemsBean.getQuantity();
		try 
		{
			con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
			String query="insert into cartitems(username,productId, quantity) values(?,?,?)";
			preparedStatement = con.prepareStatement(query);	//query to be executed
			preparedStatement.setString(1, "username");
			preparedStatement.setString(2,"productId" );
			preparedStatement.setInt(3, quantity);
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
