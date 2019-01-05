package com.mycompany.ghhrkapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mycompany.ghhrkapp1.entity.Countries;

@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Countries, String>
{

}
