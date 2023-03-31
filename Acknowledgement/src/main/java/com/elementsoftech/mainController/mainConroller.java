package com.elementsoftech.mainController;


import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.service.orderservice;

@RestController
public class mainConroller {
	private static Logger logger=Logger.getLogger(mainConroller.class);
	
	
	@Autowired
	private orderservice ord;
	
	@PostMapping("/orders")
	public ResponseEntity<OrderHeader> home(@RequestBody OrderHeader order) {
		OrderHeader orderh=null;
		try {
			logger.info("calling to addorder Method...");
			
			orderh = this.ord.addorder(order);
			
			return new ResponseEntity<>(orderh,HttpStatus.CREATED);
			
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
					
		
	}
	@GetMapping("/orders")
	public List<com.elementsoftech.core.entity.OrderHeader> getAllorders(){
		List<OrderHeader> allOrders = ord.getAllOrders();
		
		return allOrders;
	}
	
	@GetMapping("/orders/{id}")
	public OrderHeader getOrder(@PathVariable("id") int id) {
		
		OrderHeader findById = ord.findById(id);
		
		return findById;
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable("id") int id) {
		ord.deleteById(id);
	}
	@PutMapping("/orders/{id}")
	public OrderHeader updateOrder(@RequestBody OrderHeader order,@PathVariable("id")Long id) {
		OrderHeader updateById = ord.updateById(order, id);
		return updateById;
	}
	@GetMapping("/home")		
	public String home() {
		
		return "hello";
	}
	
	

}
