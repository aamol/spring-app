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
	
}
