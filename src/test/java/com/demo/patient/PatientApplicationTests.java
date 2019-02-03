/*package com.demo.patient;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.patient.entity.Patient;
import com.demo.patient.repository.PatientRepository;

@RunWith(SpringRunner.class)
@DataJpaTest


public class PatientApplicationTests {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Test
	public void retrieveDetailsForPatientByName() throws Exception {
		
		Patient first = new Patient();
		first.setPname("deepak");
		first.setPgender("male");
		
		testEntityManager.persist(first);
		testEntityManager.flush();
		
		Page<Patient> found = patientRepository.getPatientDetailsByName(first.getname(), PageRequest.of(0, 1));
		assertEquals(((Patient) found).getname(),((Patient) found).getname().equals(first.getname()));

		
		
	}
	
	
}*/