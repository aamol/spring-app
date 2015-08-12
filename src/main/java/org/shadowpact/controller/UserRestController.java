/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.User;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.helper.UserHelper;
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
	private UserHelper userHelper;

	@RequestMapping("/userLogin")
	public User getUserDetails(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password) {
		System.out.println("User email value as: " + email);
		User userBean = userRepository.findByEmailAndPassword(email, password);
		if (null != userBean) {
			return userBean;
		} else {
			return new User(null, null, null, null, null, null, null);
		}
	}

	@RequestMapping("/registerUser")
    public User registerNewUser(@RequestParam(value="name") String name, @RequestParam(value="email") String email, 
    		@RequestParam(value="password") String password) {

		System.out.println("User details:: name: " + name + " email: " + email + " password: " + password);   
		boolean userExists = userHelper.validateNewUser(email);
		User userBean = new User(name, email, password, null, null, null, null);
		if (!userExists) {
			userBean = userRepository.save(userBean);
			System.out.println(userBean);
			userBean = new User(name, email, password, configObj.getHttpResponseCodeSuccess(), null, null, null);
	    } else {
	    	userBean = new User(name, email, password, configObj.getHttpResponseCodeSuccess(), null, configObj.getUserExistsMessage(), null);
	    }
		return userBean;
    }

	@RequestMapping("/saveUserProfile")
	public User saveUserProfile(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password) {
		System.out.println("User email value as: " + email);
		// TODO
		return null;
	}

}
