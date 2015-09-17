/**
 * 
 */
package org.shadowpact.repository;

import java.util.List;

import org.shadowpact.bean.ProductItemBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ProductItemRepository extends MongoRepository<ProductItemBean, String> {
	
	public List<ProductItemBean> findByProductId(String productId);

}
