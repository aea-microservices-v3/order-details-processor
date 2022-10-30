package com.aea.microservices.orderdetailsprocessor.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aea.microservices.orderdetailsprocessor.model.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String>
{

}
