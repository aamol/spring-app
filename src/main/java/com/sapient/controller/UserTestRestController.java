/**
 * 
 */
package com.sapient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.bean.User;

/**
 * @author aamol
 *
 */
@RestController
public class UserTestRestController {
	
	 @RequestMapping("/user")
	    public User greeting(@RequestParam(value="name") String name) {
	     System.out.println("Name value as: " + name);   
		 return new User(name, null, "password");
	    }

}
