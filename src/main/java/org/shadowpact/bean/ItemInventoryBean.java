/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author raror3
 *
 */
public class ItemInventoryBean extends ResponseBean {

	@Id
	@JsonProperty( "skuId" )
	private String skuId;
	@JsonProperty( "availableInventory" )
	private int availableInventory;
	@JsonProperty( "inStock" )
	private String inStock;
	@JsonProperty( "outOfStockDate" )
	private String outOfStockDate;
	@JsonProperty( "firstInStockDate" )
	private String firstInStockDate;

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId
	 *            the skuId to set
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * @return the availableInventory
	 */
	public int getAvailableInventory() {
		return availableInventory;
	}

	/**
	 * @param availableInventory
	 *            the availableInventory to set
	 */
	public void setAvailableInventory(int availableInventory) {
		this.availableInventory = availableInventory;
	}

	/**
	 * @return the inStock
	 */
	public String getInStock() {
		return inStock;
	}

	/**
	 * @param inStock
	 *            the inStock to set
	 */
	public void setInStock(String inStock) {
		this.inStock = inStock;
	}

	/**
	 * @return the outOfStockDate
	 */
	public String getOutOfStockDate() {
		return outOfStockDate;
	}

	/**
	 * @param outOfStockDate
	 *            the outOfStockDate to set
	 */
	public void setOutOfStockDate(String outOfStockDate) {
		this.outOfStockDate = outOfStockDate;
	}

	/**
	 * @return the firstInStockDate
	 */
	public String getFirstInStockDate() {
		return firstInStockDate;
	}

	/**
	 * @param firstInStockDate
	 *            the firstInStockDate to set
	 */
	public void setFirstInStockDate(String firstInStockDate) {
		this.firstInStockDate = firstInStockDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemInventoryBean [skuId=" + skuId + ", availableInventory=" + availableInventory + ", inStock="
				+ inStock + ", outOfStockDate=" + outOfStockDate + ", firstInStockDate=" + firstInStockDate + "]";
	}

	/**
	 * @param skuId
	 * @param availableInventory
	 * @param inStock
	 * @param outOfStockDate
	 * @param firstInStockDate
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ItemInventoryBean(String skuId, int availableInventory, String inStock, String outOfStockDate,
			String firstInStockDate, String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.availableInventory = availableInventory;
		this.inStock = inStock;
		this.outOfStockDate = outOfStockDate;
		this.firstInStockDate = firstInStockDate;
	}

	/**
	 * 
	 */
	public ItemInventoryBean() {
	}

}
