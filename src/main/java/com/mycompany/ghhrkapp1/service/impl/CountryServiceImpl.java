package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Countries;
import com.mycompany.ghhrkapp1.repositories.CountryRepository;
import com.mycompany.ghhrkapp1.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private CountryRepository repository;

    public Iterable<Countries> listAll() 
    {
        return repository.findAll();
    }

}
