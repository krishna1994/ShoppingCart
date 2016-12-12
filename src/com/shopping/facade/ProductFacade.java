/**
 * 
 */
package com.shopping.facade;

import java.sql.SQLException;

import com.shopping.bean.ProductBean;
import com.shopping.businesslayer.ProductBusinessLayer;
import com.shopping.constants.ShoppingConstants;

/**
 * @author singhkri
 *
 */
public class ProductFacade {



	public  ProductBean verifyProduct(ProductBean productBean) throws SQLException 
	{
		if (productBean==null)	//If productBean is null give Invalid product
		{
			return ShoppingConstants.INVALID_PRODUCT;
		}
		return new ProductBusinessLayer().productDetailsGetter(productBean);

	}



}
