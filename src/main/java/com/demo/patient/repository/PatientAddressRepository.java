package com.demo.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.patient.model.PatientAddress;

public interface PatientAddressRepository extends JpaRepository<PatientAddress, Long>{

}
