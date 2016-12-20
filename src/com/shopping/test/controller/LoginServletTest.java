/**
 * 
 */
package com.shopping.test.controller;

import static org.junit.Assert.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;
import org.junit.*;

import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.controllers.LoginServlet;
import com.shopping.controllers.LoginServlet;
import com.shopping.facade.LoginFacade;

/**
 * @author kulkasur
 *
 */
public class LoginServletTest 
{
	@Mock
	HttpServletRequest request;

	@Mock
	HttpServletResponse response;

	@Mock
	RequestDispatcher rd;
	
	@Mock
	LoginFacade loginFacade;

	@InjectMocks
	LoginServlet loginServlet;
	
	ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);

	@Before
	public void setUp() 
	{
		
		MockitoAnnotations.initMocks(this);
		Mockito.when(request.getParameter("username")).thenReturn("admin");
		Mockito.when(request.getRequestDispatcher(Mockito.anyString())).thenReturn(rd);

	}

	@Test
	public void testDOPOST_True() throws Exception
	{
		assertEquals(request.getParameter("username"), "admin");

		Mockito.when(loginFacade.verifyLogin((LoginBean)Mockito.anyObject())).thenReturn(ShoppingConstants.SUCCESS);
		loginServlet.doPost(request, response);

		Mockito.verify(request).getRequestDispatcher(dispatcherArgument.capture());
		assertEquals("ProductList.jsp", dispatcherArgument.getValue());

		Mockito.verify(loginFacade, Mockito.times(1)).verifyLogin((LoginBean)Mockito.anyObject());

		Mockito.verify(request, Mockito.times(1)).getRequestDispatcher("ProductList.jsp");

	}


	@Test
	public void testDOPOST_False() throws Exception
	{

		Mockito.when(loginFacade.verifyLogin((LoginBean)Mockito.anyObject())).thenReturn(ShoppingConstants.INVALID_CREDENTIALS);
        
        loginServlet.doPost(request, response);
		
		Mockito.verify(request).getRequestDispatcher(dispatcherArgument.capture());
        assertEquals("Login.jsp", dispatcherArgument.getValue());
        
        Mockito.verify(loginFacade, Mockito.times(1)).verifyLogin((LoginBean)Mockito.anyObject());
        
        Mockito.verify(request, Mockito.times(1)).getRequestDispatcher("Login.jsp");


	}

}
