package com.mycompany.ghhrkapp1.service;


import com.mycompany.ghhrkapp1.entity.Products;

public interface ProductService {
    Iterable<Products> listAllProducts();

    Products getProductById(Integer id);

    Products saveProduct(Products product);

    void deleteProduct(Integer id);
}
