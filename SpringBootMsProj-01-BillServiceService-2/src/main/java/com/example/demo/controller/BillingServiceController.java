package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	@GetMapping("/info")
	public String getBillInfo() {
		return "We accept card payment, UPI payment, Net Banking payment and COD";
	}
}
