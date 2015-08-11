/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author aamol
 *
 */
public class User {
	
	@Id
	private final String email;
	
	private final String name;
	private final String password;


	/**
	 * @param name
	 * @param password
	 */
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
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

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + "]";
	}

}
