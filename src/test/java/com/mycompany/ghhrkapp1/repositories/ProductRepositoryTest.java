package com.mycompany.ghhrkapp1.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mycompany.ghhrkapp1.configuration.RepositoryConfiguration;
import com.mycompany.ghhrkapp1.entity.Products;
import com.mycompany.ghhrkapp1.repositories.ProductRepository;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RepositoryConfiguration.class})
public class ProductRepositoryTest {
    private ProductRepository productRepository;
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Test
    public void testSaveProduct(){
        //setup product
        Products product = new Products();
        product.setDescription("Spring Framework Guru Shirt");
        product.setPrice(new BigDecimal("18.95"));
        product.setProductId("1234");
        //save product, verify has ID value after save
        assertNull(product.getId()); //null before save
        productRepository.save(product);
        assertNotNull(product.getId()); //not null after save
        //fetch from DB
        Products fetchedProduct = productRepository.findById(product.getId()).orElse(null);
        //should not be null
        assertNotNull(fetchedProduct);
        //should equal
        assertEquals(product.getId(), fetchedProduct.getId());
        assertEquals(product.getDescription(), fetchedProduct.getDescription());
        //update description and save
        fetchedProduct.setDescription("New Description");
        productRepository.save(fetchedProduct);
        //get from DB, should be updated
        Products fetchedUpdatedProduct = productRepository.findById(fetchedProduct.getId()).orElse(null);
        assertEquals(fetchedProduct.getDescription(), fetchedUpdatedProduct.getDescription());
        //verify count of products in DB
        long productCount = productRepository.count();
        assertEquals(productCount, 1);
        //get all products, list should only have one
        Iterable<Products> products = productRepository.findAll();
        int count = 0;
        for(Products p : products){
            count++;
        }
        assertEquals(count, 1);
    }
}
