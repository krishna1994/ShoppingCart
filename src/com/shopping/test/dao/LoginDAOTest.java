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
import com.shopping.bean.LoginBean;
import com.shopping.dao.LoginDAO;
import com.shopping.util.DBConnection;

/**
 * @author singhkri
 *
 */
public class LoginDAOTest {

	@InjectMocks 
	LoginDAO loginDAO;

	@Mock 
	DBConnection dbConnection;
	
	@Mock
	Connection connection;
	
	@Mock
	ResultSet resultSet;
	
	@Mock
	PreparedStatement preparedStatement;

	
	
	
	
	@Before
	public void setUp() throws SQLException 
	{
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(dbConnection.createConnection()).thenReturn(connection);
		Mockito.when(resultSet.next()).thenReturn(true, false);
		Mockito.when(connection.prepareStatement(Mockito.anyString())).thenReturn(preparedStatement);
		Mockito.when(preparedStatement.executeQuery()).thenReturn(resultSet);
		//Mockito.when(loginDAO.authenticateUser((LoginBean)Mockito.anyObject())).thenReturn(resultSet);


	
	}

	@Test
	public void testAuthenticateUser() throws Exception 
	{
		ResultSet loginSet  = loginDAO.authenticateUser(new LoginBean());
        assertEquals(loginSet.next(), true);
        assertEquals(loginSet.next(), false);

       
        Mockito.verify(preparedStatement.executeQuery(), Mockito.times(1));
		
		
	}
	

}
