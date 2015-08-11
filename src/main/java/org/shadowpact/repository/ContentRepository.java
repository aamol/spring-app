/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.Content;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author aamol
 *
 */
public interface ContentRepository extends MongoRepository<Content, String> {
	
	public Content findByContentID(String contentID);

}
