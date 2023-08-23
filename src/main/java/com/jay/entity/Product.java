package com.jay.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	private String name;
	private Double price;
	private Integer qty;

}
