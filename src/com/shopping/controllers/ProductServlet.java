package com.shopping.controllers;

import java.io.IOException;
import java.net.URI;
import java.security.Principal;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.CloseReason;
import javax.websocket.Extension;
import javax.websocket.MessageHandler;
import javax.websocket.MessageHandler.Partial;
import javax.websocket.MessageHandler.Whole;
import javax.websocket.RemoteEndpoint.Async;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import com.shopping.bean.ProductBean;
import com.shopping.facade.ProductFacade;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class ProductSerlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet
{
	ProductFacade productFacade = new ProductFacade();
	HttpSession session;
	Map m ;
	
	public ProductServlet() 
	{
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	//using doPost method to pass values
	{
		String productId = request.getParameter("productId");
		String username = request.getParameter("username");// 
		ProductBean productBean = new ProductBean() ; 	//creating object of productBean
		productBean.setProductId(productId); 
	//	ProductFacade productFacade = new ProductFacade();
		try 
		{
			productBean=productFacade.verifyProduct(productBean);
		} 
		catch (SQLException e) 
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		request.setAttribute("productBean",productBean ); 
		session= request.getSession(false);
		System.out.println("username"+username);
		//session.setAttribute("username",username);
		request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);



	}

}
