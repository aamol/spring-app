/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class ProductBean extends ResponseBean {

	@Id
	private final String productId;
	private final String categoryId;
	private String [] skuIdArr;
	private final String productName;
	private final String productDescription;
	private final String productDetail;
	private final String productSummary;
	private final String published;
	private final String buyable;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @return the productDetail
	 */
	public String getProductDetail() {
		return productDetail;
	}

	/**
	 * @return the productSummary
	 */
	public String getProductSummary() {
		return productSummary;
	}

	/**
	 * @return the published
	 */
	public String getPublished() {
		return published;
	}

	/**
	 * @return the buyable
	 */
	public String getBuyable() {
		return buyable;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @return the skuIdArr
	 */
	public String[] getSkuIdArr() {
		return skuIdArr;
	}

	/**
	 * @param skuIdArr the skuIdArr to set
	 */
	public void setSkuIdArr(String[] skuIdArr) {
		this.skuIdArr = skuIdArr;
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param productId
	 * @param productName
	 * @param productDescription
	 * @param productDetail
	 * @param productSummary
	 * @param published
	 * @param buyable
	 */
	public ProductBean(String productId, String categoryId, String [] skuIdArr, String productName, String productDescription,
			String productDetail, String productSummary, String published, String buyable, String status,
			String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.productId = productId;
		this.categoryId = categoryId;
		this.skuIdArr = skuIdArr;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productDetail = productDetail;
		this.productSummary = productSummary;
		this.published = published;
		this.buyable = buyable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productDetail=" + productDetail + ", productSummary=" + productSummary
				+ ", published=" + published + ", buyable=" + buyable + "]";
	}

}
