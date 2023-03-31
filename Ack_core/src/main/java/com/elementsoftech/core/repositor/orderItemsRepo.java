package com.elementsoftech.core.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elementsoftech.core.entity.OrderItems;
@Repository
public interface orderItemsRepo extends JpaRepository<OrderItems, Long> {

}
