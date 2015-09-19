/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class ItemInventoryBean extends ResponseBean {

	@Id
	private final String skuId;
	private final int availableInventory;

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @return the availableInventory
	 */
	public int getAvailableInventory() {
		return availableInventory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemInventoryBean [skuId=" + skuId + ", availableInventory=" + availableInventory + "]";
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param skuId
	 * @param availableInventory
	 */
	public ItemInventoryBean(String skuId, int availableInventory, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.availableInventory = availableInventory;
	}

}
