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

import com.mycompany.ghhrkapp1.dto.DepartmentsDTO;
import com.mycompany.ghhrkapp1.entity.Departments;
import com.mycompany.ghhrkapp1.service.DepartmentService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/department")
@Api(value="hr")
public class DepartmentsController 
{	
	@Autowired
	DepartmentService departmentService;
  
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Departments>> list(Model model)
    {
        return new ResponseEntity(departmentService.listAll(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Page<Departments>> list(@PathVariable Integer page, Model model)
    {
        return new ResponseEntity(departmentService.listAllPaged(page - 1), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Departments> save(@RequestBody DepartmentsDTO departments)
    {     
        return new ResponseEntity(departmentService.save(departments), HttpStatus.CREATED);
    }

}
