package com.colin.ecommerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.colin.ecommerce.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "Samsung", 60300), 
        new Product(102, "Nokia", 40300),
        new Product(103, "itel", 20300)));

    public List <Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                        .filter(p ->p.getProdId() == prodId)
                        .findFirst().get();
        
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
