package com.elementsoftech.core.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elementsoftech.core.entity.ProductInfo;
@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, Integer>{
	public ProductInfo findByproductNumber(Long proNumer);
	

}
