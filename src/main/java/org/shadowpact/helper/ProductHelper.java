/**
 * 
 */
package org.shadowpact.helper;

import java.util.ArrayList;
import java.util.List;

import org.shadowpact.bean.ItemBean;
import org.shadowpact.bean.PriceBean;
import org.shadowpact.bean.ProductBean;
import org.shadowpact.bean.ProductItemBean;
import org.shadowpact.bean.ProductItemPriceResponseBean;
import org.shadowpact.repository.ItemRepository;
import org.shadowpact.repository.PriceRepository;
import org.shadowpact.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author raror3
 *
 */
@Component
public class ProductHelper {

	@Autowired
	private ProductItemRepository productItemRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private PriceRepository priceRepository;

	public List<String> getItemsFromProduct(String productId) {
		// System.out.println("Product ID: " + productId);
		List<String> itemList = new ArrayList<String>();
		List<ProductItemBean> productItemBeanList = productItemRepository.findByProductId(productId);
		if (null == productItemBeanList || productItemBeanList.isEmpty()) {
			return null;
		} else {
			for (ProductItemBean bean : productItemBeanList) {
				itemList.add(bean.getSkuId());
			}
		}
		return itemList;
	}

	public List<String> getPriceForItems(String productId) {
		// System.out.println("Product ID: " + productId);
		List<String> itemList = new ArrayList<String>();
		List<ProductItemBean> productItemBeanList = productItemRepository.findByProductId(productId);
		if (null == productItemBeanList || productItemBeanList.isEmpty()) {
			return null;
		} else {
			for (ProductItemBean bean : productItemBeanList) {
				itemList.add(bean.getSkuId());
			}
		}
		return itemList;
	}

	public List<ItemBean> getItems(List<String> itemIds) {
		List<ItemBean> itemBeanList = new ArrayList<ItemBean>();
		if (null == itemIds) {
			return null;
		} else {
			for (String skuId : itemIds) {
				ItemBean itemBean = itemRepository.findBySkuId(skuId);
				itemBeanList.add(itemBean);
			}
			return itemBeanList;
		}
	}

	public ProductItemPriceResponseBean calculateProductPrice(List<String> itemIds,
			ProductItemPriceResponseBean priceResponseBean) {
		if (null == itemIds || itemIds.isEmpty()) {
			return null;
		} else {
			String minPrice = "0";
			String maxPrice = "0";
			List<PriceBean> priceBeans = new ArrayList<PriceBean>();
			for (String skuId : itemIds) {
				System.out.println("SkuId: " + skuId);
				PriceBean priceBean = priceRepository.findBySkuId(skuId);
				System.out.println("Sku Price Bean: " + priceBean);
				if (null != priceBean) {
					priceBeans.add(priceBean);
				}
				if (null != priceBean.getItemPrice()) {
					System.out.println("minPrice: " + minPrice);
					if (null == minPrice || minPrice.equals("0") || minPrice.equals("0.0")) {
						minPrice = Double.toString(Double.parseDouble(priceBean.getItemPrice()));
					}
					minPrice = Double.toString(
							Math.min(Double.parseDouble(minPrice), Double.parseDouble(priceBean.getItemPrice())));
					maxPrice = Double.toString(
							Math.max(Double.parseDouble(maxPrice), Double.parseDouble(priceBean.getItemPrice())));
				}
				priceResponseBean.setItemPriceBean(priceBeans);
			}
			priceResponseBean.setProductPriceFrom(minPrice);
			priceResponseBean.setProductPriceTo(maxPrice);
			System.out.println("Price Response Bean: " + priceResponseBean);
		}
		return priceResponseBean;
	}

	public ProductBean populateSkuArray(ProductBean productBean) {
		if (null != productBean && null != productBean.getProductId()) {
			List<String> itemIds = getItemsFromProduct(productBean.getProductId());
			System.out.println(itemIds.toArray());
		}
		return productBean;
	}

}
