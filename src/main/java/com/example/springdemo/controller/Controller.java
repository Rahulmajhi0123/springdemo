package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
	@GetMapping("/home")
		public String fun() {
			return "hi rahul";
		}

}
