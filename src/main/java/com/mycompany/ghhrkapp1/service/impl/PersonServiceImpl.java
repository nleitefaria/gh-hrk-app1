package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Locations;
import com.mycompany.ghhrkapp1.entity.Persons;
import com.mycompany.ghhrkapp1.repositories.PersonRepository;
import com.mycompany.ghhrkapp1.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService 
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private PersonRepository repository;

    public Iterable<Persons> listAll() 
    {
        return repository.findAll();
    }
    
    public Page<Persons> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }

}
