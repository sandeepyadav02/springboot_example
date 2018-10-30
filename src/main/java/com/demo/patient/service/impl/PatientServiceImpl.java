package com.demo.patient.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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
	public Optional<Patient> getPatientDetailsById(long id) {
		return patientrepository.findById(id);

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
	public Page<Patient> getPatientDetailsByName(String name, int page, int limit) {
		return patientrepository.getPatientDetailsByName(name, PageRequest.of(page, limit));

	}

}
