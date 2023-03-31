package com.elementsoftech.core.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ADdocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private Long purchaseOrderNumber;
	private LocalDate documentsCreateDate;
	private String acknowledgementsType;
	@OneToOne
	private OrderItems orderItems;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public LocalDate getDocumentsCreateDate() {
		return documentsCreateDate;
	}
	public void setDocumentsCreateDate(LocalDate documentsCreateDate) {
		this.documentsCreateDate = documentsCreateDate;
	}
	public String getAcknowledgementsType() {
		return acknowledgementsType;
	}
	public void setAcknowledgementsType(String acknowledgementsType) {
		this.acknowledgementsType = acknowledgementsType;
	}
	public OrderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	public ADdocuments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ADdocuments(Long id, String userName, Long purchaseOrderNumber, LocalDate documentsCreateDate,
			String acknowledgementsType, OrderItems orderItems) {
		super();
		this.id = id;
		this.userName = userName;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.documentsCreateDate = documentsCreateDate;
		this.acknowledgementsType = acknowledgementsType;
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "ADdocuments [id=" + id + ", userName=" + userName + ", purchaseOrderNumber=" + purchaseOrderNumber
				+ ", documentsCreateDate=" + documentsCreateDate + ", acknowledgementsType=" + acknowledgementsType
				+ ", orderItems=" + orderItems + "]";
	}

}
