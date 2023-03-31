package com.elementsoftech.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elementsoftech.business.service.service;
import com.elementsoftech.core.entity.OrderHeader;


@RestController
public class bscontroller {
	@Autowired
	private service service;
	
	@PostMapping("/save")
	public OrderHeader home(@RequestBody OrderHeader order) {
		OrderHeader saveOrder = service.saveOrder(order);
		return saveOrder;
	}
	@GetMapping("/home")		
	public String home() {
		
		return "hello";
	}
	
}
