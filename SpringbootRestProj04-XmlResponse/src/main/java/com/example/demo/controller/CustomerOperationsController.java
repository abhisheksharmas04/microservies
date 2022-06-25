package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
@RequestMapping("/cst")
public class CustomerOperationsController {
	@GetMapping("/report")
	public Customer showData() {
		Customer cst = new Customer(101, "Raja", "hyd", 43378.99F);
		return cst;
	}

}
