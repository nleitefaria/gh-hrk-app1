package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.ghhrkapp1.dto.DepartmentsDTO;
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
    
    public Page<Departments> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
    
    @Transactional
    public Departments save(DepartmentsDTO departments) 
    {
        logger.debug("save called");
        return repository.save(new Departments(departments.getDepartmentId(), departments.getDepartmentName()));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }

}
