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
public class ProductListBusinessLayer {
	ResultSet resultSet = null;

	public List<ProductBean> productListSet(ProductBean productBean) throws SQLException 	//Creating  List type function
	{
		resultSet = new ProductDAO().productListGetter();	//Setting the resultSet with resultSet obtained in ProductDAO class.
		List<ProductBean> products = new ArrayList<ProductBean>();

		while (resultSet.next())
		{
			
			productBean.setProductId(resultSet.getString("productId"));		//Setting resultSet productId into ProductBean's productId
			productBean.setProductName(resultSet.getString("productName"));		//Setting resultSet productName into ProductBean's productName
			productBean.setUnitPrice(resultSet.getDouble("unitPrice"));		//Setting resultSet unitPrice into ProductBean's unitPrice
			products.add(productBean);		//Add to list
		}
		
		return products;

	}
}
