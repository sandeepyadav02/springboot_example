package com.demo.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;

public interface PatientService {

	Optional<Patient> getPatientDetailsById(long id);

	public void deletePatentDetails(long id);

	public List<PatientAddress> getPatientAddressDetails();

	public void deletePatientAddressDetails(long id);

	public Page<Patient> getPatientDetailsByName(String name, int page, int limit);

}
