
package com.shopping.test.facade;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.shopping.bean.ProductBean;
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
