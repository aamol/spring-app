/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aamol
 *
 */
@RestController
public class UserTestRestController {
	
	 @RequestMapping("/user")
	    public User greeting(@RequestParam(value="name") String name) {
		 return new User(name, null, "password", null, null, null, null);
	    }

}
