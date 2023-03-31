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
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String addressNum;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressNume() {
		return addressNum;
	}
	public void setAddressNume(String addressNume) {
		this.addressNum = addressNume;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Long id, String addressNume, String address1, String address2, String city, String state,
			String postalCode) {
		super();
		this.id = id;
		this.addressNum = addressNume;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressNume=" + addressNum + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
	}
	
	
	
}