package com.elementsoftech.core.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long productNumber;
	private String productDescription;
	private int productQty;
	private Long productPrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItems(Long id, Long productNumber, String productDescription, int productQty, Long productPrice) {
		super();
		this.id = id;
		this.productNumber = productNumber;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", productNumber=" + productNumber + ", productDescription="
				+ productDescription + ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}
	
	
}