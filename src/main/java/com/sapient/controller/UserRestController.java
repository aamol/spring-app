/**
 * 
 */
package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.bean.User;
import com.sapient.repository.UserRepository;

/**
 * @author raror3
 *
 */
@RestController
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/userlogin")
	public User getUserDetails(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password) {
		System.out.println("User email value as: " + email);
		User userBean = userRepository.findByEmailAndPassword(email, password);

		return userBean;
	}

	@RequestMapping("/registerUser")
	    public String registerNewUser(@RequestParam(value="name") String name, @RequestParam(value="email") String email, 
	    		@RequestParam(value="password") String password) {
	     System.out.println("User details:: name: " + name + " email: " + email + " password: " + password);   
		 User userBean = new User(name, email, password);
		 userRepository.save(userBean);

		 return "200";
	    }

}
