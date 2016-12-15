/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;

/**
 * @author singhkri
 *
 */
public class ProductBusinessLayerTest
{
	ProductBusinessLayer productBusinessLayer;
	ProductBean productBean ;

	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void testProductDetails() throws SQLException 
	{
		
		productBean=null;
		assertEquals(null,productBusinessLayer.productDetailsGetter(productBean));

		ProductBean productBean=new ProductBean();
		productBean.setProductId("A001");
		productBean.setProductName("Mobile");
		productBean.setUnitPrice(15000.0);
		productBean.setDescription("Redmi note 3");
		assertEquals(productBean,productBusinessLayer.productDetailsGetter(productBean));

	}

}
