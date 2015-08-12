/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author aamol
 *
 */
public class User extends ResponseBean {
	
	@Id
	private String userId;
	private final String email;
	
	private final String name;
	private final String password;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", getName()=" + getName()
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
	 * @param name
	 * @param password
	 */
	public User(String name, String email, String password, String statusCode, String errorCode, String errorMessage,
			String status) {
		super(status, statusCode, errorCode, errorMessage);
		this.email = email;
		this.name = name;
		this.password = password;
	}

}
