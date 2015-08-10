/**
 * 
 */
package org.shawowpact.controller;

import org.shawowpact.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aamol
 *
 */
@RestController
public class UserRestController {
	
	 @RequestMapping("/user")
	    public User greeting(@RequestParam(value="name") String name) {
	        return new User(name,
	                            "password");
	    }

}
