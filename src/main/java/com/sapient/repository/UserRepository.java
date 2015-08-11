/**
 * 
 */
package com.sapient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.bean.User;

/**
 * @author raror3
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByEmailAndPassword(String email, String password);

}
