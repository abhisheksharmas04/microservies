package com.example.demo.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.hypermedia.DiscoveredResource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public String getBillingInfo() {
		// find and get service instance of producer by using service Id
		List<ServiceInstance>serviceInstanceList = discoveryClient.getInstances("Billing-Service");
		// use first service instance from the list of instances
		ServiceInstance si = serviceInstanceList.get(0);
		//get Producer MS URI and make it url
		String url = si.getUri() + "/billing/info";
		//create rest template object
		RestTemplate template = new RestTemplate();
		//invoke producer MS service method or operation by generating Http call
		String res = template.getForObject(url,String.class);
		return res;
	}
}