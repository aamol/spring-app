/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.ProductBean;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.repository.ItemRepository;
import org.shadowpact.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raror3
 *
 */
@RestController
public class ProductDisplayRestController {

	@Autowired
	private Configurations configObj;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ItemRepository itemRepository;

	@RequestMapping("/productDisplay")
	public ProductBean getUserDetails(@RequestParam(value = "productId") String productId) {
		// System.out.println("User productId value as: " + productId);
		ProductBean productBean = productRepository.findByProductId(productId);
		if (null != productBean) {
			return productBean;
		} else {
			return new ProductBean(productId, null, null, null, null, null, null, null, null, null,
					configObj.getHttpResponseCodeNotFound(), configObj.getProductNotFound(),
					configObj.getProductNotFoundMessage());
		}
	}

}
