/*package com.demo.patient;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.h2.mvstore.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.demo.patient.entity.Patient;
import com.demo.patient.entity.PatientAddress;
import com.demo.patient.repository.PatientAddressRepository;
import com.demo.patient.repository.PatientRepository;
import com.demo.patient.service.PatientService;
import com.demo.patient.service.impl.PatientServiceImpl;

@RunWith(SpringRunner.class)
public class ServiceImplTest {

	@TestConfiguration
	static class PatientServiceImplTestContextConfiguration {

		@Bean
		public PatientService patientService() {
			return new PatientServiceImpl();
		}
	}

	@Autowired
	private PatientService patientService;

	@MockBean
	private PatientRepository patientRepository;

	@MockBean
	private PatientAddressRepository patientAddressRepository;

	
	
	 * @Test public void patientFoundTest() throws Exception { Patient first = new
	 * Patient(); first.setPname("deepak"); String name = "deepak"; Page<Patient>
	 * found = patientService.getPatientDetailsByName(name, 0, 1);
	 * Mockito.when(patientRepository.getPatientDetailsByName(Mockito.anyString(),
	 * PageRequest.of(Mockito.anyInt(), Mockito.anyInt()))).thenReturn(first);
	 * 
	 * assertEquals(((Patient) found).getname(), name);
	 * 
	 * }
	 

	@Test
	public void patientFindByIdTest() throws Exception {
		Patient first = new Patient();
		first.setPname("deepak");
		first.setPgender("male");
		first.setid(1l);
		long id = 1;

		Mockito.when(patientRepository.getOne(id)).thenReturn(first);
		assertEquals(patientRepository.getOne(id), first);
	}

	@Test
	public void deletePatientTest() throws Exception {
		Patient first = new Patient();
		first.setPname("deepak");
		first.setPgender("male");
		first.setid(1l);
		int id = 1;

		Mockito.when(patientRepository.getOne(1l)).thenReturn(first);
		Mockito.when(patientRepository.existsById(first.getid())).thenReturn(false);
		assertFalse(patientRepository.existsById(1l));

	}

	
	@Test
	public void deletePatientAddressTest() throws Exception {

		PatientAddress first = new PatientAddress();
		first.setAddress("nagpur");
		first.setType("primary");
		first.setAddress_id(1l);
		int id = 1;

		Mockito.when(patientAddressRepository.getOne(1l)).thenReturn(first);
		Mockito.when(patientAddressRepository.existsById(first.getAddress_id())).thenReturn(false);
		assertFalse(patientAddressRepository.existsById(1l));

	}
}
*/