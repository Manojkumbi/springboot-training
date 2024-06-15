package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class securitycontroller {
	@GetMapping(value = "/print")
	private String displayString() {
		return "welcome to my world hello 😎😎😍😘🥰🤔🤗😶🙄";
	}

}
