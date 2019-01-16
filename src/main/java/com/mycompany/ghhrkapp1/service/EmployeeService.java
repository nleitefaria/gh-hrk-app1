package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.entity.Employees;

public interface EmployeeService 
{
	Iterable<Employees> listAll();
	Page<Employees> listAllPaged(int page);

}
