package com.shopping.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.bean.ProductBean;
import com.shopping.facade.ProductFacade;

/**
 * Servlet implementation class ProductSerlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet
{
	ProductFacade productFacade = new ProductFacade();
	
	public ProductServlet() 
	{
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	//using doPost method to pass values
	{
		String productId = request.getParameter("productId");	// 
		ProductBean productBean = new ProductBean() ; 	//creating object of productBean
		productBean.setProductId(productId); 
	//	ProductFacade productFacade = new ProductFacade();
		try 
		{
			productBean=productFacade.verifyProduct(productBean);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		request.setAttribute("productBean",productBean ); 
		request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);



	}
}
