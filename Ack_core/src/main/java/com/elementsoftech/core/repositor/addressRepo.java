package com.elementsoftech.core.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elementsoftech.core.entity.Address;
@Repository
public interface addressRepo extends JpaRepository<Address, Long> {

}
