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

import com.mycompany.ghhrkapp1.dto.JobsDTO;
import com.mycompany.ghhrkapp1.entity.Jobs;
import com.mycompany.ghhrkapp1.service.JobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/job")
@Api(value="onlinestore", description="Jobs data")
public class JobsController 
{	
	@Autowired
	JobService jobService;

    @ApiOperation(value = "List of Jobs", response = Iterable.class)
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Jobs> list(Model model)
    {
        Iterable<Jobs> ret = jobService.listAll();
        return ret;
    }
    
    @ApiOperation(value = "List a page of Jobs", response = Iterable.class)
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Jobs> list(@PathVariable Integer page, Model model)
    {
        Page<Jobs> ret = jobService.listAllPaged(page - 1);
        return ret;
    }
    
    @ApiOperation(value = "Add a job")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity save(@RequestBody JobsDTO jobDTO)
    {
    	jobService.save(jobDTO);
        return new ResponseEntity("Job saved successfully", HttpStatus.CREATED);
    }

}
