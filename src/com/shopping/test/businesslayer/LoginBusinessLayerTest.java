/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shopping.bean.LoginBean;
import com.shopping.businesslayer.LoginBusinessLayer;
import com.shopping.constants.ShoppingConstants;

/**
 * @author singhkri
 *
 */
public class LoginBusinessLayerTest {



	/**
	 * Test method for {@link com.shopping.businesslayer.LoginBusinessLayer#validateLogin(com.shopping.bean.LoginBean)}.
	 * @throws Exception 
	 */
	@Test
	public final void validateLoginTest() throws Exception 
	{
		LoginBusinessLayer loginBusinessLayer =new LoginBusinessLayer();
		LoginBean loginBean = null;
		loginBean = new LoginBean();
		loginBean.setPassword("1234");
		loginBean.setUsername(null);
		assertEquals(ShoppingConstants.INVALID_CREDENTIALS,loginBusinessLayer.validateLogin(loginBean));
	}

}
