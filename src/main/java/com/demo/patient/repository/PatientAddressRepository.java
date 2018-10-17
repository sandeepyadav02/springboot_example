package com.demo.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.patient.entity.PatientAddress;

public interface PatientAddressRepository extends JpaRepository<PatientAddress, Long>{

}
