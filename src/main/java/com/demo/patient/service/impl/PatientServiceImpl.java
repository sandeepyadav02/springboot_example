package com.demo.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.patient.model.Patient;


import com.demo.patient.repository.PatientRepository;
import com.demo.patient.service.PatientService;

@Component
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientrepository;

	
	
	
	
	@Override
	public List<Patient> getPatientDetails() {
		
		return patientrepository.findAll();
		
	}


		
	}
	
				
	
