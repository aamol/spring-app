/**
 * 
 */
package org.shadowpact.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author raror3
 *
 */
@Component
@ConfigurationProperties(prefix="org.shadowpact.constants")
public class Configurations {
	private String httpResponseCodeSuccess;
	private String httpResponseCodeFailure;
	private String userExistsMessage;
	private String userExistsErrorCode;
	private String userSaveFailedErrorCode;
	private String httpResponseCodeNotFound;
	private String productNotFound;
	private String productNotFoundMessage;
	private String userError;
	private String userErrorCode;

	/**
	 * @return the userSaveFailedErrorCode
	 */
	public String getUserSaveFailedErrorCode() {
		return userSaveFailedErrorCode;
	}

	/**
	 * @param userSaveFailedErrorCode the userSaveFailedErrorCode to set
	 */
	public void setUserSaveFailedErrorCode(String userSaveFailedErrorCode) {
		this.userSaveFailedErrorCode = userSaveFailedErrorCode;
	}

	/**
	 * @return the userExistsErrorCode
	 */
	public String getUserExistsErrorCode() {
		return userExistsErrorCode;
	}

	/**
	 * @param userExistsErrorCode the userExistsErrorCode to set
	 */
	public void setUserExistsErrorCode(String userExistsErrorCode) {
		this.userExistsErrorCode = userExistsErrorCode;
	}

	/**
	 * @return the userExistsMessage
	 */
	public String getUserExistsMessage() {
		return userExistsMessage;
	}

	/**
	 * @param userExistsMessage the userExistsMessage to set
	 */
	public void setUserExistsMessage(String userExistsMessage) {
		this.userExistsMessage = userExistsMessage;
	}

	/**
	 * @return the httpResponseCodeFailure
	 */
	public String getHttpResponseCodeFailure() {
		return httpResponseCodeFailure;
	}

	/**
	 * @param httpResponseCodeFailure the httpResponseCodeFailure to set
	 */
	public void setHttpResponseCodeFailure(String httpResponseCodeFailure) {
		this.httpResponseCodeFailure = httpResponseCodeFailure;
	}

	public String getHttpResponseCodeSuccess() {
		return httpResponseCodeSuccess;
	}

	public void setHttpResponseCodeSuccess(String httpResponseCodeSuccess) {
		this.httpResponseCodeSuccess = httpResponseCodeSuccess;
	}

	/**
	 * @return the httpResponseCodeNotFound
	 */
	public String getHttpResponseCodeNotFound() {
		return httpResponseCodeNotFound;
	}

	/**
	 * @param httpResponseCodeNotFound the httpResponseCodeNotFound to set
	 */
	public void setHttpResponseCodeNotFound(String httpResponseCodeNotFound) {
		this.httpResponseCodeNotFound = httpResponseCodeNotFound;
	}

	/**
	 * @return the productNotFound
	 */
	public String getProductNotFound() {
		return productNotFound;
	}

	/**
	 * @param productNotFound the productNotFound to set
	 */
	public void setProductNotFound(String productNotFound) {
		this.productNotFound = productNotFound;
	}

	/**
	 * @return the productNotFoundMessage
	 */
	public String getProductNotFoundMessage() {
		return productNotFoundMessage;
	}

	/**
	 * @param productNotFoundMessage the productNotFoundMessage to set
	 */
	public void setProductNotFoundMessage(String productNotFoundMessage) {
		this.productNotFoundMessage = productNotFoundMessage;
	}

	/**
	 * @return the userError
	 */
	public String getUserError() {
		return userError;
	}

	/**
	 * @param userError the userError to set
	 */
	public void setUserError(String userError) {
		this.userError = userError;
	}

	/**
	 * @return the userErrorCode
	 */
	public String getUserErrorCode() {
		return userErrorCode;
	}

	/**
	 * @param userErrorCode the userErrorCode to set
	 */
	public void setUserErrorCode(String userErrorCode) {
		this.userErrorCode = userErrorCode;
	}
	
}
