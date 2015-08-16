/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.ProductBean;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.repository.ItemRepository;
import org.shadowpact.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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
	public ProductBean getProductDetails(@RequestParam(value = "productId") String productId) {
		System.out.println("User productId value as: " + productId);
		ProductBean productBean = productRepository.findByProductId(productId);
		if (null != productBean) {
			return productBean;
		} else {
			return new ProductBean(productId, null, null, null, null, null, null, null, null, null,
					configObj.getHttpResponseCodeNotFound(), configObj.getProductNotFound(),
					configObj.getProductNotFoundMessage());
		}
	}
	
	@RequestMapping("/loadProduct")
	public ProductBean setProduct(@RequestHeader(value = "productId") String productId, @RequestBody String productData) {
		System.out.println("ProductId value as: " + productId);
		
		ProductBean productBean = new ProductBean(productId, null, null, null, null, null, null, null, null, null,
				null, null, null);

		if (productRepository.exists(productId)) {
			productBean = productRepository.save(productBean);
			productBean = new ProductBean(productId, null, null, null, null, null, null, null, null, null,
					configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			productBean = productRepository.insert(productBean);
		}
		return productBean;
	}

}
