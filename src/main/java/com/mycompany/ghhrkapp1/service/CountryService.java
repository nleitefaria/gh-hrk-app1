package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.entity.Countries;

public interface CountryService 
{
	Iterable<Countries> listAll();
	Page<Countries> listAllPaged(int page);


}
