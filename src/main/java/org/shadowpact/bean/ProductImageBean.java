/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class ProductImageBean extends ResponseBean {

	@Id
	private final String productId;
	private final String mainImageUrl;
	private final String secondaryImageUrl1;
	private final String secondaryImageUrl2;
	private final String secondaryImageUrl3;
	private final String secondaryImageUrl4;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @return the mainImageUrl
	 */
	public String getMainImageUrl() {
		return mainImageUrl;
	}

	/**
	 * @return the secondaryImageUrl1
	 */
	public String getSecondaryImageUrl1() {
		return secondaryImageUrl1;
	}

	/**
	 * @return the secondaryImageUrl2
	 */
	public String getSecondaryImageUrl2() {
		return secondaryImageUrl2;
	}

	/**
	 * @return the secondaryImageUrl3
	 */
	public String getSecondaryImageUrl3() {
		return secondaryImageUrl3;
	}

	/**
	 * @return the secondaryImageUrl4
	 */
	public String getSecondaryImageUrl4() {
		return secondaryImageUrl4;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductImageBean [productId=" + productId + ", mainImageUrl=" + mainImageUrl + ", secondaryImageUrl1="
				+ secondaryImageUrl1 + ", secondaryImageUrl2=" + secondaryImageUrl2 + ", secondaryImageUrl3="
				+ secondaryImageUrl3 + ", secondaryImageUrl4=" + secondaryImageUrl4 + "]";
	}

	/**
	 * @param productId
	 * @param mainImageUrl
	 * @param secondaryImageUrl1
	 * @param secondaryImageUrl2
	 * @param secondaryImageUrl3
	 * @param secondaryImageUrl4
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ProductImageBean(String productId, String mainImageUrl, String secondaryImageUrl1, String secondaryImageUrl2,
			String secondaryImageUrl3, String secondaryImageUrl4, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.productId = productId;
		this.mainImageUrl = mainImageUrl;
		this.secondaryImageUrl1 = secondaryImageUrl1;
		this.secondaryImageUrl2 = secondaryImageUrl2;
		this.secondaryImageUrl3 = secondaryImageUrl3;
		this.secondaryImageUrl4 = secondaryImageUrl4;
	}

}
