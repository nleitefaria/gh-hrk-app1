package com.mycompany.ghhrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.ghhrkapp1.dto.LocationsDTO;
import com.mycompany.ghhrkapp1.entity.Locations;

public interface LocationService 
{
	Iterable<Locations> listAll();
	Page<Locations> listAllPaged(int page);
	Locations save(LocationsDTO locationsDTO);

}
