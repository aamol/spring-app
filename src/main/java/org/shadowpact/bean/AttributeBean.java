/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class AttributeBean extends ResponseBean {

	@Id
	private final String skuId;
	/**
	 * Attribute types: color,fit,material,size.
	 */
	private final String attributeType;
	private final String attributeId;
	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}
	/**
	 * @return the attributeType
	 */
	public String getAttributeType() {
		return attributeType;
	}
	/**
	 * @return the attributeId
	 */
	public String getAttributeId() {
		return attributeId;
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param skuId
	 * @param attributeType
	 * @param attributeId
	 */
	public AttributeBean(String skuId, String attributeType, String attributeId, String status,
			String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.attributeType = attributeType;
		this.attributeId = attributeId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AttributeBean [skuId=" + skuId + ", attributeType=" + attributeType + ", attributeId=" + attributeId
				+ "]";
	}

}
