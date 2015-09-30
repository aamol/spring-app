/**
 * 
 */
package org.shadowpact.bean;

import java.util.List;

/**
 * @author raror3
 *
 */
public class ProductAttributeResponseBean extends ResponseBean {

	private String productId;
	private List<ItemAttributeBean> itemAttributeBeans;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the itemAttributeBeans
	 */
	public List<ItemAttributeBean> getItemAttributeBeans() {
		return itemAttributeBeans;
	}

	/**
	 * @param itemAttributeBeans
	 *            the itemAttributeBeans to set
	 */
	public void setItemAttributeBeans(List<ItemAttributeBean> itemAttributeBeans) {
		this.itemAttributeBeans = itemAttributeBeans;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductAttributeResponseBean [productId=" + productId + ", itemAttributeBeans=" + itemAttributeBeans
				+ "]";
	}

	/**
	 * @param productId
	 * @param itemAttributeBeans
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ProductAttributeResponseBean(String productId, List<ItemAttributeBean> itemAttributeBeans, String status,
			String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.productId = productId;
		this.itemAttributeBeans = itemAttributeBeans;
	}

}
