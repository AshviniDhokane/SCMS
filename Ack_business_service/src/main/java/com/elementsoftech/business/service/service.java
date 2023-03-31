package com.elementsoftech.business.service;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.elementsoftech.core.entity.OrderHeader;


@Service
public class service {
	RestTemplate restTemplate = new RestTemplate();
	
	private Environment env;
	
	public OrderHeader saveOrder(OrderHeader ord) {
		
		String coreRoot = env.getProperty("api.core.root");
		
        String url=coreRoot+"/saveOrder";
		
		HttpHeaders heards = new HttpHeaders();
		heards.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<OrderHeader> entity = new HttpEntity<>(ord,heards);
		
		ResponseEntity<OrderHeader> response = restTemplate.exchange(url, HttpMethod.POST, entity,OrderHeader.class);
		return response.getBody();
	}

	

}
