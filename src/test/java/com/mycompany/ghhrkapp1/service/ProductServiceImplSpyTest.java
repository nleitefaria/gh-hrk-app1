package com.mycompany.ghhrkapp1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.mycompany.ghhrkapp1.entity.Products;
import com.mycompany.ghhrkapp1.repositories.ProductRepository;
import com.mycompany.ghhrkapp1.service.impl.ProductServiceImpl;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplSpyTest {
    @Spy
    private ProductServiceImpl prodServiceSpy;
    @Mock
    private ProductRepository productRepository;
    @Mock
    private Products product;

    @Test(expected=NullPointerException.class)
    public void shouldThrowNullPointerException_whenGetProductByIdIsCalledWithoutContext() throws Exception {
        //Act
        Products retrievedProduct = prodServiceSpy.getProductById(5);
        //Assert
        assertThat(retrievedProduct, is(equalTo(product)));
    }

    public void shouldThrowNullPointerException_whenSaveProductIsCalledWithoutContext() throws Exception {
        //Arrange
        Mockito.doReturn(product).when(productRepository).save(product);
        //Act
        Products savedProduct = prodServiceSpy.saveProduct(product);
        //Assert
        assertThat(savedProduct, is(equalTo(product)));
    }

    @Test
    public void shouldVerifyThatGetProductByIdIsCalled() throws Exception {
        //Arrange
        Mockito.doReturn(product).when(prodServiceSpy).getProductById(5);
        //Act
        Products retrievedProduct = prodServiceSpy.getProductById(5);
        //Assert
        Mockito.verify(prodServiceSpy).getProductById(5);
    }
    @Test
    public void shouldVerifyThatSaveProductIsNotCalled() throws Exception {
        //Arrange
        Mockito.doReturn(product).when(prodServiceSpy).getProductById(5);
        //Act
        Products retrievedProduct = prodServiceSpy.getProductById(5);
        //Assert
        Mockito.verify(prodServiceSpy,never()).saveProduct(product);
    }
}