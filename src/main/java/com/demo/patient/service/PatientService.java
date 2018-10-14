package com.demo.patient.service;

import java.util.List;


import com.demo.patient.model.Patient;
import com.demo.patient.model.PatientAddress;
import com.demo.patient.model.PatientsAddressManytoOne;



public interface PatientService {
	
	public List<Patient> getPatientDetails();


	public void deletePatentDetails(long id);
	
	public List<PatientAddress> getPatientAddressDetails();


	public void deletePatientAddressDetails(long id);
	
	public List<PatientsAddressManytoOne> getPatientsAddressManytoOneDetails();
	
	public void deletePatientsAddressManytoOneDetails(long id);
	
}
