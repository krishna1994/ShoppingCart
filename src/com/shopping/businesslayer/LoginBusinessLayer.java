package com.shopping.businesslayer;

import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.LoginDAO;
//To check if a value is passed in loginBean

public class LoginBusinessLayer
{

	public  String validateLogin(LoginBean loginBean)
	{
		LoginDAO loginDAO = new LoginDAO();
		if(loginBean == null)	//Checking if  values are passed in loginBean 
		{
			return ShoppingConstants.INVALID_CREDENTIALS;
		}
		
		return loginDAO.authenticateUser(loginBean);	//Passing the values to Login
	}
}
