/**
 * 
 */
package org.shadowpact.bean;

import java.util.List;

/**
 * @author raror3
 *
 */
public class ProductItemPriceResponseBean extends ResponseBean {

	private List<PriceBean> itemPriceBean;
	private String productPriceFrom;
	private String productPriceTo;

	/**
	 * @return the priceBean
	 */
	public List<PriceBean> getItemPriceBean() {
		return itemPriceBean;
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
	 * @param itemPriceBean the itemPriceBean to set
	 */
	public void setItemPriceBean(List<PriceBean> itemPriceBean) {
		this.itemPriceBean = itemPriceBean;
	}

	/**
	 * @param productPriceFrom the productPriceFrom to set
	 */
	public void setProductPriceFrom(String productPriceFrom) {
		this.productPriceFrom = productPriceFrom;
	}

	/**
	 * @param productPriceTo the productPriceTo to set
	 */
	public void setProductPriceTo(String productPriceTo) {
		this.productPriceTo = productPriceTo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductItemPriceResponseBean [PriceBean=" + itemPriceBean + ", productPriceFrom=" + productPriceFrom
				+ ", productPriceTo=" + productPriceTo + "]";
	}

	public ProductItemPriceResponseBean(String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		// TODO Auto-generated constructor stub
	}

}
