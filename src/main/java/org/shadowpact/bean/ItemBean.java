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
	private final String itemSize;
	private final String itemColor;
	private final String itemMaterial;
	private final String itemFit;
	private final String published;
	private final String buyable;

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @return the itemSize
	 */
	public String getItemSize() {
		return itemSize;
	}

	/**
	 * @return the itemColor
	 */
	public String getItemColor() {
		return itemColor;
	}

	/**
	 * @return the itemMaterial
	 */
	public String getItemMaterial() {
		return itemMaterial;
	}

	/**
	 * @return the itemFit
	 */
	public String getItemFit() {
		return itemFit;
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
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param skuId
	 * @param itemName
	 * @param itemDescription
	 * @param itemSize
	 * @param itemColor
	 * @param itemMaterial
	 * @param itemFit
	 * @param published
	 * @param buyable
	 */
	public ItemBean(String skuId, String itemName, String itemDescription, String itemSize,
			String itemColor, String itemMaterial, String itemFit, String published, String buyable, String status,
			String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemSize = itemSize;
		this.itemColor = itemColor;
		this.itemMaterial = itemMaterial;
		this.itemFit = itemFit;
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
				+ itemDescription + ", itemSize=" + itemSize + ", itemColor=" + itemColor + ", itemMaterial="
				+ itemMaterial + ", itemFit=" + itemFit + ", published=" + published + ", buyable=" + buyable + "]";
	}

}
