/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class ItemBean extends ResponseBean {

	@Id
	private final String skuId;
	private final String itemName;
	private final String itemDescription;
	private final String published;
	private final String buyable;

//	private final String itemSize;
//	private final String itemColor;
//	private final String itemPrice;
//	private final String itemMaterial;
//	private final String itemFit;

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param skuId
	 * @param itemName
	 * @param itemDescription
	 * @param published
	 * @param buyable
	 */
	public ItemBean(String skuId, String itemName, String itemDescription, String published, String buyable, 
			String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
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
		return "ItemBean [skuId=" + skuId + ", itemName=" + itemName + ", itemDescription="
				+ itemDescription + ", published=" + published + ", buyable=" + buyable + "]";
	}

}
