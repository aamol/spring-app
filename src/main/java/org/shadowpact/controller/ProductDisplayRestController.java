/**
 * 
 */
package org.shadowpact.controller;

import java.util.ArrayList;
import java.util.List;

import org.shadowpact.bean.ItemAttributeBean;
import org.shadowpact.bean.ProductAttributeResponseBean;
import org.shadowpact.bean.ProductBean;
import org.shadowpact.bean.ProductItemBean;
import org.shadowpact.bean.ProductItemPriceResponseBean;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.helper.ProductHelper;
import org.shadowpact.repository.AttributeRepository;
import org.shadowpact.repository.ProductItemRepository;
import org.shadowpact.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raror3
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
	private ProductItemRepository productItemRepository;

	@Autowired
	private AttributeRepository attributeRepository;

	@RequestMapping("/getProductDetails")
	public ProductBean getProductDetails(@RequestParam(value = "productId") String productId) {
		System.out.println("User productId value as: " + productId);
		ProductBean productBean = productRepository.findByProductId(productId);
		productBean = productHelper.populateSkuArray(productBean);
		if (null != productBean) {
			return productBean;
		} else {
			return new ProductBean(productId, null, null, null, null, null, null, null, null, null,
					configObj.getHttpResponseCodeNotFound(), configObj.getProductNotFound(),
					configObj.getProductNotFoundMessage());
		}
	}

	@RequestMapping("/getProductPrice")
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

	@RequestMapping("/getProductOptions")
	public ProductAttributeResponseBean getProductOptions(@RequestParam(value = "productId") String productId) {
		System.out.println("ProductId value as: " + productId);

		ProductAttributeResponseBean responseBean = new ProductAttributeResponseBean(productId, null, null, configObj.getHttpResponseCodeSuccess(), null, null);
		ArrayList<ProductItemBean> productItemBeanList = productItemRepository.findByProductId(productId);
		if (null == productItemBeanList || productItemBeanList.isEmpty()) {
			responseBean = new ProductAttributeResponseBean(productId, null, null, configObj.getHttpResponseCodeNotFound(), configObj.getProductNotFound(), configObj.getProductNotFoundMessage());
		} else {
			responseBean.setProductId(productId);
			ArrayList<ItemAttributeBean> attributeBeans = new ArrayList<ItemAttributeBean>();
			System.out.println("AttributeBeans" + attributeBeans);
			for (ProductItemBean itemBean : productItemBeanList) {
				System.out.println("Item Bean: " + itemBean);
				ItemAttributeBean attributeBean = attributeRepository.findBySkuId(itemBean.getSkuId());
				if (null != attributeBean) {
					attributeBeans.add(attributeBean);
				} else {
					System.out.println("ERROR!!!!!! " + attributeBean + " AttributeBean found as null");
				}
			}
			responseBean.setItemAttributeBeans(attributeBeans);
		}
		return responseBean;
	}	
}
