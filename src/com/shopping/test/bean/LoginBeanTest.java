/**
 * 
 */
package com.shopping.test.bean;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.shopping.bean.LoginBean;


/**
 
 *
 */
public class LoginBeanTest
{
	LoginBean loginBean;
	
	@Before
	public void setUp()
	{
		loginBean = new LoginBean();
	}

	@Test
	public void setUsernameTest()
	{
		
		loginBean.setUsername("abc");
		assertEquals("abc", loginBean.getUsername());
		loginBean.setUsername(null);
		assertEquals(null, loginBean.getUsername());

	}

	@Test
	public void setPasswordTest()
	{
		
		loginBean.setPassword("1222");
		assertEquals("1222", loginBean.getPassword());

	}
}
