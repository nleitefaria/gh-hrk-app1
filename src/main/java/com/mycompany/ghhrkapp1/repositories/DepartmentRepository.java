package com.mycompany.ghhrkapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mycompany.ghhrkapp1.entity.Departments;

@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Departments, Integer>{

}
