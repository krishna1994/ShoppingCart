package com.shopping.test.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;
import com.shopping.controllers.ProductServlet;
import com.shopping.facade.ProductFacade;

public class ProductServletTest 
{
	@Mock
	HttpServletRequest request;

	@Mock
	HttpServletResponse response;

	@Mock
	RequestDispatcher rd;
	
	@Mock
	ProductFacade productFacade;
	
	
	@Mock
	ProductBusinessLayer productBusinessLayer;
	
	@InjectMocks
	ProductServlet productServlet;
	
	ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
	
	@Before
	public void setUp() 
	{
		
		MockitoAnnotations.initMocks(this);
		Mockito.when(request.getParameter("productId")).thenReturn("A001");
		Mockito.when(request.getRequestDispatcher(Mockito.anyString())).thenReturn(rd);
		
	}

	@Test
	public void test() throws Exception
	{
		assertEquals(request.getParameter("productId"), "A001");

		when(productFacade.verifyProduct((ProductBean)Mockito.anyObject())).thenReturn((ProductBean)Mockito.anyObject());
		productServlet.doGet(request, response);

		Mockito.verify(request).getRequestDispatcher(dispatcherArgument.capture());
		assertEquals("ProductDetails.jsp", dispatcherArgument.getValue());

		Mockito.verify(productFacade, Mockito.times(1)).verifyProduct((ProductBean) Mockito.anyObject());

		Mockito.verify(request, Mockito.times(1)).getRequestDispatcher("ProductDetails.jsp");
	}

}
