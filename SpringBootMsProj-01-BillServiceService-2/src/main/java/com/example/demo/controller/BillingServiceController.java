package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instaceId;

	@GetMapping("/info")
	public String getBillInfo() {
		return "We accept card payment, UPI payment, Net Banking payment and COD--port" + port + " instanceId: " + instaceId;
	}
}
