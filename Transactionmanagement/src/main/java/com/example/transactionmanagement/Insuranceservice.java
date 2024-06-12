package com.example.transactionmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Insuranceservice 
{
	@Autowired
	private Insurancedao insdao;
	
	public Insurance registerInsurance(Insurance ins)
	{
		return insdao.save(ins);
	}

}
