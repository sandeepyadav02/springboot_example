package com.demo.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.patient.model.PatientsAddressManytoOne;

public interface PatientsAddressManytoOneRepository extends JpaRepository<PatientsAddressManytoOne, Long> {

}
