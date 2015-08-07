/**
 * 
 */
package com.sapient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.bean.Content;

/**
 * @author aamol
 *
 */
public interface ContentRepository extends MongoRepository<Content, String> {
	
	public Content findByContentID(String contentID);

}
