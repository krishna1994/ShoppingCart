/**
 * 
 */
package com.shopping.businesslayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.bean.ProductBean;
import com.shopping.dao.ProductDAO;

/**
 * @author singhkri
 * 
 */
public class ProductListBusinessLayer 
{
	ResultSet resultSet = null;
	ProductDAO productDAO=new ProductDAO();
	
	public List<ProductBean> productListSet() throws SQLException 	//Creating  List type function
	{			

		resultSet = productDAO.productListGetter();	//Setting the resultSet with resultSet obtained in ProductDAO class.
		List<ProductBean> products = new ArrayList<ProductBean>();
		ProductBean productBean = null;
		
		while (resultSet.next())
		{
			productBean = new ProductBean();
			productBean.setProductId(resultSet.getString("productId"));		//Setting resultSet productId into ProductBean's productId
			productBean.setProductName(resultSet.getString("productName"));		//Setting resultSet productName into ProductBean's productName
			productBean.setUnitPrice(resultSet.getDouble("unitPrice"));		//Setting resultSet unitPrice into ProductBean's unitPrice
			products.add(productBean);		                             //Add to list
			System.out.println("In productlistbusinesslayer2.....");

		}
		System.out.println("In productlistbusinesslayer");
		return products;

	}
}
