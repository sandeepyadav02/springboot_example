package com.demo.patient.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")


public class Patient implements Serializable {
	
	@Id
	@GeneratedValue
	
	private Long id;
	private String name;
	private String gender;
	private int address_id;
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setPname(String name) {
		this.name = name;
	}
	public String getgender() {
		return gender;
	}
	public void setPgender(String gender) {
		this.gender = gender;
	}
	

}
