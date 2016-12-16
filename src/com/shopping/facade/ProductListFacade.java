/**
 * 
 */
package com.shopping.facade;

import java.sql.SQLException;
import java.util.List;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductListBusinessLayer;

/**
 * @author singhkri
 * 
 */
public class ProductListFacade 
{
	ProductListBusinessLayer productListBusinessLayer = null; 
	//ProductBean productBean;

	public List<ProductBean> productsCheck() throws SQLException 
	{
		productListBusinessLayer = new ProductListBusinessLayer(); 	//Calling ProductListBusinessLayer class 

		List<ProductBean> products = productListBusinessLayer.productListSet(); 	//Getting List from ProductBusinessLayer
		System.out.println("In productlistfacade");

		return products;
	}

}
