package com.servicemarket.customer.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//for auto increment
	@ApiModelProperty(notes = "Id of the customer")
	Integer customerId;
	@ApiModelProperty(notes = "name of the customer")
	String name;
	@ApiModelProperty(notes = "password of the customer")
	String password;
	@ApiModelProperty(notes = "email of the customer")
	String email;
	
	
	public Customer(Integer customerId, String name, String password, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public Customer() {
		
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}