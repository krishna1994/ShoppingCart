package com.shopping.test.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shopping.bean.CartItemsBean;

public class CartItemsBeanTest
{
	CartItemsBean cartItemsBean;
	
	@Before
	public void setUp()
	{
		cartItemsBean = new CartItemsBean();
	}	

	
	@Test
	public void setCartIdTest()
	{
		cartItemsBean.setCartId(null);;
		assertEquals(null, cartItemsBean.getCartId());
		
		cartItemsBean.setCartId(001);
		assertEquals(new Integer(001), cartItemsBean.getCartId());

	}
	
	@Test
	public void setProductIdTest()
	{
		cartItemsBean.setProductId(null);
		assertEquals(null, cartItemsBean.getProductId());
		
		cartItemsBean.setProductId("A001");
		assertEquals("A001", cartItemsBean.getProductId());

	}
	
	@Test
	public void setQuantity()
	{
		cartItemsBean.setQuantity(null);
		assertEquals(null, cartItemsBean.getQuantity());
		
		cartItemsBean.setQuantity(5);
		assertEquals(new Integer(5), cartItemsBean.getQuantity());

	}
}