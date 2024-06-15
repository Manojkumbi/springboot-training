package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountcontroller {
@Autowired
private accountservice accountservice;
@PostMapping(value="/post")

public accountcl createAccountcl(@RequestBody accountcl accobjAccountcl) {
    return accountservice.createAccountcl(accobjAccountcl);
}
@DeleteMapping(value="/del/{accountno}")
public String deleteaccount(@PathVariable(value="accountno")Integer accountno) {
    accountservice.deleteAccountcl(accountno);
    return "deleted";
}
@GetMapping(value ="/get")
public Iterable<accountcl> gettickets(@RequestBody accountcl accobjAccountcl) {
    return accountservice.getAccountcl();
}

@GetMapping(value ="/{accountno}")
public String getticket( @PathVariable(value="accountno")Integer accounInteger) {
    return (String) accountservice.getAccountcl(accounInteger);
}
}
