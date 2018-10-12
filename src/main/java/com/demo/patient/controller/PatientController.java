package com.demo.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.patient.model.Patient;

import com.demo.patient.repository.PatientRepository;
import com.demo.patient.service.PatientService;

@RestController
@RequestMapping(value = "/api")
public class PatientController {
	@Autowired
	PatientRepository PatientRepository;

	@Autowired
	PatientService patientService;

	@RequestMapping(value = "/Patient", method = RequestMethod.GET)
	public List<Patient> getAllPatient() {
		System.out.print("patient details" + patientService.getPatientDetails());
		return patientService.getPatientDetails();

	}

	
		

}
