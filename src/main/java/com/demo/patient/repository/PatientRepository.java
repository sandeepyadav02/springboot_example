package com.demo.patient.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.patient.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
    @Query("select p from Patient p where name =:pname ")
	public Page<Patient> getPatientDetailsByName(String pname , Pageable pageable);
}
