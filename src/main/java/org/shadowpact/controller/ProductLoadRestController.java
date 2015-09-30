/**
 * 
 */
package org.shadowpact.controller;

import org.shadowpact.bean.ItemAttributeBean;
import org.shadowpact.bean.ItemInventoryBean;
import org.shadowpact.bean.PriceBean;
import org.shadowpact.bean.ProductBean;
import org.shadowpact.bean.ProductImageBean;
import org.shadowpact.bean.ProductItemBean;
import org.shadowpact.configurations.Configurations;
import org.shadowpact.helper.ProductHelper;
import org.shadowpact.repository.AttributeRepository;
import org.shadowpact.repository.ItemInventoryRepository;
import org.shadowpact.repository.PriceRepository;
import org.shadowpact.repository.ProductImageRepository;
import org.shadowpact.repository.ProductItemRepository;
import org.shadowpact.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raror3
 *
 */
@RestController
public class ProductLoadRestController {

	@Autowired
	private Configurations configObj;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductHelper productHelper;

	@Autowired
	private PriceRepository priceRepository;
	
	@Autowired
	private ProductItemRepository productItemRepository;

	@Autowired
	private ItemInventoryRepository itemInventoryRepository;
	
	@Autowired
	private ProductImageRepository productImageRepository;

	@Autowired
	private AttributeRepository attributeRepository;


	@RequestMapping("/loadProduct")
	public ProductBean loadProduct(@RequestHeader(value = "productId") String productId, @RequestHeader(value = "categoryId") String categoryId,
			@RequestHeader(value = "productName") String productName, @RequestHeader(value = "productDescription") String productDescription,
			@RequestHeader(value = "productDetail") String productDetail, @RequestHeader(value = "productSummary") String productSummary,
			@RequestHeader(value = "published") String published, @RequestHeader(value = "buyable") String buyable) {

		System.out.println("ProductId value as: " + productId);
		ProductBean productBean = new ProductBean(productId, categoryId, null, productName, productDescription, productDetail, productSummary, published, buyable, null, null, null, null);

		if (productRepository.exists(productId)) {
			productBean = productRepository.save(productBean);
			productBean = new ProductBean(productId, null, null, null, null, null, null, null, null, null,
					configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			productBean = productRepository.insert(productBean);
		}
		return productBean;
	}
	
	@RequestMapping("/loadItemPrice")
	public PriceBean loadItemPrice(@RequestHeader(value = "skuId") String skuId, @RequestHeader(value = "priceType") String priceType,
			@RequestHeader(value = "itemPrice") String itemPrice) {
		System.out.println("SkuId value as: " + skuId);
		
		PriceBean priceBean = new PriceBean(skuId, priceType, itemPrice, null, null, null, null, null, null);

		if (priceRepository.exists(skuId)) {
			priceBean = priceRepository.save(priceBean);
			priceBean = new PriceBean(skuId, priceType, itemPrice, null, null, null, configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			priceBean = priceRepository.insert(priceBean);
		}
		return priceBean;
	}

	@RequestMapping("/loadProductItemMap")
	public ProductItemBean loadProductItemMapping(@RequestHeader(value = "skuId") String skuId, @RequestHeader(value = "productId") String productId) {
		System.out.println("SkuId value as: " + skuId + " and productId value as: " + productId);
		
		double randomNum = Math.random()*10;
		int randomNumber = (int) randomNum;
		System.out.println(randomNumber);
		String productItemId = String.valueOf(randomNumber);
		ProductItemBean productItemBean = new ProductItemBean(productItemId, productId, skuId, null, null, null, null);

		if (productItemRepository.exists(productItemId)) {
			productItemBean = productItemRepository.save(productItemBean);
			productItemBean = new ProductItemBean(productItemId, productId, skuId, null, configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			productItemBean = productItemRepository.insert(productItemBean);
		}
		return productItemBean;
	}
	
	@RequestMapping("/loadItemInventory")
	public ItemInventoryBean loadItemInventory(@RequestHeader(value = "skuId") String skuId, @RequestHeader(value = "availableInventory") int availableInventory) {
		System.out.println("SkuId value as: " + skuId + " and Available Inventory value as: " + availableInventory);
		
		ItemInventoryBean itemInventoryBean = new ItemInventoryBean(skuId, availableInventory, null, null, null, null, null, null, null);

		if (itemInventoryRepository.exists(skuId)) {
			itemInventoryBean = itemInventoryRepository.save(itemInventoryBean);
			itemInventoryBean = new ItemInventoryBean(skuId, availableInventory, null, null, null, null, configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			itemInventoryBean = itemInventoryRepository.insert(itemInventoryBean);
		}
		return itemInventoryBean;
	}
	
	@RequestMapping("/loadProductImages")
	public ProductImageBean loadProductImages(@RequestHeader(value = "productId") String productId, @RequestHeader(value = "mainImageUrl") String mainImageUrl,
			@RequestHeader(value = "secondaryImageUrl1") String secondaryImageUrl1, @RequestHeader(value = "secondaryImageUrl2") String secondaryImageUrl2, 
			@RequestHeader(value = "secondaryImageUrl3") String secondaryImageUrl3, @RequestHeader(value = "secondaryImageUrl4") String secondaryImageUrl4) {
		System.out.println("ProductId value as: " + productId);
		
		ProductImageBean productImageBean = new ProductImageBean(productId, mainImageUrl, secondaryImageUrl1, secondaryImageUrl2, secondaryImageUrl3, secondaryImageUrl4, null, null, null, null);

		if (productImageRepository.exists(productId)) {
			productImageBean = productImageRepository.save(productImageBean);
			productImageBean = new ProductImageBean(productId, mainImageUrl, secondaryImageUrl1, secondaryImageUrl2, secondaryImageUrl3, secondaryImageUrl4, null, configObj.getHttpResponseCodeSuccess(), null, null);
		} else {
			productImageBean = productImageRepository.insert(productImageBean);
		}
		return productImageBean;
	}

	@RequestMapping("/loadItemAttributes")
	public ItemAttributeBean loadItemAttributes(@RequestHeader(value = "skuId") String skuId, @RequestBody ItemAttributeBean attributeJson) {
		System.out.println("Sku Id value as: " + skuId);

		String errorMessage = productHelper.validateAttributeJson(attributeJson);
		ItemAttributeBean attributeBean = null;
		if (null != errorMessage) {
			attributeBean = new ItemAttributeBean(null, null, null, null, null, null, configObj.getUserError(), configObj.getHttpResponseCodeSuccess(), configObj.getUserErrorCode(), errorMessage);
		} else {
			attributeBean = new ItemAttributeBean(attributeJson.getSkuId(), attributeJson.getSize(), attributeJson.getColor(), attributeJson.getFitType(), attributeJson.getMaterial(), attributeJson.getInventoryBean(), null, null, null, null);
			attributeBean = attributeRepository.save(attributeBean);
		}
		return attributeBean;
	}

}
