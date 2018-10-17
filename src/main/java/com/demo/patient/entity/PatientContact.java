package com.demo.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_contact")
public class PatientContact {
	
	@Id
	@GeneratedValue
	private long id;
	private String phone;
	private String type;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Long getAddress_id() {
		return id;
	}

	public void setAddress_id(Long id) {
		this.id = id;
	}

	

}
