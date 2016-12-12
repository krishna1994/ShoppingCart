/**
 * 
 */
package com.shopping.facade;

import com.shopping.bean.LoginBean;
import com.shopping.businesslayer.LoginBusinessLayer;
import com.shopping.constants.ShoppingConstants;


//Facade layer to check if any value is passed through LoginServlet


public class LoginFacade
{

	public String verifyLogin(LoginBean loginBean)	//Passing loginBean object to verifyLogin function.
	{	
		if(loginBean == null)	//Condition that should occur if loginBean has no value in it.
		{
			return ShoppingConstants.INVALID_CREDENTIALS;	//If loginBean is null return "invalid credentials"
		}
		return new LoginBusinessLayer().validateLogin(loginBean);	//Passing values to validateLogin function of LoginBusinessLayer class

	}
}
