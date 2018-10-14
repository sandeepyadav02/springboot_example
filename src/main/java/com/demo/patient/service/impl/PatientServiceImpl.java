package com.demo.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.patient.model.Patient;
import com.demo.patient.model.PatientAddress;
import com.demo.patient.model.PatientsAddressManytoOne;
import com.demo.patient.repository.PatientAddressRepository;
import com.demo.patient.repository.PatientRepository;
import com.demo.patient.repository.PatientsAddressManytoOneRepository;
import com.demo.patient.service.PatientService;

import com.demo.patient.repository.PatientsAddressManytoOneRepository;;
@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientrepository;

	@Autowired
	private PatientAddressRepository patientAddressRepository;
	
	@Autowired
	private PatientsAddressManytoOneRepository patientsAddressManytoOneRepository;
	
	@Override
	public List<Patient> getPatientDetails() {
		return patientrepository.findAll();
	}

	@Override
	public void deletePatentDetails(long id) {
		patientrepository.deleteById(id);
		return;
	}
	
	@Override
	public List<PatientAddress> getPatientAddressDetails() {
		return patientAddressRepository.findAll();
	}

	@Override
	public void deletePatientAddressDetails(long id) {
		patientAddressRepository.deleteById(id);
		return;
	}
	@Override
	public List<PatientsAddressManytoOne> getPatientsAddressManytoOneDetails() {
		return patientsAddressManytoOneRepository.findAll();
	}
	


	@Override
	public void deletePatientsAddressManytoOneDetails(long pid) {
		patientsAddressManytoOneRepository.deleteById(pid);
		return;	
	}
	
}
