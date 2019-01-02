package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.ghhrkapp1.entity.Locations;
import com.mycompany.ghhrkapp1.repositories.LocationRepository;
import com.mycompany.ghhrkapp1.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService 
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private LocationRepository repository;

	@Override
	public Iterable<Locations> listAll() 
	{
		return repository.findAll();
	}

}
