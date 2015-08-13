/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author raror3
 *
 */
public class UserProfile extends ResponseBean {
	
	@Id
	private final String email;
	private final String firstName;
	private final String lastName;
	private final String company;
	private final String street;
	private final String city;
	private final String zip;
	private final String state;
	private final String country;
	private final String telephone;
	private final String password;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
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
		return "UserProfile [email=" + email + ", name=" + firstName + ", lastName="
				+ lastName + ", company=" + company + ", street=" + street + ", zip=" + zip + ", state=" + state
				+ ", country=" + country + ", telephone=" + telephone + ", password=" + password
				+ ", getLastName()=" + getLastName() + ", getCompany()="
				+ getCompany() + ", getStreet()=" + getStreet() + ", getZip()=" + getZip() + ", getState()="
				+ getState() + ", getCountry()=" + getCountry() + ", getTelephone()=" + getTelephone() + ", getFirstName()="
				+ getFirstName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + "]";
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param email
	 * @param firstName String FirstName
	 * @param lastName
	 * @param company
	 * @param street
	 * @param zip
	 * @param state
	 * @param country
	 * @param telephone
	 * @param password
	 */
	public UserProfile(String firstName, String lastName, String company, String street, String city, String zip, 
			String state, String country, String telephone, String email, String password, 
			String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.telephone = telephone;
		this.password = password;
	}

}
