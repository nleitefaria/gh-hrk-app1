package com.mycompany.ghhrkapp1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mycompany.ghhrkapp1.entity.Products;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Products, Integer>{
}
