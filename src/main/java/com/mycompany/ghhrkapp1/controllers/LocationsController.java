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

import com.mycompany.ghhrkapp1.dto.LocationsDTO;
import com.mycompany.ghhrkapp1.entity.Locations;
import com.mycompany.ghhrkapp1.service.LocationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/location")
@Api(value="hr", description="Locations data")
public class LocationsController {
	
	@Autowired
	LocationService locationService;

    @ApiOperation(value = "List of Locations",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )  
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Locations> list(Model model)
    {
        Iterable<Locations> ret = locationService.listAll();
        return ret;
    }
    
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Locations> list(@PathVariable Integer page, Model model)
    {
        Page<Locations> ret = locationService.listAllPaged(page - 1);
        return ret;
    }
    
    @ApiOperation(value = "Add a location")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody LocationsDTO locationDTO)
    {
    	locationService.save(locationDTO);
        return new ResponseEntity("Location saved successfully", HttpStatus.OK);
    }
    

}
