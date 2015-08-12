/**
 * 
 */
package org.shadowpact.helper;

import org.shadowpact.bean.User;
import org.shadowpact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author raror3
 *
 */
@Component
public class UserHelper {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean validateNewUser(String email) {
		boolean userExists = false;
		
		System.out.println("User email: " + email);
		User userBean = userRepository.findByEmail(email);
		System.out.println("Userbean: " + userBean);
		if (null == userBean || null == userBean.getEmail()) {
			userExists = false;
		} else {
			userExists = true;
		}
		return userExists; 
	}
}
