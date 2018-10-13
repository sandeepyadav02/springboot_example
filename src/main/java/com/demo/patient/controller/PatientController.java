package com.demo.patient.controller;

import java.net.URI;
import java.util.List;

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
    

	@RequestMapping(value = "/Patient{id}", method = RequestMethod.DELETE)
	public void deletepatient(@PathVariable long pid) {
		PatientRepository.deleteById(pid);
		

	}
	@RequestMapping(value = "/Patient", method = RequestMethod.POST)
	public ResponseEntity<Object> createPatient(@RequestBody Patient patient) {
		Patient savedPatient = PatientRepository.save(patient);
        return ResponseEntity.created(location).build();

	}
    
}
