package com.shopping.test.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shopping.bean.ProductBean;

public class ProductBeanTest
{
	ProductBean productBean;
	
	@Before
	public void setUp()
	{
		productBean = new ProductBean();
	}


	@Test
	public void setProductIdTest()
	{
		
		productBean.setProductId(null);
		assertEquals(null,productBean.getProductId());

		
		productBean.setProductId("A001");
		assertEquals("A001",productBean.getProductId());
	}
	
	@Test
	public void setProductNameTest()
	{
		
		productBean.setProductName(null);
		assertEquals(null,productBean.getProductName());
		
		productBean.setProductName("mobile");
		assertEquals("mobile",productBean.getProductName());
	}
	
	@Test
	public void setUnitPriceTest()
	{
		
		productBean.setUnitPrice(null);
		assertEquals(null, productBean.getUnitPrice());
		
		productBean.setUnitPrice(15000.0);
		//assertEquals(15000.0, productBean.getUnitPrice());
	}
	
	@Test
	public void setDescriptionTest()
	{
		
		productBean.setDescription(null);
		assertEquals(null,productBean.getDescription());
		
		productBean.setDescription("Redmi Note 3 (16Gb)");
		assertEquals("Redmi Note 3 (16Gb)",productBean.getDescription());
	}

}
