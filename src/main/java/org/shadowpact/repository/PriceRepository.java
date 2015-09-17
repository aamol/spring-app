/**
 * 
 */
package org.shadowpact.repository;

import org.shadowpact.bean.PriceBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface PriceRepository extends MongoRepository<PriceBean, String> {
	
	public PriceBean findBySkuId(String skuId);

}
