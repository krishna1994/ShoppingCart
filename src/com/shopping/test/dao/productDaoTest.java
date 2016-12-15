
package com.shopping.test.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.mysql.jdbc.PreparedStatement;
import com.shopping.dao.ProductDAO;
import com.shopping.util.DBConnection;

/**
 * @author singhkri
 *
 */
public class productDaoTest {

	@InjectMocks 
	ProductDAO productDAO;

	@Mock 
	DBConnection dbConnection;
	
	@Mock
	Connection connection;
	
	@Mock
	ResultSet resultSet;
	
	@Mock
	PreparedStatement preparedStatement;
	

	
	@Before
	public void setUp() throws SQLException {
		MockitoAnnotations.initMocks(this);
		Mockito.when(dbConnection.createConnection()).thenReturn(connection);
		Mockito.when(resultSet.next()).thenReturn(true, true, true, false);
		Mockito.when(connection.prepareStatement(Mockito.anyString())).thenReturn(preparedStatement);
		Mockito.when(preparedStatement.executeQuery()).thenReturn(resultSet);
		

	
	}

	@Test
	public void testProductListGetter() throws Exception 
	{
		
		ResultSet productList  = productDAO.productListGetter();
        assertEquals(productList.next(), true);
        assertEquals(productList.next(), true);
        assertEquals(productList.next(), true);
        assertEquals(productList.next(), false);

       
        Mockito.verify(preparedStatement.executeQuery(), Mockito.times(1));
		
		
	}
	

}




















