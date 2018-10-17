package com.demo.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.patient.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
