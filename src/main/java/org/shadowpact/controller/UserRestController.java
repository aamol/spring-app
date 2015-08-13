/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.User;
import org.shadowpact.bean.UserProfile;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.helper.UserHelper;
import org.shadowpact.repository.UserProfileRepository;
import org.shadowpact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raror3
 *
 */
@RestController
public class UserRestController {
	
	@Autowired
	private Configurations configObj;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired
	private UserHelper userHelper;

	@RequestMapping("/userLogin")
	public User getUserDetails(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password) {
		// System.out.println("User email value as: " + email);
		User userBean = userRepository.findByEmailAndPassword(email, password);
		if (null != userBean) {
			return userBean;
		} else {
			return new User(null, null, null, null, null, null, null);
		}
	}

	@RequestMapping("/registerUser")
    public User registerNewUser(@RequestParam(value="firstName") String firstName, @RequestParam(value="email") String email, 
    		@RequestParam(value="password") String password) {
		// System.out.println("User details:: firstName: " + firstName + " email: " + email);
		boolean userExists = userHelper.validateNewUser(email);
		User userBean = new User(firstName, email, password, null, null, null, null);
		if (!userExists) {
			userBean = userRepository.insert(userBean);
			userBean = new User(firstName, email, password, configObj.getHttpResponseCodeSuccess(), null, null, null);
	    } else {
	    	userBean = new User(firstName, email, password, configObj.getHttpResponseCodeSuccess(), configObj.getUserExistsErrorCode(), configObj.getUserExistsMessage(), null);
	    }
		return userBean;
    }

	@RequestMapping("/saveUserProfile")
	public User saveUserProfile(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password, @RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName, @RequestParam(value = "company") String company,
			@RequestParam(value = "street") String street, @RequestParam(value = "city") String city,
			@RequestParam(value = "zip") String zip, @RequestParam(value = "state") String state,
			@RequestParam(value = "country") String country, @RequestParam(value = "telephone") String telephone) {
		// System.out.println("User email value as: " + email);

		UserProfile userProfile = new UserProfile(firstName, lastName, company, street, city, zip, state, country, telephone, email, password, null, null, null, null);
		if (userRepository.exists(email)) {
			userProfile = userProfileRepository.save(userProfile);
			userProfile = new UserProfile(firstName, lastName, company, street, city, zip, state, country, telephone, email, password, configObj.getHttpResponseCodeSuccess(), null, null, null);
		} else {
			userProfile = userProfileRepository.insert(userProfile);
		}
		// TODO
		return null;
	}

}
