package com.demo.patient.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.tools.DocumentationTool.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.demo.patient.repository.PatientRepository;

import com.demo.patient.service.PatientService;
import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;
import com.demo.patient.repository.PatientAddressRepository;





@RestController
@RequestMapping(value = "/api")
public class PatientController {
	@Autowired
	PatientRepository patientRepository;

	@Autowired
	PatientService patientService;
	
	@Autowired
	PatientAddressRepository patientAddressRepository;
	
	
	
	
	

	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public List<Patient> getAllPatient() {
		System.out.print("patient details" + patientService.getPatientDetails());
		return patientService.getPatientDetails();
	}
	
	
	@RequestMapping(value = "/PatientAddress", method = RequestMethod.GET)
	public List<PatientAddress> getAllPatientaddress() {
		System.out.print("patient details" + patientService.getPatientDetails());
		return patientService.getPatientAddressDetails();
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/PatientAddress/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePatientAddress(@RequestBody PatientAddress patientAddress, @PathVariable long id) {

		Optional<PatientAddress> PatientAddressOptional = patientAddressRepository.findById(id);

		if (!PatientAddressOptional.isPresent())
			return ResponseEntity.notFound().build();

		//patientAddress.setAddress_id(id);

		patientAddressRepository.save(patientAddress);

		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/Patient/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> patientDetails(@PathVariable Long id) {
		patientService.deletePatentDetails(id);
		return ResponseEntity.noContent().build();
	}
    


	
	
	@RequestMapping(value = "/Patient/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePatient(@RequestBody Patient patient, @PathVariable long id) {

		Optional<Patient> patientOptional = patientRepository.findById(id);

		if (!patientOptional.isPresent())
			return ResponseEntity.notFound().build();

		patient.setid(id);

		patientRepository.save(patient);

		return ResponseEntity.noContent().build();
	}

	
	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public ResponseEntity<Object> createPatient(@RequestBody Patient patient ) {
		Patient savedPatient = patientRepository.save(patient);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/patientAddress", method = RequestMethod.POST)
	public ResponseEntity<Object> createPatientAddress(@RequestBody PatientAddress patientAddress ) {
		PatientAddress savedPatientAddress = patientAddressRepository.save(patientAddress);
		return ResponseEntity.noContent().build();
	}
	
	
	

	
		

	
	

	}
    


