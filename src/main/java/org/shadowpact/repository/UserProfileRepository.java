/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.User;
import org.shadowpact.bean.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface UserProfileRepository extends MongoRepository<UserProfile, String> {
	
	public User findByEmail(String email);

}
