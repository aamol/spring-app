/**
 * 
 */
package org.shadowpact.bean;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class ProductItemBean extends ResponseBean {

	@Id
	private final String productId;
	private final String[] skuId;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @return the skuId
	 */
	public String[] getSkuId() {
		return skuId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductItemBean [productId=" + productId + ", skuId=" + Arrays.toString(skuId) + "]";
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param productId
	 * @param skuId
	 */
	public ProductItemBean(String productId, String[] skuId, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.productId = productId;
		this.skuId = skuId;
	}

}
