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

import com.mycompany.ghhrkapp1.dto.RegionsDTO;
import com.mycompany.ghhrkapp1.entity.Regions;
import com.mycompany.ghhrkapp1.service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/region")
@Api(value="hr", description="Regions data")
public class RegionsController 
{	
	@Autowired
    RegionService regionService;

    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Regions> list(Model model)
    {
        Iterable<Regions> ret = regionService.listAll();
        return ret;
    }
    
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Regions> list(@PathVariable Integer page, Model model)
    {
        Page<Regions> ret = regionService.listAllPaged(page - 1);
        return ret;
    }
    
    @ApiOperation(value = "Add a region")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody RegionsDTO regionsDTO)
    {
    	regionService.save(regionsDTO);
        return new ResponseEntity("Region saved successfully", HttpStatus.OK);
    }


}
