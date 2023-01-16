package com.nitish.pojoclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserPojoClass {


	
	private Integer userId;
	private Integer id;
	private String title;
	
	@JsonProperty("completed")
	private String status;
	
	private String name;
}
