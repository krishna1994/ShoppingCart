/**
 * 
 */
package com.shopping.businesslayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.bean.ProductBean;
import com.shopping.dao.ProductDAO;

/**
 * @author singhkri
 *
 */
public class ProductBusinessLayer {

	ResultSet resultSet = null; //Refrence to ResultSet is deleted


	public ProductBean productDetailsGetter(ProductBean productBean) throws SQLException 
		{

		resultSet = new ProductDAO().productGetter(productBean);	// Putting resultset of productDAO to object resultSet
		while (resultSet.next()) 
		{
			productBean.setProductId(resultSet.getString("productId"));		//setting productId of resultSet to productBean productId
			productBean.setProductName(resultSet.getString("productName"));		//setting productName of resultSet to productBean productName
			productBean.setUnitPrice(resultSet.getDouble("unitPrice"));		//setting unitPrice of resultSet to productBean unitPrice
			productBean.setDescription(resultSet.getString("description"));		//setting description of resultSet to productBean description
		}

		return productBean;
	}

}
