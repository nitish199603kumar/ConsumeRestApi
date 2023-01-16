package com.nitish.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nitish.entity.ApiEntity;

@Repository
public interface ApiRepository extends CrudRepository<ApiEntity,Integer> {

	
	public ApiEntity save();
}
