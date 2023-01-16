package com.nitish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.pojoclass.UserPojoClass;
import com.nitish.service.ServiceClass;
import com.nitish.service.ServiceClassInterfaceImpl;

@RestController
public class ApiRestController {
	
	@Autowired
	ServiceClass serviceClass;
	
	ServiceClassInterfaceImpl serviceClassInterfaceImpl;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage()
	{
		String msg="Welcome Nitish G";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/api")
	public ResponseEntity<UserPojoClass> getUrlData()
	{
		UserPojoClass consumeApi = serviceClass.consumeApi();
		return new ResponseEntity<UserPojoClass>(consumeApi,HttpStatus.OK);
	}
	
	@GetMapping("/apisave")
	public ResponseEntity<UserPojoClass> getUrlDataSave()
	{
		
		UserPojoClass apiEntity = serviceClassInterfaceImpl.apiEntity();
		
		return new ResponseEntity<>(apiEntity,HttpStatus.OK);
		
	}
	
	
}
