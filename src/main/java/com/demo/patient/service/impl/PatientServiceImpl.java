package com.demo.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;
import com.demo.patient.repository.PatientAddressRepository;

import com.demo.patient.repository.PatientRepository;

import com.demo.patient.service.PatientService;


@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientrepository;

	@Autowired
	private PatientAddressRepository patientAddressRepository;
	
	
	
	
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
	
	

}
