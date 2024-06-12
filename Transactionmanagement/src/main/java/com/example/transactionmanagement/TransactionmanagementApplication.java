package com.example.transactionmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionmanagementApplication implements CommandLineRunner 
{
	@Autowired
private Organisationservice orgservice;
	public static void main(String[] args)
	{
		SpringApplication.run(TransactionmanagementApplication.class, args);
	}
	
	public void run(String... args) throws Exception
	{
		Employee emp=new Employee();
		emp.setEmpname("Govi");
		Insurance ins=new Insurance();
		ins.setHealthinsurancename("bptest");
		ins.setCoverageamount(200000);
		orgservice.onboardemployee(emp, ins);
	}
}
