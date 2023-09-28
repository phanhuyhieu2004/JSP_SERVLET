package com.example.jsp.Buoi4.Product;

import com.example.jsp.Buoi4.Customer;

import java.util.List;

public interface ProductService {
    List<Product> displayAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
    List<Product> searchByName(String name);
}
