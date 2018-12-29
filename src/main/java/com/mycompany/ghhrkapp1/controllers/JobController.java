package com.mycompany.ghhrkapp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ghhrkapp1.entity.Departments;
import com.mycompany.ghhrkapp1.entity.Jobs;
import com.mycompany.ghhrkapp1.service.DepartmentService;
import com.mycompany.ghhrkapp1.service.JobService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/job")
@Api(value="onlinestore", description="Jobs data")
public class JobController {
	
	@Autowired
	JobService jobService;

    @ApiOperation(value = "List of Jobss",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Jobs> list(Model model)
    {
        Iterable<Jobs> ret = jobService.listAll();
        return ret;
    }

}
