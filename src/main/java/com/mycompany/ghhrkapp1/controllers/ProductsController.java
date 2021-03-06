package com.mycompany.ghhrkapp1.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mycompany.ghhrkapp1.entity.Products;
import com.mycompany.ghhrkapp1.service.ProductService;

@RestController
@RequestMapping("/product")
@Api(value="hr", description="Products data")
public class ProductsController 
{
	@Autowired
    ProductService productService;

    @ApiOperation(value = "List of Products",response = Iterable.class)
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Products> list(Model model)
    {
        Iterable<Products> ret = productService.listAllProducts();
        return ret;
    }
    
    @ApiOperation(value = "Search a product with an ID",response = Products.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Products showProduct(@PathVariable Integer id, Model model)
    {
       Products product = productService.getProductById(id);
        return product;
    }

    @ApiOperation(value = "Add a product")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveProduct(@RequestBody Products product)
    {
        productService.saveProduct(product);
        return new ResponseEntity("Product saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update a product")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody Products product)
    {
        Products storedProduct = productService.getProductById(id);
        storedProduct.setDescription(product.getDescription());
        storedProduct.setImageUrl(product.getImageUrl());
        storedProduct.setPrice(product.getPrice());
        productService.saveProduct(storedProduct);
        return new ResponseEntity("Product updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a product")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        productService.deleteProduct(id);
        return new ResponseEntity("Product deleted successfully", HttpStatus.OK);
    }
}