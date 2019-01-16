package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.entity.Departments;

public interface DepartmentService 
{	
	Iterable<Departments> listAll();
	Page<Departments> listAllPaged(int page);

}
