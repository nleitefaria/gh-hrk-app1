package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Regions;
import com.mycompany.ghhrkapp1.repositories.RegionRepository;
import com.mycompany.ghhrkapp1.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private RegionRepository repository;

    public Iterable<Regions> listAll() 
    {
        return repository.findAll();
    }
    
    public Page<Regions> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }
	
	

}
