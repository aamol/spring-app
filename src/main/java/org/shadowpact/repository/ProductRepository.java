/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.ProductBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ProductRepository extends MongoRepository<ProductBean, String> {
	
	public ProductBean findByProductId(String productId);

}
