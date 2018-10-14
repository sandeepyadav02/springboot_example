package com.demo.patient;

import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.patient.model.Patient;
import com.demo.patient.model.PatientAddress;

@SpringBootApplication
public class PatientApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}
}
		/*Patient patient = new Patient();
		patient.setPid(1l);
		patient.setPname("Peter");
		patient.setPgender("Male");
		patient.setAddress_id(1);

		PatientAddress patientAddress = new PatientAddress();
		patientAddress.setAddress_id(1l);
		patientAddress.setCity("Bangalore");
		patientAddress.setState("kartnataka");
		patientAddress.setStreet("Kempkodawa");
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure("application.properties");
			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
			Session session = sessionFactory.openSession();		
			Transaction tx = session.beginTransaction();
			session.save(patient);
			session.save(patientAddress);
			tx.commit();
			
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}8*/

