package com.elementsoftech.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elementsoftech.core.entity.ADdocuments;
import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.core.entity.ProductInfo;
import com.elementsoftech.core.serviceImpl.orderServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	private orderServiceImpl ser;
	
	@PostMapping("/saveOrder")
	public OrderHeader saveOrder(@RequestBody OrderHeader order) {
		
		OrderHeader addorder = ser.addOrder(order);
		 ADdocuments aDcocumetnsGenerateAndPersist = ser.ADDocumentGenerateAndPersist(order);
		 System.out.println(aDcocumetnsGenerateAndPersist);
		
		return addorder;
	}
	
	
	@PostMapping("/saveProduct")
	public ProductInfo addProduct(@RequestBody ProductInfo product) {
		ProductInfo addProduct = ser.addProduct(product);
		
		
		return addProduct;
	}
	@PutMapping("/OrderHeader/{POnumber}")
	public OrderHeader updateOrder(@RequestBody OrderHeader order , @PathVariable("POnumber") Long POnumber) {
		OrderHeader updateOrderHeader =ser.updateOrderHeader(order, POnumber);
	return updateOrderHeader;
}
}