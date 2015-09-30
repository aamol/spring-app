/**
 * 
 */
package org.shadowpact.bean;

/**
 * @author raror3
 *
 */
public class ResponseBean {
	
	private String status;
	private String statusCode;
	private String errorCode;
	private String errorMessage;

	public String getStatus() {
		return status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 */
	public ResponseBean(String status, String statusCode, String errorCode, String errorMessage) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * 
	 */
	public ResponseBean() {
		super();
	}
	
}
