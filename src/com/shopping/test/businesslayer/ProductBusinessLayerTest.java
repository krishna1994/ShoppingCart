/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;
import com.shopping.constants.ShoppingConstants;

/**
 * @author singhkri
 *
 */
public class ProductBusinessLayerTest
{
	ProductBusinessLayer productBusinessLayer;
	ProductBean productBean =null;

	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void testProductDetailsGetter() throws SQLException 
	{
		assertEquals(ShoppingConstants.list,productBusinessLayer.productDetailsGetter(productBean));

	}

}
