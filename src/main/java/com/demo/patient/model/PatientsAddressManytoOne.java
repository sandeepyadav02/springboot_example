package com.demo.patient.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="patientsAddressManytoOne")
public class PatientsAddressManytoOne implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Patient patient;
	private PatientAddress patientAddress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	@Access(AccessType.PROPERTY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "name", nullable =true, insertable = false, updatable = false)
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@Access(AccessType.PROPERTY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "city", nullable = true, insertable = false, updatable = false)
	public PatientAddress getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
	}
	
}
