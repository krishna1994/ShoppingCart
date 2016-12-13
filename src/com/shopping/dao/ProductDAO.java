package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.bean.ProductBean;
import com.shopping.util.DBConnection;

public class ProductDAO {

	Connection con = null;		//  Reference to connection object is deleted
	PreparedStatement statement = null;		//Refrence to Preparedstatement object is deleted
	ResultSet resultSet = null;		 //Refrence to ResultSet object is deleted

	public  ResultSet productListGetter() 
			throws SQLException {


		try {
			con = DBConnection.createConnection();	 // calling createConnection of DBConnectuion class in con
			statement = con.prepareStatement("SELECT ProductId, ProductName, UnitPrice,Description FROM productdetails");	//query to be executed
			resultSet = statement.executeQuery();	//saving execured query resultSet



		}finally{

			//				con.close();		//closing connection

		}
		System.out.println("DAO:"+resultSet.toString());

		return resultSet;
	}


	public  ResultSet productGetter(ProductBean productBean) throws SQLException 
	{

		try {
			String productId = productBean.getProductId();	//Assigning value of productId of productBean in string productId 
			con = DBConnection.createConnection();		// calling createConnection of DBConnectuion class in con
			statement = con.prepareStatement("SELECT ProductId, ProductName, UnitPrice,Description FROM productdetails where ProductId = ?");		//query to be executed
			statement.setString(1,  productId); 
			resultSet = statement.executeQuery();	//saving executed query resultSet


		}
		finally
		{
			//con.close();		//closing connection
		}

		return resultSet;

	}
}