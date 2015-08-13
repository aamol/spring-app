/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class User extends ResponseBean {
	
	@Id
	private String userId;
	private final String email;
	
	private final String firstName;
	private final String password;

	/**
	 * @return the name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + firstName + ", password=" + password + ", getFirstName()=" + getFirstName()
				+ ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getStatus()=" + getStatus()
				+ ", getStatusCode()=" + getStatusCode() + ", getErrorCode()=" + getErrorCode() + ", getErrorMessage()="
				+ getErrorMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param email
	 * @param firstName
	 * @param password
	 */
	public User(String firstName, String email, String password, String statusCode, String errorCode, String errorMessage,
			String status) {
		super(status, statusCode, errorCode, errorMessage);
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	}

}
