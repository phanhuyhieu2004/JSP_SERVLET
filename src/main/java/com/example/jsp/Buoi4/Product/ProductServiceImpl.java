package com.example.jsp.Buoi4.Product;


import com.example.jsp.Buoi4.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, " Máy sấy tóc", 22.000, "Máy có the làm mát tóc","Panasonic"));
        products.put(2, new Product(2, "Máy chơi game", 123.000, "Thiết bị giải trí chuyên nghiệp sau những giờ làm việc ","SamSung"));
        products.put(3, new Product(3, "Máy xay sinh tố", 35.000, "Xay nhỏ thực phẩm cho người móm răng dễ hấp thụ","Sony"));
        products.put(4, new Product(4, "Máy tính DELL", 120.000, "Máy tính để lập trình,xem phim,chơi game,..","Dell"));
        products.put(5, new Product(5, "Điện thoại vivo 1820", 70.000, "Điện thoại nghe gọi ,fb,tiktok,..","Vivo"));
        products.put(6, new Product(6, "Lò vi sóng", 180.000, "Hâm nóng đồ ăn mọi lúc mọi nơi","BlueStore"));
    }


    @Override

    public List<Product> displayAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }
    
}
