<<<<<<< HEAD
/**
 * 
 */
package com.shopping.test.facade;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.ProductListFacade;

/**
 * @author singhkri
 *
 */
public class ProductListFacadeTest 
{
	ProductListFacade productListFacade;
	ProductBean productBean ;
	
	public void setup() 
	{
		productListFacade =new ProductListFacade();
		productBean = new ProductBean();

	}

	
	/**
	 * Test method for {@link com.shopping.facade.ProductListFacade#productsCheck(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public void productsCheckTest() throws SQLException
	{ 
		productBean=null;
		assertEquals(null ,productListFacade.productsCheck());

		productBean.setProductId("A001");
		productBean.setProductName("Mobile");
		productBean.setUnitPrice(13000.0);;
		

		assertEquals(ShoppingConstants.SUCCESS_LIST ,productListFacade.productsCheck());
		
	}

}
=======
/**
 * 
 */
package com.shopping.test.facade;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.ProductListFacade;

/**
 * @author singhkri
 *
 */
public class productListFacadeTest {

	
	/**
	 * Test method for {@link com.shopping.facade.ProductListFacade#productsCheck(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void productsCheckTest() throws SQLException {
		ProductListFacade productListFacade =new ProductListFacade();
		ProductBean productBean ;
		productBean = new ProductBean();
		
		assertEquals(ShoppingConstants.INVALID_LIST ,productListFacade.productsCheck());

		productBean.setProductId("A001");
		productBean.setProductName("Mobile");
		productBean.setUnitPrice(13000.0);;
		

		assertEquals(ShoppingConstants.INVALID_LIST ,productListFacade.productsCheck());
		
	}

}
>>>>>>> 07bf323fa4857333157f4eaac98f9d5839e0cccb
