package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

public class Content extends ResponseBean {

	@Id
	private String id;

	private final String contentID;
	private final String contentData;

	/**
	 * @return the contentID
	 */
	public String getContentID() {
		return contentID;
	}

	/**
	 * @return the contentData
	 */
	public String getContentData() {
		return contentData;
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param id
	 * @param contentID
	 * @param contentData
	 */
	public Content(String contentID, String contentData, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.contentID = contentID;
		this.contentData = contentData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Content [id=" + id + ", contentID=" + contentID + ", contentData=" + contentData + ", getContentID()="
				+ getContentID() + ", getContentData()=" + getContentData() + ", getStatus()=" + getStatus()
				+ ", getStatusCode()=" + getStatusCode() + ", getErrorCode()=" + getErrorCode() + ", getErrorMessage()="
				+ getErrorMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param id
	 * @param contentID
	 * @param contentData
	 */
	/*
	 * public Content(String contentID, String contentData) { super(null, null,
	 * null, null); this.contentID = contentID; this.contentData = contentData;
	 * }
	 */
}
