/**
 * 
 */
package org.shadowpact.repository;

import java.util.ArrayList;

import org.shadowpact.bean.ProductItemBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ProductItemRepository extends MongoRepository<ProductItemBean, String> {
	
	public ArrayList<ProductItemBean> findByProductId(String productId);
	
	public ArrayList<ProductItemBean> findBySkuId(String skuId);

}
