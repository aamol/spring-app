/**
 * 
 */
package org.shadowpact.repository;

import java.util.List;

import org.shadowpact.bean.AttributeBean;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author raror3
 *
 */
public interface AttributeRepository extends MongoRepository<AttributeBean, String> {
	
	public List<AttributeBean> findBySkuId(String skuId);

}
