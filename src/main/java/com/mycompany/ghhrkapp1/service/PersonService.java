package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.dto.PersonsDTO;
import com.mycompany.ghhrkapp1.entity.Persons;

public interface PersonService {
	
	Iterable<Persons> listAll();
	Page<Persons> listAllPaged(int page);
	Persons save(PersonsDTO personsDTO);
	
	

}
