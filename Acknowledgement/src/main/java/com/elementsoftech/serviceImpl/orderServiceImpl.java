package com.elementsoftech.serviceImpl;


import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.service.orderservice;
@Service
public class orderServiceImpl implements orderservice{
	
	
	@Autowired
	private Environment env;
	
	RestTemplate restTemplate = new RestTemplate();
	

	@Override
	public OrderHeader addorder(OrderHeader order) {
		String root = env.getProperty("api.bs.root");
		
		String url=root+"/save";
		
		HttpHeaders heards = new HttpHeaders();
		heards.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<OrderHeader> entity = new HttpEntity<>(order,heards);
		
		ResponseEntity<OrderHeader> response = restTemplate.exchange(url, HttpMethod.POST, entity,OrderHeader.class);	
		
		//OrderHeader save = repo.save(order);
		
		return response.getBody();
	}

	@Override
	public List<OrderHeader> getAllOrders() {
		
		return null;
	}

	@Override
	public OrderHeader findById(int id) {
		
		
		return null;
		
	}

	@Override
	public void deleteById(int id) {
		
		
	}

	@Override
	public OrderHeader updateById(OrderHeader order, Long id) {
		
		return null;
	}



	
}		
	

	
		
	
