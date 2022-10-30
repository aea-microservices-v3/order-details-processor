package com.aea.microservices.orderdetailsprocessor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderDetails
{
	@Id
	private String productId;
	private String productName;
	private String productDescription;
}
