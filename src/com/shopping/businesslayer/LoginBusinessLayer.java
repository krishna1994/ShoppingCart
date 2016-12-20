package com.shopping.businesslayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.LoginDAO;
//To check if a value is passed in loginBean

public class LoginBusinessLayer
{	
	ResultSet resultSet =  null;
	
	public  String validateLogin(LoginBean loginBean) throws SQLException
	{
		LoginDAO loginDAO = new LoginDAO();
		resultSet = new LoginDAO().authenticateUser(loginBean);
		resultSet.next();	// Shifts the cursor to the next row of the result set from the database and returns true if there is any row, otherwise false
			
			if(resultSet.getInt("total")>0)	//If obtained result value is greater then 0 print success.
			{
				return ShoppingConstants.SUCCESS;
			}
			return ShoppingConstants.INVALID_CREDENTIALS;
			//Passing the values to Login
		
	}
}
