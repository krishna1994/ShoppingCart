/**
 * 
 */
package com.shopping.bean;

/**
 * @author singhkri
 *
 */
public class CartItemsBean
{

	private Integer cartId;
	private String productId;
	private Integer quantity;
	private Double itemPrice;
	/**
	 * @return the cartId
	 */
	public Integer getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the itemPrice
	 */
	public Double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}