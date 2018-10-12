package com.demo.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.patient.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
