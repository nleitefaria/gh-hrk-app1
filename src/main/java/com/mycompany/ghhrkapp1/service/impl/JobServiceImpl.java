package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Jobs;
import com.mycompany.ghhrkapp1.repositories.JobRepository;
import com.mycompany.ghhrkapp1.service.JobService;

@Service
public class JobServiceImpl implements JobService  
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private JobRepository repository;

	@Override
	public Iterable<Jobs> listAll() 
	{
		return repository.findAll();
	}

}
