/**
 * 
 */
package org.shadowpact.bean;

/**
 * @author raror3
 *
 */
public class ItemResponseBean extends ResponseBean {

	private final String skuId;
	private PriceBean itemPriceBean;
	private ItemInventoryBean itemInventoryBean;
	private ItemAttributeBean itemAttributeBean;
	private ItemBean itemBean;

	/**
	 * @return the itemPriceBean
	 */
	public PriceBean getItemPriceBean() {
		return itemPriceBean;
	}

	/**
	 * @param itemPriceBean
	 *            the itemPriceBean to set
	 */
	public void setItemPriceBean(PriceBean itemPriceBean) {
		this.itemPriceBean = itemPriceBean;
	}

	/**
	 * @return the itemInventoryBean
	 */
	public ItemInventoryBean getItemInventoryBean() {
		return itemInventoryBean;
	}

	/**
	 * @param itemInventoryBean
	 *            the itemInventoryBean to set
	 */
	public void setItemInventoryBean(ItemInventoryBean itemInventoryBean) {
		this.itemInventoryBean = itemInventoryBean;
	}

	/**
	 * @return the itemAttributeBean
	 */
	public ItemAttributeBean getItemAttributeBean() {
		return itemAttributeBean;
	}

	/**
	 * @param itemAttributeBean
	 *            the itemAttributeBean to set
	 */
	public void setItemAttributeBean(ItemAttributeBean itemAttributeBean) {
		this.itemAttributeBean = itemAttributeBean;
	}

	/**
	 * @return the itemBean
	 */
	public ItemBean getItemBean() {
		return itemBean;
	}

	/**
	 * @param itemBean
	 *            the itemBean to set
	 */
	public void setItemBean(ItemBean itemBean) {
		this.itemBean = itemBean;
	}

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @param status
	 * @param statusCode
	 * @param errorCode
	 * @param errorMessage
	 * @param skuId
	 * @param itemPriceBean
	 * @param itemInventoryBean
	 * @param itemAttributeBean
	 * @param itemBean
	 */
	public ItemResponseBean(String skuId, PriceBean itemPriceBean, ItemInventoryBean itemInventoryBean,
			ItemAttributeBean itemAttributeBean, ItemBean itemBean, String status, String statusCode, String errorCode,
			String errorMessage) {
		super(status, statusCode, errorCode, errorMessage);
		this.skuId = skuId;
		this.itemPriceBean = itemPriceBean;
		this.itemInventoryBean = itemInventoryBean;
		this.itemAttributeBean = itemAttributeBean;
		this.itemBean = itemBean;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemResponseBean [skuId=" + skuId + ", itemPriceBean=" + itemPriceBean + ", itemInventoryBean="
				+ itemInventoryBean + ", itemAttributeBean=" + itemAttributeBean + ", itemBean=" + itemBean + "]";
	}

}
