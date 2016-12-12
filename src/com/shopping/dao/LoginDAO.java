package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.shopping.bean.LoginBean;
import com.shopping.constants.ShoppingConstants;
import com.shopping.util.DBConnection;


public class LoginDAO {


	//To authenticate if given username and password combination is correct by querying in database
	public String authenticateUser(LoginBean loginBean)  	//Passing loginBean object to authenticateUser() function
	{



		String username = loginBean.getUsername(); 		// Taking username value from loginBean and setting it in new string username . 
		String password = loginBean.getPassword();		// Taking password value from loginBean and setting it in new string password.
		if(username == null || username.isEmpty())		// if username is null or is empty
		{
			return ShoppingConstants.INVALID_CREDENTIALS;	
		}
		else if(password == null || password.isEmpty())	// if password is null or is empty then return .
		{
			return ShoppingConstants.INVALID_CREDENTIALS; 
		}

		Connection con = DBConnection.createConnection();		


		try
		{

			PreparedStatement st = con.prepareStatement("select COUNT(*) As total from logincustomer where username = ? AND password= ?");	//Query to check if there is any set of given username and password in database.
			st.setString(1, username);	//setting first value in preparedStatement
			st.setString(2, password);	//setting second value in preparedStatement


			ResultSet r1=st.executeQuery();	//Saving result of Executed Query.
			while(r1.next())	// Shifts the cursor to the next row of the result set from the database and returns true if there is any row, otherwise false
			{	
				if(r1.getInt("total")>0)	//If obtained result value is greater then 0 print success.
				{
					return ShoppingConstants.SUCCESS;
				}
				else	
				{
					return ShoppingConstants.INVALID_CREDENTIALS;
				}
			}

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
		return ShoppingConstants.INVALID_CREDENTIALS; 
	}
}
