/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductListBusinessLayer;

/**
 * @author singhkri
 *
 */
public class ProductListBusinessLayerTest 
{

	ProductListBusinessLayer productListBusinessLayer ;
	List<ProductBean> products;
	ProductBean productBean;
	ResultSet resultSet;

	@Before
	public void setup()
	{
		productListBusinessLayer =new ProductListBusinessLayer();
		products = new ArrayList<ProductBean>();
		productBean=new ProductBean();

	}
	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public void testProductDetailsGetter() throws Exception 
	{
		productBean.setProductId(null);
		assertEquals(null,productBean.getProductId());
		productBean.setProductId("A001");
		assertEquals("A001",productBean.getProductId());

		productBean.setProductName(null);
		assertEquals(null,productBean.getProductName());
		productBean.setProductName("Mobile");
		assertEquals("Mobile",productBean.getProductName());
		
		productBean.setUnitPrice(null);
		assertEquals(null, productBean.getUnitPrice());
		productBean.setUnitPrice(15000.0);
		//assertEquals(15000.0, productBean.getUnitPrice());
		
		
		productBean.setDescription(null);
		assertEquals(null,productBean.getDescription());
		productBean.setDescription("Redmi Note 3 (16Gb)");
		assertEquals("Redmi Note 3 (16Gb)",productBean.getDescription());
	
		//assertEquals(products,productListBusinessLayer.productListSet());



	}


}
