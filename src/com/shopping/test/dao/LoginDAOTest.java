/**
 * 
 */
package com.shopping.test.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.dao.LoginDAO;

/**
 * @author singhkri
 *
 */
public class LoginDAOTest
{



	@Test
	public void authenticateUserTest()
	{
		LoginDAO loginDAO = new LoginDAO();

		LoginBean loginBean ;

		loginBean = new LoginBean();
		loginBean.setPassword("1234");
		loginBean.setUsername(null);
		assertEquals(ShoppingConstants.INVALID_CREDENTIALS,loginDAO.authenticateUser(loginBean));

		loginBean.setPassword(null);
		loginBean.setUsername("abc");
		assertEquals(ShoppingConstants.INVALID_CREDENTIALS,loginDAO.authenticateUser(loginBean));



	}

}
