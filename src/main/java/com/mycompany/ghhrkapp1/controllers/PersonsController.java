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
import com.mycompany.ghhrkapp1.dto.PersonsDTO;
import com.mycompany.ghhrkapp1.entity.Persons;
import com.mycompany.ghhrkapp1.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/person")
@Api(value="onlinestore", description="Persons data")
public class PersonsController 
{
	@Autowired
	PersonService personService;

    @ApiOperation(value = "List all Persons",response = Iterable.class)
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Persons> list(Model model){
        Iterable<Persons> ret = personService.listAll();
        return ret;
    }
    
    @ApiOperation(value = "List all Persons with pagination",response = Iterable.class)
    @RequestMapping(value = "/list/{page}", method= RequestMethod.GET, produces = "application/json")
    public Page<Persons> list(@PathVariable Integer page, Model model)
    {
        Page<Persons> ret = personService.listAllPaged(page - 1);
        return ret;
    }
    
    @ApiOperation(value = "Add a Person")
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity save(@RequestBody PersonsDTO personDTO)
    {
    	personService.save(personDTO);
        return new ResponseEntity("Person saved successfully", HttpStatus.CREATED);
    }

}
