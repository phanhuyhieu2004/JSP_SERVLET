package com.example.store.dao;

import com.example.store.model.Account;
import com.example.store.model.Category;
import com.example.store.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProduct();

    List<Category> getAllCategory();

    Product getLast();

    List<Product> getProductByID(int cateID);

    Product getProByID(int id);

    List<Product> searchByName(String txtSearch);

    Account login(String user, String pass);

    Account checkAccountExist(String user);

    void signUp(String user, String pass);

    List<Product> getProductBySellID(int id);

    void insertProduct(String name, String image, String price,
                       String title, String description, String category, int sid);

    void deleteProduct(String pid);
}
