/**
 * 
 */
package com.shopping.test.businesslayer;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;

/**
 * @author singhkri
 *
 */
public class ProductBusinessLayerTest
{
	@Mock
	ResultSet resultSet;
	
	@InjectMocks
	ProductBusinessLayer productBusinessLayer;
	
	
	@Before
	public void setUp() throws SQLException 
	{
		
		MockitoAnnotations.initMocks(this);
		Mockito.when(resultSet.next()).thenReturn(true,true,true,true,false);
		Mockito.when(resultSet.getString("productId")).thenReturn("A001");
		Mockito.when(resultSet.getString("productName")).thenReturn("Mobile");
		Mockito.when(resultSet.getDouble("unitPrice")).thenReturn(15000.0);
		Mockito.when(resultSet.getString("description")).thenReturn("Redmi Note 3");
		
		
		
	}

	/**
	 * Test method for {@link com.shopping.businesslayer.ProductBusinessLayer#productDetailsGetter(com.shopping.bean.ProductBean)}.
	 * @throws SQLException 
	 */
	@Test
	public final void testProductDetails() throws SQLException 
	{
		
		
		ProductBean Product = productBusinessLayer.productDetailsGetter(new ProductBean());
        
        assertEquals(Product.getProductId(), "A001");
        assertEquals(Product.getProductName(), "Mobile");
        assertEquals(Product.getUnitPrice(), "15000.0");
        assertEquals(Product.getDescription(), "Redmi Note 3");


	}

}
