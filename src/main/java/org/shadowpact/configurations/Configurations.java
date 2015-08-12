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

	public String getHttpResponseCodeSuccess() {
		return httpResponseCodeSuccess;
	}

	public void setHttpResponseCodeSuccess(String httpResponseCodeSuccess) {
		this.httpResponseCodeSuccess = httpResponseCodeSuccess;
	}
	
}
