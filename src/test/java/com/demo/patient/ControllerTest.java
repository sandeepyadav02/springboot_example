/*package com.demo.patient;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.demo.patient.controller.PatientController;
import com.demo.patient.entity.Patient;
import com.demo.patient.repository.PatientAddressRepository;
import com.demo.patient.repository.PatientRepository;
import com.demo.patient.service.PatientService;
import com.demo.patient.service.impl.PatientServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PatientController.class)
public class ControllerTest {

	@MockBean
	private PatientRepository patientRepository;
	
	@MockBean
	private PatientService patientService;
	
	@MockBean
	private PatientAddressRepository patientAddressRepository;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void createPatienttest() throws Exception {

		Patient first = new Patient();
		first.setPname("deepak");
		first.setPgender("male");
		first.setid(1l);

		String inputInJson = this.mapTojson(first);

		String Uri = "/api/patient";
		Mockito.when(patientRepository.save(Mockito.any(Patient.class))).thenReturn(first);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(Uri).accept(MediaType.APPLICATION_JSON)
				.content(inputInJson).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		MockHttpServletResponse response = result.getResponse();
		assertEquals(outputInJson, inputInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());

	}

	private String mapTojson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);

	}
}
*/