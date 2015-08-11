/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByEmailAndPassword(String email, String password);

}
