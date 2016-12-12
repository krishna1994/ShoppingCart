package com.shopping.controllers;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.bean.LoginBean;
import com.shopping.bean.ProductBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.facade.LoginFacade;
import com.shopping.facade.ProductListFacade;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public LoginServlet() {
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	//using doPost method to pass values
	{
		System.out.println("Request");


		String username = request.getParameter("username");	//assigning username given by user to String username
		String password = request.getParameter("password"); //assigning password given by user to String password

		LoginBean loginBean = new LoginBean(); 	//creating object of loginBean

		loginBean.setUsername(username); 	//Using setter method of LoginBean class to set value of username.
		loginBean.setPassword(password);	//Using setter method of LoginBean class to set value of password.
		
		LoginFacade loginFacade = new LoginFacade(); //creating object of loginFacade
		ProductListFacade productListFacade = new ProductListFacade();
		List<ProductBean> products = null;
		String userValidate =  loginFacade.verifyLogin(loginBean);  	//Passing loginBean object to verifyLogin function of LoginFacade class.
		System.out.println("User Validate: "+userValidate);
		if(userValidate.equals(ShoppingConstants.SUCCESS))	//If  userValidate gives "SUCCESS" redirect to home.jsp 
		{

//			request.setAttribute("username", username); 
			
			try {
				products = productListFacade.productsCheck();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("products", products); 
			request.getRequestDispatcher("ProductList.jsp").forward(request, response);
		}

		else	//If userValidate returns error message,pass error message to Login.jsp
		{
			request.setAttribute("errMessage", userValidate); 
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}