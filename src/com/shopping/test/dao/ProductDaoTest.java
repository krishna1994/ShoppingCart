/**
 * 
 */
package com.shopping.test.dao;

import org.junit.Test;

import com.shopping.bean.ProductBean;
import com.shopping.dao.ProductDAO;


public class ProductDaoTest
{

	@Test
	public void productDetailstest() {


		ProductDAO productDAO = new ProductDAO();
		ProductBean productBean = null;
		//		assertEquals("fail",productDAO.list());


		//		productBean = new ProductBean();
		//		productBean.setProductId(null);
		//		productBean.setProductName("Camera");;
		//		productBean.setUnitPrice(1500.00);;
		//		productBean.setDescription("Redmi 16gb");;
		//		assertEquals("fail",productDAO.productDetails(productBean));


		productBean = new ProductBean();
		productBean.setProductId("1234");
		productBean.setProductName("productName");
		productBean.setUnitPrice(1500.0);;
		productBean.setDescription("Redmi 16gb");;
	


	}

}
