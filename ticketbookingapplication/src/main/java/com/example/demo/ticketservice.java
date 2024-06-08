package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ticketservice {
	@Autowired
	private ticketdao ticketda;
	public ticket Createticket(ticket ticketobj) {
		return ticketda.save(ticketobj);
		
	}


	public String Deleteticket(Integer ticketId) {
		ticketda.deleteById(ticketId);
		return "deleted";
		
	}
	
	public ticket getticket(Integer ticketId) {
		return ticketda.findById(ticketId).orElse(new ticket());
		
	}
	public Iterable<ticket> gettickets() {
		return ticketda.findAll();
	}
	public String deltickets() {
		 ticketda.deleteAll(gettickets());
		return "all data deleted";
	}
	public ticket updateticket(Integer ticketId,String newname,String newdest,String newsour) {
		ticket dbticket=getticket(ticketId);
		dbticket.setDestination(newdest);
		dbticket.setSourcesdesti(newsour);
		dbticket.setTicketholdername(newname);
		ticketda.save(dbticket);
		return dbticket;
		
		
	}
	
	
}
