package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Employees;
import com.mycompany.ghhrkapp1.repositories.EmployeeRepository;
import com.mycompany.ghhrkapp1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private EmployeeRepository repository;

    public Iterable<Employees> listAll() 
    {
        return repository.findAll();
    }


}
