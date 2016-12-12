/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.shopping.bean.LoginBean;
import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.LoginBusinessLayer;
import com.shopping.businesslayer.ProductListBusinessLayer;
import com.shopping.constants.ShoppingConstants;

/**
 * @author singhkri
 *
 */
public class ProductListBusinessLayerTest {

	ProductListBusinessLayer productListBusinessLayer ;
  @Before
   public void setup()
   {
		ProductListBusinessLayer productListBusinessLayer =new ProductListBusinessLayer();

   }
	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void testProductDetailsGetter() throws SQLException {
		ResultSet resultSet=null; 
		
		assertEquals(null, productListBusinessLayer.productListSet());
		
		
	}
	

}
