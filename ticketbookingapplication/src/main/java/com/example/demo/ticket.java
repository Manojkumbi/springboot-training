package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ticketid;
	private String  ticketholdername;
	private String Sourcesdesti;
	private String Destination;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public String getTicketholdername() {
		return ticketholdername;
	}
	public void setTicketholdername(String ticketholdername) {
		this.ticketholdername = ticketholdername;
	}
	public String getSourcesdesti() {
		return Sourcesdesti;
	}
	public void setSourcesdesti(String sourcesdesti) {
		Sourcesdesti = sourcesdesti;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	@Override
	public String toString() {
		return "ticket [ticketid=" + ticketid + ", ticketholdername=" + ticketholdername + ", Sourcesdesti="
				+ Sourcesdesti + ", Destination=" + Destination + "]";
	}
	public ticket(Integer ticketid, String ticketholdername, String sourcesdesti, String destination) {
		super();
		this.ticketid = ticketid;
		this.ticketholdername = ticketholdername;
		this.Sourcesdesti = sourcesdesti;
		this.Destination = destination;
	}
	public ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

}
