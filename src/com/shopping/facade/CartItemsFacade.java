/**
 * 
 */
package com.shopping.facade;

import com.shopping.businesslayer.CartItemsBusinessLayer;

/**
 * @author kulkasur
 *
 */
public class CartItemsFacade 
{
	public String getCartItems() throws Exception
	{
		
		return new CartItemsBusinessLayer().verifyInsertCartItems();
	}
	

}
