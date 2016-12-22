package com.shopping.businesslayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.bean.CartItemsBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.CartItemsDAO;

public class CartItemsBusinessLayer 
{
	CartItemsBean cartItemsBean=new CartItemsBean();
	ResultSet resultSet = null;   //Reference to ResultSet is deleted
	
	CartItemsDAO cartItemsDAO=new CartItemsDAO();
	
	public ResultSet verifyCartId() throws Exception
	{
		resultSet=cartItemsDAO.checkCartId();
		while(resultSet.next())
		{
			return resultSet;

		}
		return null;
	}
	public String verifyInsertCartItems() throws SQLException
	{
		
		int i=cartItemsDAO.addItems(cartItemsBean);
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
			cartItemsBean.setProductId(resultSet.getString("productId"));
			cartItemsBean.setQuantity(resultSet.getInt("quantity"));
			cartItemsBean.setItemPrice(resultSet.getDouble("itemPrice"));
			
		}
		return ShoppingConstants.SUCCESS;
	}
	
	

}
