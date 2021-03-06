package com.mycompany.ghhrkapp1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ghhrkapp1.entity.Products;
import com.mycompany.ghhrkapp1.repositories.ProductRepository;
import com.mycompany.ghhrkapp1.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Products> listAllProducts() {
        logger.debug("listAllProducts called");
        return productRepository.findAll();
    }

    @Override
    public Products getProductById(Integer id) {
        logger.debug("getProductById called");
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Products saveProduct(Products product) {
        logger.debug("saveProduct called");
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        logger.debug("deleteProduct called");
        productRepository.deleteById(id);
    }
}
