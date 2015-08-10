/**
 * 
 */
package org.shawowpact.repository;

import org.shawowpact.bean.Content;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author aamol
 *
 */
public interface ContentRepository extends MongoRepository<Content, String> {
	
	public Content findByContentID(String contentID);

}
