package com.mycompany.ghhrkapp1.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.dto.LocationsDTO;
import com.mycompany.ghhrkapp1.entity.Countries;
import com.mycompany.ghhrkapp1.entity.Locations;
import com.mycompany.ghhrkapp1.repositories.CountryRepository;
import com.mycompany.ghhrkapp1.repositories.LocationRepository;
import com.mycompany.ghhrkapp1.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService 
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private LocationRepository repository;
	
	@Autowired
    private CountryRepository repository1;

	@Override
	public Iterable<Locations> listAll() 
	{
		return repository.findAll();
	}
	
	public Page<Locations> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
	
	public Locations save(LocationsDTO locationsDTO) 
    {
    	Optional<Countries> country = repository1.findById(locationsDTO.getCountryId());
        return repository.save(new Locations(country.get(), locationsDTO.getStreetAddress(), locationsDTO.getPostalCode(), locationsDTO.getCity(), locationsDTO.getStateProvince()));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }

}
