package com.shopping.businesslayer;

import java.sql.SQLException;

import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.CartItemsDAO;

public class CartItemsBusinessLayer 
{
	public String verifyCartItems() throws SQLException
	{
		CartItemsDAO cartItemsDAO=new CartItemsDAO();
		int i=cartItemsDAO.addItems();
		if(i!=0)
		{
			return ShoppingConstants.SUCCESS;
		}
		return ShoppingConstants.FAIL;
	}
	

}
