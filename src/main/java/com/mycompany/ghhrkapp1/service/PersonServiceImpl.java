package com.mycompany.ghhrkapp1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.domain.Person;
import com.mycompany.ghhrkapp1.domain.Product;
import com.mycompany.ghhrkapp1.repositories.PersonRepository;
import com.mycompany.ghhrkapp1.repositories.ProductRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private PersonRepository personRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Iterable<Person> listAllPersons() {
        logger.debug("listAllPersons called");
        return personRepository.findAll();
    }

}
