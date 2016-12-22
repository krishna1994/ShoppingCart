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
	ResultSet resultSet = null;		 //Refrence to ResultSet object is deleted
	int i;
	
	public ResultSet checkCartId() throws SQLException
	{
		con=DBConnection.createConnection();
		String query="SELECT MAX(cartId) from cart ";
		preparedStatement=con.prepareStatement(query);
		resultSet=preparedStatement.executeQuery();
		
		return resultSet;
		
	}
	
	public  int addItems(CartItemsBean cartItemsBean) throws SQLException
	{
		
			con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
			String query="insert into cartitems (CartId ,ProductId , Quantity) values (? ,? ,?)";
			preparedStatement = con.prepareStatement(query);	//query to be executed
			preparedStatement.setInt(1, cartItemsBean.getCartId());
			preparedStatement.setString(2, cartItemsBean.getProductId());
			preparedStatement.setInt(3, cartItemsBean.getQuantity());
			i=preparedStatement.executeUpdate();



		
		//System.out.println(" CartItems DAO:"+resultSet.toString());



		return i;
	}

	public ResultSet showcartItems() throws Exception 
	{
		con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
		String query="SELECT * FROM cartitems";
		preparedStatement = con.prepareStatement(query);	//query to be executed
		resultSet = preparedStatement.executeQuery();	//saving execured query resultSet
		
		return resultSet;
	}
	
	
	 

}
