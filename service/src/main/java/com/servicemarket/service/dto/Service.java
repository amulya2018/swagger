package com.servicemarket.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Service {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "Id for the service")
	Integer serviceId;
	@ApiModelProperty(notes = "name of the service")
	String name;
	@ApiModelProperty(notes = "cost of the service")
	Integer cost;
	@ApiModelProperty(notes = "description for the service")
	String description;
	
	public Service(Integer serviceId, String name, Integer cost, String description) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.cost = cost;
		this.description = description;
	}
	public Service() {
		
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
