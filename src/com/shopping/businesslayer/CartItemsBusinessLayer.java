package com.shopping.businesslayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.CartItemsDAO;

public class CartItemsBusinessLayer 
{
	ResultSet resultSet = null;                                         //Reference to ResultSet is deleted
	public String verifyInsertCartItems() throws SQLException
	{
		CartItemsDAO cartItemsDAO=new CartItemsDAO();
		int i=cartItemsDAO.addItems();
		if(i!=0)
		{
			return ShoppingConstants.SUCCESS;
		}
		return ShoppingConstants.FAIL;
	}
	
	public String selectcartItems() throws Exception
	{
		resultSet=new CartItemsDAO().showcartItems();
		while(resultSet.next())
		{
			
			
		}
		return ShoppingConstants.SUCCESS;
	}
	
	

}
