package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Jobs;
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
	
	public Page<Locations> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }

}
