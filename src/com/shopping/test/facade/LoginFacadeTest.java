/**
 * 
 */
package com.shopping.test.facade;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.LoginFacade;

/**
 * @author singhkri
 *
 */
public class LoginFacadeTest 
{



	/**
	 * Test method for {@link com.shopping.businesslayer.LoginBusinessLayer#validateLogin(com.shopping.bean.LoginBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void verifyLoginTest() throws SQLException 
	{
		LoginFacade loginFacade =new LoginFacade();
		LoginBean loginBean ;
		loginBean = new LoginBean();
		
		loginBean.setPassword("1234");
		loginBean.setUsername(null);
		assertEquals(ShoppingConstants.INVALID_CREDENTIALS,loginFacade.verifyLogin(loginBean));
	}

}
