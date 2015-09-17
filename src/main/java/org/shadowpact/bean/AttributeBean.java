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
	private final String attributeId;
	/**
	 * Attribute types: color,fit,material,size.
	 */
	private final String attributeType;
	private final String attributeValue;
	private final String skuId;

	/**
	 * @return the attributeId
	 */
	public String getAttributeId() {
		return attributeId;
	}
	/**
	 * @return the attributeType
	 */
	public String getAttributeType() {
		return attributeType;
	}
	/**
	 * @return the attributeValue
	 */
	public String getAttributeValue() {
		return attributeValue;
	}
	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AttributeBean [attributeId=" + attributeId + ", attributeType=" + attributeType + ", attributeValue="
				+ attributeValue + ", skuId=" + skuId + "]";
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param attributeId
	 * @param attributeType
	 * @param attributeValue
	 * @param skuId
	 */
	public AttributeBean(String attributeId, String attributeType, String attributeValue, String skuId,
			String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.attributeId = attributeId;
		this.attributeType = attributeType;
		this.attributeValue = attributeValue;
		this.skuId = skuId;
	}

}
