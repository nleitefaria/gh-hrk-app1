package com.mycompany.ghhrkapp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ghhrkapp1.dto.CountriesDTO;
import com.mycompany.ghhrkapp1.entity.Countries;
import com.mycompany.ghhrkapp1.service.CountryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/country")
@Api(value="hr")
public class CountriesController 
{	
	@Autowired
	CountryService countryService;

    @ApiOperation(value = "List of Countries",response = Iterable.class)
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Countries> list(Model model)
    {
        Iterable<Countries> ret = countryService.listAll();
        return ret;
    }
    
    @ApiOperation(value = "List a page of Countries")
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Countries> list(@PathVariable Integer page, Model model)
    {
        Page<Countries> ret = countryService.listAllPaged(page - 1);
        return ret;
    }
    
    @ApiOperation(value = "Add a product")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody CountriesDTO countryDTO)
    {
    	countryService.save(countryDTO);
        return new ResponseEntity("Product saved successfully", HttpStatus.OK);
    }

}
