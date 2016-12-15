/**
 * 
 */
package com.shopping.test.facade;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.ProductFacade;

/**
 * @author singhkri
 *
 */
public class ProductFacadeTest
{
	
	/*ProductBusinessLayer productBusinessLayer;*/
	ProductFacade productFacade;

	/**
	 * Test method for {@link com.shopping.facade.ProductFacade#verifyProduct(com.shopping.bean.ProductBean)}.
	 */
	
	public void setup() 
	{
		
		//productBusinessLayer=new ProductBusinessLayer();
		productFacade=new ProductFacade();

	}
	@Test
	public final void testVerifyProduct() throws Exception 
	{
		//productBean=null;
		ProductBean productBean=new ProductBean();
		assertEquals(productBean,productFacade.verifyProduct(productBean));
	}

}
