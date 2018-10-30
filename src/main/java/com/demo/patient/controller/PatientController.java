package com.demo.patient.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.tools.DocumentationTool.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.demo.patient.repository.PatientRepository;

import com.demo.patient.service.PatientService;

import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;
import com.demo.patient.exception.ResourceException;
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

	@RequestMapping(value = "/patient", params = { "page", "limit" }, method = RequestMethod.GET)
	public List<Patient> getAllPatient(@RequestParam(value = "page", required = true) int page,
			@RequestParam(value = "limit", required = true) int limit) {
		Page<Patient> patients = patientRepository.findAll(PageRequest.of(page, limit));
		return patients.getContent();

	}

	@RequestMapping(value = "/patient/{name}", params = { "page", "limit" }, method = RequestMethod.GET)
	public Page<Patient> getPatientByName(@PathVariable String name,
			@RequestParam(value = "page", required = true) int page,
			@RequestParam(value = "limit", required = true) int limit) {
		return patientService.getPatientDetailsByName(name, page, limit);
	}

	@RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
	public Patient retrievePatient(@PathVariable long id) {
		Optional<Patient> patient = patientRepository.findById(id);
		return patient.get();
	}

	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public ResponseEntity<Object> createPatient(@RequestBody Patient patient) {
		Patient savedPatient = patientRepository.save(patient);
		return new ResponseEntity<Object>(patient, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/patient/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePatient(@RequestBody Patient patient, @PathVariable long id) {
		Optional<Patient> patientOptional = patientRepository.findById(id);
		if (!patientOptional.isPresent())
			return ResponseEntity.notFound().build();
		patient.setid(id);
		patientRepository.save(patient);
		return new ResponseEntity<Object>(patient, HttpStatus.OK);

	}

	@RequestMapping(value = "/patientAddress", method = RequestMethod.GET)
	public List<PatientAddress> getAllPatientaddress() {
		return patientService.getPatientAddressDetails();
	}

	@RequestMapping(value = "/patientAddress/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePatientAddress(@RequestBody PatientAddress patientAddress,
			@PathVariable long id) {
		Optional<PatientAddress> PatientAddressOptional = patientAddressRepository.findById(id);
		if (!PatientAddressOptional.isPresent())
			return ResponseEntity.notFound().build();
		patientAddressRepository.save(patientAddress);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> patientDetails(@PathVariable Long id) {
		patientService.deletePatentDetails(id);
		return new ResponseEntity<Object>(id, HttpStatus.OK);

	}

	@RequestMapping(value = "/patientAddress", method = RequestMethod.POST)
	public ResponseEntity<Object> createPatientAddress(@RequestBody PatientAddress patientAddress) {
		PatientAddress savedPatientAddress = patientAddressRepository.save(patientAddress);
		return new ResponseEntity<Object>(patientAddress, HttpStatus.CREATED);

	}

}
