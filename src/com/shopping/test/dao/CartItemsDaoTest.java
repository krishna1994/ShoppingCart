/**
 * 
 */
package com.shopping.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shopping.bean.CartItemsBean;
import com.shopping.dao.CartItemsDAO;

/**
 * @author singhkri
 *
 */
public class CartItemsDaoTest {

	@Test
	public void addItemstest() 
	{
		CartItemsDAO cartItemsDao = new CartItemsDAO();
		CartItemsBean cartItemsbean= null;
		assertEquals("fail",cartItemsDao.addItems(cartItemsbean));



		cartItemsbean = new CartItemsBean();
		cartItemsbean.setProductId("A001");
		cartItemsbean.setCartId(1);;
		cartItemsbean.setItemPrice(1500.0);;
		cartItemsbean.setQuantity(4);
		assertEquals("Success",cartItemsDao.addItems(cartItemsbean));
	}

}
