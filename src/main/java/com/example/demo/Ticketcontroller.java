package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Ticketcontroller {
@Autowired
	private ticketservice ticketservive;
@PostMapping(value="/post")
public ticket Createticket(@RequestBody ticket ticketobj) {
    return ticketservive.Createticket(ticketobj);
}
@GetMapping(value ="/get")
public Iterable<ticket> gettickets(@RequestBody ticket ticketobj) {
    return ticketservive.gettickets();
}	
@DeleteMapping(value="/del")
public String Deleteticket(@RequestBody ticket ticketobj) {
    return ticketservive.Deleteticket(ticketobj);
}

@DeleteMapping(value="/delall")
public String delticket(@RequestBody ticket ticketobj) {
    return ticketservive.deltickets();
}

@GetMapping(value ="/{ticketId}")
public ticket getticket( @PathVariable(value="ticketId")Integer ticketId) {
    return ( ticket)ticketservive.getticket(ticketId);
}	

@PutMapping(value ="/{ticketId}/{newname}")
public ticket updateticket( @PathVariable(value="ticketId")Integer ticketId,@PathVariable(value="newname")String newname) {
    return ( ticket)ticketservive.updateticket(ticketId,newname);
}

}