package com.pack.service;

import java.util.ArrayList;
import java.util.List;

import com.pack.dto.RegistrationDTO;
import com.pack.exception.SathyaBankException;

public class CustomerService {
	List<String> emailIdList=new ArrayList<String>();
	List<String> aadharIdList=new ArrayList<String>();
	
	public CustomerService() {
		emailIdList.add("asitpanda@gmail.com");
		aadharIdList.add("123123123456");
	}
	
	public boolean validate(RegistrationDTO dto) {
		if(isCustomerWithEmailIdExist(dto.getEmailId()) || isCustomerWithAadharIdExist(dto.getAadharId()))
			return false;
		else
			return true;
	}
	
	public boolean isCustomerWithEmailIdExist(String emailId) {
		if(emailIdList.contains(emailId))
			return true;
		else
			return false;
	}
	
	public boolean isCustomerWithAadharIdExist(String aadharId) {
		if(aadharIdList.contains(aadharId))
			return true;
		else
			return false;
	}
	 public boolean registerCustomerId(RegistrationDTO dto) {
		 
		 try {
			if(validate(dto))
				 return true;
			 else
				 throw new SathyaBankException("Customer already exist");
		} catch (SathyaBankException e) {
			System.out.println(e);
			return false;
		}
		 
		 
	 }
	
}
