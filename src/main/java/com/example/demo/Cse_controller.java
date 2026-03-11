package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cse_controller {
	
	@GetMapping("/add")
	public int cse_add() {
		return "WELCOME TO CSE STAFF HOME PAGE";
	}
}
