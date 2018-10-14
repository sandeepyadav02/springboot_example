package com.demo.patient.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_add")
public class PatientAddress {
	
	@Id
	@GeneratedValue
	private Long address_id;
	
	private String state;
	private String city;
	private String street;

	private String [] phoneNos;
	
	public String[] getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(String[] phoneNos) {
		this.phoneNos = phoneNos;
	}

	public Long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
}
