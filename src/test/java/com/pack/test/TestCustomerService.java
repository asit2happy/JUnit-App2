package com.pack.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pack.dto.RegistrationDTO;
import com.pack.service.CustomerService;

public class TestCustomerService {

	private static CustomerService service;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		service=new CustomerService();
	}
	
	@Test
	public void testRegisterCustomerValid() {
		
		RegistrationDTO dto=new RegistrationDTO();
		dto.setFirstName("john");
		dto.setLastName("philips");
		dto.setEmailId("john@gmail.com");
		dto.setAadharId("1231231234567");
		dto.setPanNumber("12354889");
		//fail("Not yet implemented");
		assertTrue(service.registerCustomerId(dto));
	}

	@Test
	public void testRegisterCustomerInValid() {
		
		RegistrationDTO dto=new RegistrationDTO();
		dto.setFirstName("john");
		dto.setLastName("philips");
		dto.setEmailId("asitpanda@gmail.com");
		dto.setAadharId("123123123456");
		dto.setPanNumber("12354889");
		//fail("Not yet implemented");
		assertFalse(service.registerCustomerId(dto));
	}
	
	@AfterClass
	public static void setUpAfterClass() {
		service=null;
	}
}
