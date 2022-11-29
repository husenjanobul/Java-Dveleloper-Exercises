package com.company.service;

import com.company.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    List<Product> delete(long id);
    List<Product> updateProducts(long id,Product product);
    List<Product> createProducts(Product product);
    Product getProduct(long id);



}
