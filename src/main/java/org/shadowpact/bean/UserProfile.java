/**
 * 
 */
package org.shadowpact.bean;

import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * @author aamol
 *
 */
public class UserProfile extends ResponseBean {
	
	@Id
	private String userProfileId;
	private final String email;
	
	/**
	 * FirstName
	 */
	private final String name;
	private final String lastName;
	private final String company;
	private final String street;
	private final String zip;
	private final List<String> state;
	private final List<String> country;
	private final String telephone;
	private final String password;

	/**
	 * @return the userProfileId
	 */
	public String getUserProfileId() {
		return userProfileId;
	}
	/**
	 * @param userProfileId the userProfileId to set
	 */
	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
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
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @return the state
	 */
	public List<String> getState() {
		return state;
	}
	/**
	 * @return the country
	 */
	public List<String> getCountry() {
		return country;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @return the FirstName
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
		return "UserProfile [userProfileId=" + userProfileId + ", email=" + email + ", name=" + name + ", lastName="
				+ lastName + ", company=" + company + ", street=" + street + ", zip=" + zip + ", state=" + state
				+ ", country=" + country + ", telephone=" + telephone + ", password=" + password
				+ ", getUserProfileId()=" + getUserProfileId() + ", getLastName()=" + getLastName() + ", getCompany()="
				+ getCompany() + ", getStreet()=" + getStreet() + ", getZip()=" + getZip() + ", getState()="
				+ getState() + ", getCountry()=" + getCountry() + ", getTelephone()=" + getTelephone() + ", getName()="
				+ getName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + "]";
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param email
	 * @param name String FirstName
	 * @param lastName
	 * @param company
	 * @param street
	 * @param zip
	 * @param state
	 * @param country
	 * @param telephone
	 * @param password
	 */
	public UserProfile(String name, String lastName, String company, String street, String zip, 
			List<String> state, List<String> country, String telephone, String email, String password, 
			String status, String statusCode, String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.company = company;
		this.street = street;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.telephone = telephone;
		this.password = password;
	}

}
