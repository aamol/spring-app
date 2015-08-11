/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.User;
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
	private UserRepository userRepository;

	@RequestMapping("/userlogin")
	public User getUserDetails(@RequestParam(value = "email") String email, 
			@RequestParam(value = "password") String password) {
		User userBean = userRepository.findByEmailAndPassword(email, password);
		return userBean;
	}

	@RequestMapping("/registerUser")
	    public String registerNewUser(@RequestParam(value="name") String name, @RequestParam(value="email") String email, 
	    		@RequestParam(value="password") String password) {
		 User userBean = new User(name, email, password);
		 userRepository.save(userBean);
		 return "200";
	    }

}
