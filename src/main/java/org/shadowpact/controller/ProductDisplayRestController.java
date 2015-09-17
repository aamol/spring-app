/**
 * 
 */
package org.shadowpact.controller;

import java.util.List;

import org.shadowpact.bean.ProductBean;
import org.shadowpact.bean.ProductItemPriceResponseBean;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.helper.ProductHelper;
import org.shadowpact.repository.ItemRepository;
import org.shadowpact.repository.PriceRepository;
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
	private ProductHelper productHelper;

	@Autowired
	private PriceRepository priceRepository;

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

	@RequestMapping("/productPrice")
	public ProductItemPriceResponseBean getProductPrice(@RequestParam(value = "productId") String productId) {
		System.out.println("User productId value as: " + productId);
		List<String> itemIds = productHelper.getItemsFromProduct(productId);
		if (null != itemIds) {
			ProductItemPriceResponseBean priceResponseBean = new ProductItemPriceResponseBean(null, configObj.getHttpResponseCodeSuccess(), null, null);
			// List<ItemBean> itemBeanList = productHelper.getItems(itemIds);
			priceResponseBean = productHelper.calculateProductPrice(itemIds, priceResponseBean);
			// ProductItemPriceResponseBean priceResponseBean = new ProductItemPriceResponseBean(itemPriceBean, productPriceFrom, productPriceTo, status, statusCode, errorCode, errorMessage)
			return priceResponseBean;
		} else {
			return new ProductItemPriceResponseBean(null, configObj.getHttpResponseCodeNotFound(), 
					configObj.getProductNotFound(), configObj.getProductNotFoundMessage());
		}
	}

	@RequestMapping("/getItemsForProduct")
	public int getItemsForProduct(@RequestParam(value = "productId") String productId) {
		List<String> itemIds = productHelper.getItemsFromProduct(productId);
		if (null != itemIds) {
			return itemIds.size();
		}
		return 0;
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
