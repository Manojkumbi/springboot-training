package com.example.transactionmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice 
{
	@Autowired
	private Employeedao empdao;
	
	public Employee saveEmployee(Employee emp)
	{
		return empdao.save(emp);
	}

}
