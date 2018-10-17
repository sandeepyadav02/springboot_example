package com.demo.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_add")
public class PatientAddress {

	@Id
	@GeneratedValue
	private Long id;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String type;

	public Long getAddress_id() {
		return id;
	}

	public void setAddress_id(Long id) {
		this.id = id;
	}

}
