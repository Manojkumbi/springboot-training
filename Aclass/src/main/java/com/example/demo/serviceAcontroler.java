package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/service_a")
public class serviceAcontroler {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping()
	public String callserviceB() {
		String serveseresponceString=restTemplate.getForObject("http://localhost:8082/"+"api/service_b", String.class);
		return "message from a  and b says "+serveseresponceString;
	}
}
