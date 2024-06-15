package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountservice {
@Autowired
	private accountdao accountdao; 
	public accountcl createAccountcl(accountcl accobjAccountcl) {
		return accountdao.save(accobjAccountcl);
		
	}
	public String deleteAccountcl(Integer accountno) {
		 accountdao.deleteById(accountno);
		 return "delete";
		
	}
	public String getAccountcl(Integer accountno) {
		accountcl db = accountdao.findById(accountno).orElse(new accountcl());
		return "balance of "+db.getAccountholdername()+" is "+db.getBalance();
		
	}
	
	public Iterable<accountcl> getAccountcl() {
		return accountdao.findAll();
	}
	}
