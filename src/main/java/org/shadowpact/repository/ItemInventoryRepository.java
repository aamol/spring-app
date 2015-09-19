/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.ItemInventoryBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface ItemInventoryRepository extends MongoRepository<ItemInventoryBean, String> {
	
	public ItemInventoryBean findBySkuId(String skuId);

}
