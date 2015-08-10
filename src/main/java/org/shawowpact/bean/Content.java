package org.shawowpact.bean;

import org.springframework.data.annotation.Id;

public class Content {

	@Id
	private String id;

	private final String contentID;
	private final String contentData;

	/**
	 * @param contentID
	 * @param contentData
	 */
	public Content(String contentID, String contentData) {
		this.contentID = contentID;
		this.contentData = contentData;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Content [id=" + id + ", contentID=" 
	+ contentID + ", contentData="
				+ contentData + "]";
	}

}
