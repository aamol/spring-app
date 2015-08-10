/**
 * 
 */
package org.shawowpact.bean;

/**
 * @author aamol
 *
 */
public class User {
	
	private final String name;
	private final String password;
	
	
	/**
	 * @param name
	 * @param password
	 */
	public User(String name, String password) {
		this.name = name;
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

}
