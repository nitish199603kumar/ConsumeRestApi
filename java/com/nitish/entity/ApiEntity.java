package com.nitish.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity

@Table(name="Api_Entity")
public class ApiEntity {

	@Id
	private Integer id;
	private Integer userId;
	
	private String title;
	
	@JsonProperty("completed")
	private String status;
	
	private String name;
}
