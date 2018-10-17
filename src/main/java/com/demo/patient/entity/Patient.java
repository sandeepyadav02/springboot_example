package com.demo.patient.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")


public class Patient implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String gender;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private List<PatientAddress> patientAddress;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private List<PatientContact> patientContact;
	
	public List<PatientContact> getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(List<PatientContact> patientContact) {
		this.patientContact = patientContact;
	}
	public List<PatientAddress> getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(List<PatientAddress> patientAddress) {
		this.patientAddress = patientAddress;
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
