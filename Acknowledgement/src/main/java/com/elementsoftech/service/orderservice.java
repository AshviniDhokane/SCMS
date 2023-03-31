package com.elementsoftech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elementsoftech.core.entity.OrderHeader;
@Service
public interface orderservice {
	public OrderHeader addorder(OrderHeader order);
	
	public List<OrderHeader> getAllOrders();
	
	public OrderHeader findById(int id);
	
	public void deleteById(int id);
	
	public OrderHeader updateById(OrderHeader order,Long id);
	
	
	
	
	

}
