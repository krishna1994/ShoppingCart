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

	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	//using doPost method to pass values
	{
		//		System.out.println(request.getParameter("productId"));
		String productId = request.getParameter("productId");	// 
		ProductBean productBean = new ProductBean() ; 	//creating object of productBean
		productBean.setProductId(productId); 
		ProductFacade productFacade = new ProductFacade();
		try {
			productBean=productFacade.verifyProduct(productBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("productBean",productBean ); 
		request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);






	}
}
