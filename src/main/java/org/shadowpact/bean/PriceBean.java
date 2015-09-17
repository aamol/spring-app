/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class PriceBean extends ResponseBean {

	@Id
	private final String skuId;
	private final String priceType;
	private final String itemPrice;
	private final String productPriceFrom;
	private final String productPriceTo;
	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}
	/**
	 * @return the priceType
	 */
	public String getPriceType() {
		return priceType;
	}
	/**
	 * @return the itemPrice
	 */
	public String getItemPrice() {
		return itemPrice;
	}
	/**
	 * @return the productPriceFrom
	 */
	public String getProductPriceFrom() {
		return productPriceFrom;
	}
	/**
	 * @return the productPriceTo
	 */
	public String getProductPriceTo() {
		return productPriceTo;
	}
	/**
	 * @param skuId
	 * @param priceType
	 * @param itemPrice
	 * @param productPriceFrom
	 * @param productPriceTo
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public PriceBean(String skuId, String priceType, String itemPrice, String productPriceFrom,
			String productPriceTo, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.priceType = priceType;
		this.itemPrice = itemPrice;
		this.productPriceFrom = productPriceFrom;
		this.productPriceTo = productPriceTo;
	}

}
