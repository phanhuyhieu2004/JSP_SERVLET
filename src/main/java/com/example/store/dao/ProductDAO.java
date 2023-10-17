package com.example.store.dao;


import com.example.store.model.Account;
import com.example.store.model.Category;
import com.example.store.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {

    // Thông tin kết nối cơ sở dữ liệu
    private String jdbcURL = "jdbc:mysql://localhost:3306/store?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456789";
    private static final String SELECT_Product_SQL = "SELECT * FROM product;";
    private static final String EDIT_PRODUCT_SQL = "UPDATE product SET name=?, image=?, price=?, title=?, description=?,cateID=? WHERE id=?;";
    private static final String DELETE_PRODUCT_SQL = "DELETE FROM  product WHERE id=?;";
    private static final String SELECT_ADD_SQL = "INSERT INTO product ( name, image, price, title, description,cateID,uID)\n" +
            "VALUES(?,?,?,?,?,?,?);";
    private static final String SELECT_SellID_SQL = "SELECT * FROM product WHERE uID=?;";
    private static final String SELECT_Signup = "INSERT INTO   account ( user, pass, isSell, isAdmin) VALUES( ?,?, 0, 0);";
    private static final String SELECT_Account_SQL = "  SELECT * FROM account WHERE user=? and pass=?;";
    private static final String SELECT_CheckUser_SQL = "  SELECT * FROM account WHERE user=? ;";
    private static final String SELECT_product_SQL = "SELECT * FROM product WHERE id=?;";
    private static final String SELECT_Category_SQL = "SELECT * FROM category;";
    private static final String SELECT_SearchByName_SQL = "SELECT * FROM product WHERE name LIKE ?;";
    private static final String SELECT_getProductById_SQL = "SELECT * FROM product WHERE cateID =?;";
    private static final String SELECT_LastProduct_SQL = "SELECT * FROM product\n" +
            "ORDER BY id DESC\n" +
            "LIMIT 1;";

    public ProductDAO() {
    }

    // Phương thức kết nối đến cơ sở dữ liệu
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Không thể kết nối với DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Product_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String image = resultSet.getString("image");
                double price = resultSet.getDouble("price");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                Product product = new Product(id, name, image, price, title, description);
                productList.add(product);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Category_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                list.add(new Category(resultSet.getInt(1),
                        resultSet.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Product getLast() {


        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LastProduct_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                return new Product(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getString(5),
                        resultSet.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    @Override
    public List<Product> getProductByID(int cateID) {
        List<Product> productList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_getProductById_SQL)) {
            preparedStatement.setInt(1, cateID);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String image = resultSet.getString(3);
                double price = resultSet.getDouble(4);
                String title = resultSet.getString(5);
                String description = resultSet.getString(6);

                Product product = new Product(productId, name, image, price, title, description);
                productList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }
    @Override
    public Product getProByID(int id) {


        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_product_SQL)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Product(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getString(5),
                        resultSet.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    @Override
    public List<Product> searchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SearchByName_SQL);) {
            preparedStatement.setString(1,"%"+ txtSearch+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Product(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getString(5),
                        resultSet.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    @Override
    public Account login(String user, String pass) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Account_SQL)) {
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    @Override
    public Account checkAccountExist(String user) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CheckUser_SQL)) {
            preparedStatement.setString(1, user);


            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void signUp(String user, String pass) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Signup) ){
            preparedStatement.setString(1, user);

            preparedStatement.setString(2, pass);
//            khi chạy xong k có kết quả trả về
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }
    @Override
    public List<Product> getProductBySellID(int id) {
        List<Product> list = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SellID_SQL)) {
            preparedStatement.setString(1, String.valueOf(id));


            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Product(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getString(5),
                        resultSet.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    @Override
    public void insertProduct(String name, String image, String price,
                              String title, String description, String category, int sid) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ADD_SQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, image);
            preparedStatement.setString(3, price);
            preparedStatement.setString(4, title);
            preparedStatement.setString(5, description);
            preparedStatement.setString(6, category);
            preparedStatement.setInt(7, sid);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }
    @Override
    public void deleteProduct(String pid) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_SQL)) {
            preparedStatement.setString(1, pid);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void editProduct(String name, String image, String price,
                            String title, String description, String category, String pid) {


        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_PRODUCT_SQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, image);
            preparedStatement.setString(3, price);
            preparedStatement.setString(4, title);
            preparedStatement.setString(5, description);
            preparedStatement.setString(6, category);
            preparedStatement.setString(7, pid);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Product> list = dao.getProductBySellID(1);
//        List<Category> listC = dao.getAllCategory();

        for (Product o : list) {
            System.out.println(o);
        }
    }


}
