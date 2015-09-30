/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.ItemAttributeBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 */
public interface AttributeRepository extends MongoRepository<ItemAttributeBean, String> {
	
	public ItemAttributeBean findBySkuId(String skuId);
	/**
	 * TODO: Get data for item along with its inventory in it.
	 */

}
