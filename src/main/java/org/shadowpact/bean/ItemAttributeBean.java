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
public class ItemAttributeBean extends ResponseBean {

	@Id
	@JsonProperty( "size" )
	private String size;
	@JsonProperty( "color" )
	private String color;
	@JsonProperty( "fitType" )
	private String fitType;
	@JsonProperty( "skuId" )
	private String skuId;
	@JsonProperty( "material" )
	private String material;
	@JsonProperty( "inventory" )
	private ItemInventoryBean inventoryBean;

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the fitType
	 */
	public String getFitType() {
		return fitType;
	}

	/**
	 * @param fitType
	 *            the fitType to set
	 */
	public void setFitType(String fitType) {
		this.fitType = fitType;
	}

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
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the inventoryBean
	 */
	public ItemInventoryBean getInventoryBean() {
		return inventoryBean;
	}

	/**
	 * @param inventoryBean
	 *            the inventoryBean to set
	 */
	public void setInventoryBean(ItemInventoryBean inventoryBean) {
		this.inventoryBean = inventoryBean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemAttributeBean [size=" + size + ", color=" + color + ", fitType=" + fitType + ", skuId=" + skuId
				+ ", material=" + material + ", inventoryBean=" + inventoryBean + "]";
	}

	/**
	 * @param skuId
	 * @param size
	 * @param color
	 * @param fitType
	 * @param material
	 * @param inventoryBean
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ItemAttributeBean(String skuId, String size, String color, String fitType, String material,
			ItemInventoryBean inventoryBean, String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.size = size;
		this.color = color;
		this.fitType = fitType;
		this.skuId = skuId;
		this.material = material;
		this.inventoryBean = inventoryBean;
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ItemAttributeBean() {
	}

}
