package com.demo.patient.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "patient")

public class Patient  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String gender;
	private Date dob;
	@CreationTimestamp
	private LocalDateTime createDateTime;
	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	public Date getdob() {
		return dob;
	}

	public void setAge(Date dob) {
		this.dob = dob;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	private String surname;
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