/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.ProductImageBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ProductImageRepository extends MongoRepository<ProductImageBean, String> {
	
	public ProductImageBean findByProductId(String productId);

}
