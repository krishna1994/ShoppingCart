/**
 * 
 */
package com.shopping.test.facade;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.ProductFacade;

/**
 * @author singhkri
 *
 */
public class productFacadeTest
{

	
	@Test
	public final void testVerifyProduct() throws SQLException
	{
		
			ProductFacade productFacade =new ProductFacade();
			ProductBean productBean ;
			productBean = new ProductBean();
			productBean = null;
			assertEquals(ShoppingConstants.INVALID_PRODUCT,productFacade.verifyProduct(productBean));
		
	}

}
