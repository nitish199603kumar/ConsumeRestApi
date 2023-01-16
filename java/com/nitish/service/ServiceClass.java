package com.nitish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nitish.pojoclass.UserPojoClass;

@Service
public class ServiceClass {
	
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public ServiceClass(RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
	}

	String url="https://jsonplaceholder.typicode.com/todos/1";
	public UserPojoClass consumeApi()
	{
		return restTemplate.getForObject(url, UserPojoClass.class);
	}
}
