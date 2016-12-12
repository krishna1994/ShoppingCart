package com.shopping.test.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shopping.bean.CartBean;

public class CartBeanTest
{
	

	@Test
	public void setCartIdtest() 
	{
		CartBean cartBean=new CartBean();
		
		cartBean.setCartId(0);
		//assertEquals(0, cartBean.getCartId());
		
		

	}
	
	@Test
	public void setuserNametest() 
	{
		CartBean cartBean=new CartBean();
		
		cartBean.setUserName(null);
		assertEquals(null,cartBean.getUserName());
		cartBean.setUserName("abc");
		assertEquals(0,cartBean.getUserName());	

	}

	@Test
	public void setTotalPrice()
	{
		CartBean cartBean=new CartBean();
		
		cartBean.setTotalPrice(0.0);
	//	assertEquals(0.0,cartBean.getTotalPrice());
		
		cartBean.setTotalPrice(20000.0);
		//assertEquals(20000,cartBean.getTotalPrice());
	}
}






