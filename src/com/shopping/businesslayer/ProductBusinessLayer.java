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
public class ProductBusinessLayer 
{

	ResultSet resultSet = null;


	public ProductBean productDetailsGetter(ProductBean productBean) throws SQLException 
		{

		resultSet = new ProductDAO().productGetter(productBean);
		while (resultSet.next()) {
			productBean.setProductId(resultSet.getString("productId"));
			productBean.setProductName(resultSet.getString("productName"));
			productBean.setUnitPrice(resultSet.getDouble("unitPrice"));
			productBean.setDescription(resultSet.getString("description"));
		}

		return productBean;
	}

}
