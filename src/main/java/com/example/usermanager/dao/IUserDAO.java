package com.example.usermanager.dao;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;


    public User selectUser(int id);


    public List<User> selectAllUsers();


    List<User> getUsers();

    void updateUser(int id, String name, String email, String country);

    
    public boolean deleteUser(int id) throws SQLException;


    public boolean updateUser(User user) throws SQLException;
    public List<User> searchUsersByKeyword(String keyword);
    public User getUserById(int id);

   public  void insertUserStore(User user) throws SQLException;
    void addUserTransaction(User user, List<Integer> permisions);
    public void insertUpdateWithoutTransaction();


    public void insertUpdateUseTransaction();

  
    void deleteUsers(int id);
}
//interface`IUserDAO` có mục đích là định nghĩa các phương thức để tương tác với cơ sở dữ liệu liên quan đến người dùng (user). Nó cung cấp một khung (contract) cho các lớp DAO (Data Access Object) để triển khai các phương thức này.

//        Giao diện này giúp tách biệt logic kết nối và truy vấn cơ sở dữ liệu ra khỏi các lớp DAO cụ thể. Bằng cách định nghĩa các phương thức trong giao diện, ta có thể triển khai các lớp DAO khác nhau để làm việc với các loại cơ sở dữ liệu khác nhau  mà không cần thay đổi giao diện của `IUserDAO`.
