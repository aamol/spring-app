/**
 * 
 */
package org.shadowpact.bean;

import org.springframework.data.annotation.Id;

/**
 * @author aamol
 *
 */
public class CountryBean extends ResponseBean {
	
	@Id
	private final String countryAbbr;
	private final String countryName;

	/**
	 * @return the countryAbbr
	 */
	public String getCountryAbbr() {
		return countryAbbr;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CountryBean [countryAbbr=" + countryAbbr + ", countryName=" + countryName + ", getCountryAbbr()="
				+ getCountryAbbr() + ", getCountryName()=" + getCountryName() + ", getStatus()=" + getStatus()
				+ ", getStatusCode()=" + getStatusCode() + ", getErrorCode()=" + getErrorCode() + ", getErrorMessage()="
				+ getErrorMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param countryAbbr
	 * @param countryName
	 */
	public CountryBean(String countryAbbr, String countryName, String status, String statusCode, 
			String errorCode, String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.countryAbbr = countryAbbr;
		this.countryName = countryName;
	}



}
