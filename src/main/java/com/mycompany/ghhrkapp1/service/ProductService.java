package com.mycompany.ghhrkapp1.service;


import com.mycompany.ghhrkapp1.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
