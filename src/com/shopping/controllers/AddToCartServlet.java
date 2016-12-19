package com.shopping.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.bean.CartItemsBean;
import com.shopping.facade.CartItemsFacade;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToCartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String productId=request.getParameter("productId");
		int quantity=Integer.parseInt(request.getParameter("quantity"));

		CartItemsBean cartItemsBean=new CartItemsBean();
		cartItemsBean.setProductId(productId);
		cartItemsBean.setQuantity(quantity);

		CartItemsFacade cartItemsFacade=new CartItemsFacade();
		try 
		{
			cartItemsFacade.getCartItems();
		} 
		catch (Exception e) 
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);

		}


		request.getRequestDispatcher("mycart.jsp").forward(request, response);



	}

}
