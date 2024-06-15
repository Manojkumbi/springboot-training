package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/service_b")
public class Bcontroler {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping()
	private String printb() {
	    return "hello world from Class b";
	}
	public String callserviceA() {
		String serveseresponceString=restTemplate.getForObject("http://localhost:8081/"+"api/service_a", String.class);
		return "message from b  and a says "+serveseresponceString;
	}
	
}