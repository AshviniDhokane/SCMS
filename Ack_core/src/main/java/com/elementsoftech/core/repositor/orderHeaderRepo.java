package com.elementsoftech.core.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elementsoftech.core.entity.OrderHeader;
@Repository
public interface orderHeaderRepo extends JpaRepository<OrderHeader, Long>{

}
