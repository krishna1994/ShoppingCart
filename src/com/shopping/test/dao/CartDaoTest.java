/**
 * 
 */
package com.shopping.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shopping.bean.CartBean;
import com.shopping.dao.CartDAO;

/**
 *
 */
public class CartDaoTest {

	@Test
	public void validateOrderTest() 
	{
		CartDAO cartDao = new CartDAO();
		CartBean cartbean= null;
		assertEquals("fail",cartDao.validateOrder(cartbean));



		cartbean = new CartBean();
		cartbean.setCartId(1);
		cartbean.setTotalPrice(30000.00);
		cartbean.setUserName("abc"); 
		assertEquals("Success",cartDao.validateOrder(cartbean));
	}


}
