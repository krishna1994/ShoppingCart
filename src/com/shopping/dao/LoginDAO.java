package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.util.DBConnection;


public class LoginDAO {
	ResultSet resultSet=null;
	Connection con =null;
	//To authenticate if given username and password combination is correct by querying in database
	public ResultSet authenticateUser(LoginBean loginBean)  	//Passing loginBean object to authenticateUser() function
	{


		String username = loginBean.getUsername(); 		// Taking username value from loginBean and setting it in new string username . 
		String password = loginBean.getPassword();		// Taking password value from loginBean and setting it in new string password.
		

		Connection con = DBConnection.createConnection();		


		try
		{

			PreparedStatement st = con.prepareStatement("select COUNT(*) As total from logincustomer where username = ? AND password= ?");	//Query to check if there is any set of given username and password in database.
			st.setString(1, username);	//setting first value in preparedStatement
			st.setString(2, password);	//setting second value in preparedStatement


			resultSet=st.executeQuery();	//Saving result of Executed Query.
			

		}
		catch(SQLException e)
		{
			e.printStackTrace();
			try {
				con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}
		return resultSet; 
	}
}
