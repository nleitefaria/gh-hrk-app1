package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Departments;
import com.mycompany.ghhrkapp1.repositories.DepartmentRepository;
import com.mycompany.ghhrkapp1.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private DepartmentRepository repository;

    public Iterable<Departments> listAll() 
    {
        return repository.findAll();
    }

}
