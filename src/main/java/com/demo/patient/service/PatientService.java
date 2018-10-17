package com.demo.patient.service;

import java.util.List;

import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;





public interface PatientService {
	
	public List<Patient> getPatientDetails();


	public void deletePatentDetails(long id);
	
	public List<PatientAddress> getPatientAddressDetails();


	public void deletePatientAddressDetails(long id);
	
	
	
	
	
	
	
}
