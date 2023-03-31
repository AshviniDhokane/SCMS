package com.elementsoftech.core.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elementsoftech.core.entity.ADdocuments;
import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.core.entity.OrderItems;
import com.elementsoftech.core.entity.ProductInfo;
import com.elementsoftech.core.repositor.ADdocumentsRepo;
import com.elementsoftech.core.repositor.ProductInfoRepo;
import com.elementsoftech.core.repositor.orderHeaderRepo;
import com.elementsoftech.core.repositor.orderItemsRepo;

import Service.orderService;


@Service
public class orderServiceImpl<RdDocuments> implements orderService {
	@Autowired
	private orderHeaderRepo repo;
	
	@Autowired
	private ProductInfoRepo productRepo;
	@Autowired
	private ADdocumentsRepo AdRepo;
	
	@Override
	public ProductInfo addProduct(ProductInfo product) {
		
		ProductInfo productInfo = productRepo.save(product);
		
		return productInfo;
		}
	 @Override
		public OrderHeader addOrder(OrderHeader order) {
			OrderHeader save = repo.save(order);
			return save;
		}

	@Override
	public ADdocuments ADDocumentGenerateAndPersist(OrderHeader order) {
		 ADdocuments aDdocuments = new ADdocuments();
			
			ProductInfo SNumber = productRepo.findByproductNumber(order.getOrderItems().getProductNumber());
			System.out.println(SNumber);
			if(SNumber.getProductQty()>=order.getOrderItems().getProductQty()) {
				aDdocuments.setAcknowledgementsType("AD");
				aDdocuments.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
				aDdocuments.setUserName(order.getUserName());
				aDdocuments.setOrderItems(order.getOrderItems());
				AdRepo.save(aDdocuments);
			}else {
				this.RDDocumentGenerateAndPersist(order);
			}
		return aDdocuments;
	}
	@Override
	public ADdocuments RDDocumentGenerateAndPersist(OrderHeader order) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public OrderHeader updateOrderHeader(OrderHeader order, Long pOnumber) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	

	/*public ADdocuments ADdocumetnsGenerateAndPersist(OrderHeader order) {
		 ADdocuments aDdocuments = new ADdocuments();
		
		ProductInfo SNumber = productRepo.findByproductNumber(order.getOrderItems().getProductNumber());
		System.out.println(SNumber);
		if(SNumber.getProductQty()>=order.getOrderItems().getProductQty()) {
			aDdocuments.setAcknowledgementsType("AD");
			aDdocuments.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
			aDdocuments.setUserName(order.getUserName());
			aDdocuments.setOrderItems(order.getOrderItems());
			AdRepo.save(aDdocuments);
			
		}else {
			aDdocuments.setAcknowledgementsType("RD");
			aDdocuments.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
			aDdocuments.setUserName(order.getUserName());
			aDdocuments.setOrderItems(order.getOrderItems());
			AdRepo.save(aDdocuments);
			
			
		}
		
		return aDdocuments;
	}
	
	public OrderHeader updateOrderHeader(OrderHeader order,Long POnumber) {
		
		order.setPurchaseOrderNumber(POnumber);
		
		OrderHeader updateOrder = repo.save(order);
		
		return updateOrder;*/
	

	

	
	


	
	


