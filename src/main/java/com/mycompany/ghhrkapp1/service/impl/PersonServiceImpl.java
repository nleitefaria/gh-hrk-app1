package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.domain.Person;
import com.mycompany.ghhrkapp1.repositories.PersonRepository;
import com.mycompany.ghhrkapp1.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService 
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private PersonRepository repository;

    public Iterable<Person> listAll() 
    {
        return repository.findAll();
    }

}
