
package com.example.transactionmanagement;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class Organisationservice 
{
	@Autowired
	private Employeeservice empservice;
	@Autowired
	private Insuranceservice inservice;
	
	@Transactional
	public void onboardemployee(Employee emp, Insurance ins)
	{
		empservice.saveEmployee(emp);
		if(ins.getHealthinsurancename().length() <=5)
		{
			throw new RuntimeErrorException(null, " error in insurance");
		}
		else
		{
			ins.setEmpid(emp.getEmpid());
			inservice.registerInsurance(ins);
		}
	}

}
