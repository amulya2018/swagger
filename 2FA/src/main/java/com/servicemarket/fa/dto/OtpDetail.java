package com.servicemarket.fa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class OtpDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id for OTP ")
	Integer otpid;
	@ApiModelProperty(notes = "generated otp")
	String otpGen;
	@ApiModelProperty(notes = "name of the customer")
	String name;
	@ApiModelProperty(notes = "password of the customer")
	String password;
	@ApiModelProperty(notes = "email of the customer")
	String email;
	long timestamp;
	
	
	public OtpDetail(Integer otpid, String name, String password, String email, long timestamp) {
		super();
		this.otpid = otpid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.timestamp = timestamp;
	}
	
	public OtpDetail() {
		
	}
	
	public String getOtpGen() {
		return otpGen;
	}

	public void setOtpGen(String otpGen) {
		this.otpGen = otpGen;
	}

	public Integer getOtpid() {
		return otpid;
	}
	public void setOtpid(Integer otpid) {
		this.otpid = otpid;
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
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
