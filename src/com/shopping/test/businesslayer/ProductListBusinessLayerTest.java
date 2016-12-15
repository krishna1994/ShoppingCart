/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductListBusinessLayer;

/**
 * @author singhkri
 *
 */
public class ProductListBusinessLayerTest 
{
	@Mock
	ResultSet resultSet;
	
	@InjectMocks
	ProductListBusinessLayer productListBusinessLayer;

	

	@Before
	public void setup() throws SQLException 
	{
		MockitoAnnotations.initMocks(this);
		Mockito.when(resultSet.next()).thenReturn(true,true,false);
		Mockito.when(resultSet.getString("productId"))
		.thenReturn("A001")
		.thenReturn("A002");
		
	}
	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public void testProductDetailsGetter() throws Exception 
	{
		List<ProductBean> products=productListBusinessLayer.productListSet(new ProductBean());
		assertEquals(products.size(),2);
		assertEquals(products.get(0), "A001");
        assertEquals(products.get(1), "A002");


	}


}
