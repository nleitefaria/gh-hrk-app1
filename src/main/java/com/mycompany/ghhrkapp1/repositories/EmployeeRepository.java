package com.mycompany.ghhrkapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mycompany.ghhrkapp1.entity.Employees;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
