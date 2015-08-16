/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.ItemBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ItemRepository extends MongoRepository<ItemBean, String> {
	
	public ItemBean findBySkuId(String skuId);

}
