package com.erdaoya.springcloud.trade.entity;

import lombok.Data;
import lombok.ToString;

/**
 *
 * @author erdaoya
 */
@Data
@ToString
public class Order {
    private Long id;
    private Double price;
    private Long customerId;
    private Long itemId;
    private Long sellerId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
    
    
}
