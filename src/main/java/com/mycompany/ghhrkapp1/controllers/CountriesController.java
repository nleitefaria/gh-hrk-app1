package com.mycompany.ghhrkapp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ghhrkapp1.entity.Countries;
import com.mycompany.ghhrkapp1.service.CountryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/country")
@Api(value="onlinestore", description="Countries data")
public class CountriesController 
{	
	@Autowired
	CountryService countryService;

    @ApiOperation(value = "List of Countries",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    ) 
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Countries> list(Model model)
    {
        Iterable<Countries> ret = countryService.listAll();
        return ret;
    }
    
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Countries> list(@PathVariable Integer page, Model model)
    {
        Page<Countries> ret = countryService.listAllPaged(page - 1);
        return ret;
    }

}
