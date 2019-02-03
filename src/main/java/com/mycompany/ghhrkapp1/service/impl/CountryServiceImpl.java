package com.mycompany.ghhrkapp1.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.dto.CountriesDTO;
import com.mycompany.ghhrkapp1.entity.Countries;
import com.mycompany.ghhrkapp1.entity.Regions;
import com.mycompany.ghhrkapp1.repositories.CountryRepository;
import com.mycompany.ghhrkapp1.repositories.RegionRepository;
import com.mycompany.ghhrkapp1.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private CountryRepository repository;
	
	@Autowired
    private RegionRepository repository1;

    public Iterable<Countries> listAll() 
    {
        return repository.findAll();
    }
    
    public Page<Countries> listAllPaged(int page) 
    {
        return repository.findAll(gotoPage(page));
    }
    
    public Countries save(CountriesDTO countryDTO) 
    {
    	Optional<Regions> region = repository1.findById(countryDTO.getRegionId());
        return repository.save(new Countries(countryDTO.getCountryId(), region.get(), countryDTO.getCountryName()));
    }
    
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,10);
        return request;
    }

}
