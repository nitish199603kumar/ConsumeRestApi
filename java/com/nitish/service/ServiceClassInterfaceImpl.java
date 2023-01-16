package com.nitish.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nitish.entity.ApiEntity;
import com.nitish.pojoclass.UserPojoClass;
import com.nitish.repository.ApiRepository;

public class ServiceClassInterfaceImpl implements ServiceClassInterface
{

	@Autowired
	ApiRepository apiRepository;
	
	@Autowired
	ServiceClass serviceClass;
	
	
	
	@Override
	public UserPojoClass apiEntity()
	{
		
		UserPojoClass consumeApi  = serviceClass.consumeApi();
		
		List<UserPojoClass> lt=new ArrayList<UserPojoClass>();
		for(UserPojoClass lts:lt)
		{
			apiRepository.save();
				
		}
		
		return consumeApi;	
	}
	
	
	
}


