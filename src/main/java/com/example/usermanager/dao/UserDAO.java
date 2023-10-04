package com.example.usermanager.dao;

import com.example.usermanager.model.User;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    // Thông tin kết nối cơ sở dữ liệu
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456789";

    // Các truy vấn SQL
    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "SELECT id, name, email, country FROM users WHERE id = ?;";
    private static final String SELECT_ALL_USERS = "SELECT * FROM users;";
    private static final String DELETE_USERS_SQL = "DELETE FROM users WHERE id = ?;";
    private static final String UPDATE_USERS_SQL = "UPDATE users SET name = ?, email = ?, country = ? WHERE id = ?;";
    private static final String SEARCH_USERS_BY_KEYWORD = "SELECT * FROM users WHERE country LIKE ?;";
    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";
    private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"
            + "("
            + " ID serial,"
            + " NAME varchar(100) NOT NULL,"
            + " SALARY numeric(15, 2) NOT NULL,"
            + " CREATED_DATE timestamp,"
            + " PRIMARY KEY (ID)"
            + ")";
    private static final String SQL_TABLE_DROP = "DROP TABLE IF EXISTS EMPLOYEE";

    public UserDAO() {
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
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            // Thiết lập giá trị tham số 1 trong truy vấn SQL (tên người dùng)
            preparedStatement.setString(2, user.getEmail());
            // Thiết lập giá trị tham số 2 trong truy vấn SQL (email)
            preparedStatement.setString(3, user.getCountry());
            // Thiết lập giá trị tham số 3 trong truy vấn SQL (quốc gia)
            System.out.println(preparedStatement);
            // In ra truy vấn SQL đã được thiết lập các giá trị tham số
            preparedStatement.executeUpdate();
            // Thực thi truy vấn INSERT và cập nhật dữ liệu trong cơ sở dữ liệu
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)) {
            preparedStatement.setInt(1, id);
            // Thiết lập giá trị tham số trong truy vấn SQL (id người dùng)
            System.out.println(preparedStatement);
            // In ra truy vấn SQL đã được thiết lập các giá trị tham số
            ResultSet rs = preparedStatement.executeQuery();
            // Thực thi truy vấn SELECT và trả về kết quả trong ResultSet
            while (rs.next()) {
                String name = rs.getString("name");
                // Đọc giá trị cột "name" từ ResultSet
                String email = rs.getString("email");
                // Đọc giá trị cột "email" từ ResultSet
                String country = rs.getString("country");
                // Đọc giá trị cột "country" từ ResultSet
                user = new User(id, name, email, country);
                // Tạo đối tượng User với các giá trị đã đọc từ ResultSet
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
        // Trả về đối tượng User đã được lấy từ cơ sở dữ liệu
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)) {
            System.out.println(preparedStatement);
            // In ra truy vấn SQL đã được thiết lập các giá trị tham số
            ResultSet rs = preparedStatement.executeQuery();
            // Thực thi truy vấn SELECT và trả về kết quả trong ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                // Đọc giá trị cột "id" từ ResultSet
                String name = rs.getString("name");
                // Đọc giá trị cột "name" từ ResultSet
                String email = rs.getString("email");
                // Đọc giá trị cột "email" từ ResultSet
                String country = rs.getString("country");
                // Đọc giá trị cột "country" từ ResultSet
                users.add(new User(id, name, email, country));
                // Thêm đối tượng User vào danh sách users
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
        // Trả về danh sách các đối tượng User đã được lấy từ cơ sở dữ liệu
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL)) {
            statement.setInt(1, id);
            // Thiết lập giá trị tham số trong truy vấn SQL (id người dùng)
            rowDeleted = statement.executeUpdate() > 0;
            // Thực thi truy vấn DELETE và kiểm tra xem có dòng dữ liệu nào bị xóa hay không
        }
        return rowDeleted;
        // Trả về true nếu có dòng dữ liệu bị xóa, ngược lại trả về false
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            statement.setString(1, user.getName());
            // Thiết lập giá trị tham số 1 trong truy vấn SQL (tên người dùng)
            statement.setString(2, user.getEmail());
            // Thiết lập giá trị tham số 2 trong truy vấn SQL (email)
            statement.setString(3, user.getCountry());
            // Thiết lập giá trị tham số 3 trong truy vấn SQL (quốc gia)
            statement.setInt(4, user.getId());
            // Thiết lập giá trị tham số 4 trong truy vấn SQL (id người dùng)
            rowUpdated = statement.executeUpdate() > 0;
            // Thực thi truy vấn UPDATE và kiểm tra xem có dòng dữ liệu nào được cập nhật hay không
        }
        return rowUpdated;
        // Trả về true nếu có dòng dữ liệu được cập nhật, ngược lại trả về false
    }

    // Phương thức in ra thông tin lỗi SQL
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("Trạng thái : " + ((SQLException) e).getSQLState());
                System.err.println("Lỗi: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Nguyên nhân: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public List<User> searchUsersByKeyword(String keyword) {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USERS_BY_KEYWORD);) {

            // Thiết lập tham số cho câu lệnh SQL
            preparedStatement.setString(1, "%" + keyword + "%");

            // Thực thi câu lệnh truy vấn và lấy kết quả ResultSet
            ResultSet rs = preparedStatement.executeQuery();

            // Trích xuất dữ liệu từ ResultSet để tạo danh sách các đối tượng User
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{CALL get_user_by_id(?)}";

        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setInt(1, id);
            ResultSet rs = callableStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;

    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        String query = "{CALL insert_user(?,?,?)}";

        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }

    }


    @Override

    public void addUserTransaction(User user, List<Integer> permisions) {

        Connection conn = null;

        // để chèn người dùng mới

        PreparedStatement pstmt = null;

// để gán quyền cho người dùng
        PreparedStatement pstmtAssignment = null;

// để lấy id người dùng
        ResultSet rs = null;

        try {

            conn = getConnection();

            // set auto commit to false

            conn.setAutoCommit(false);

            //

            // Insert user

            //

            pstmt = conn.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, user.getName());

            pstmt.setString(2, user.getEmail());

            pstmt.setString(3, user.getCountry());

            int rowAffected = pstmt.executeUpdate();

            // get user id

            rs = pstmt.getGeneratedKeys();

            int userId = 0;

            if (rs.next())

                userId = rs.getInt(1);

            //

// trong trường hợp thao tác chèn thành công, hãy gán quyền cho người dùng
            //

            if (rowAffected == 1) {

// gán quyền cho người dùng
                String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) "

                        + "VALUES(?,?)";

                pstmtAssignment = conn.prepareStatement(sqlPivot);

                for (int permisionId : permisions) {

                    pstmtAssignment.setInt(1, userId);

                    pstmtAssignment.setInt(2, permisionId);

                    pstmtAssignment.executeUpdate();

                }

                conn.commit();

            } else {

                conn.rollback();

            }

        } catch (SQLException ex) {

// khôi phục trước khi giao tác
            try {

                if (conn != null)

                    conn.rollback();

            } catch (SQLException e) {

                System.out.println(e.getMessage());

            }

            System.out.println(ex.getMessage());

        } finally {

            try {

                if (rs != null) rs.close();

                if (pstmt != null) pstmt.close();

                if (pstmtAssignment != null) pstmtAssignment.close();

                if (conn != null) conn.close();

            } catch (SQLException e) {

                System.out.println(e.getMessage());

            }

        }

    }

    @Override
    public void insertUpdateWithoutTransaction() {

        try (Connection conn = getConnection();

             Statement statement = conn.createStatement();

             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);

             PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {


            statement.execute(SQL_TABLE_DROP);

            statement.execute(SQL_TABLE_CREATE);


            // Run list of insert commands

            psInsert.setString(1, "Quynh");

            psInsert.setBigDecimal(2, new BigDecimal(10));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();


            psInsert.setString(1, "Ngan");

            psInsert.setBigDecimal(2, new BigDecimal(20));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();


// Chạy danh sách lệnh cập nhật

// dòng dưới đây gây ra lỗi, kiem tra giao tac
// org.postgresql.util.PSQLException: Không có giá trị nào được chỉ định cho tham số 1.
            psUpdate.setBigDecimal(2, new BigDecimal(999.99));


            //psUpdate.setBigDecimal(1, new BigDecimal(999.99));

            psUpdate.setString(2, "Quynh");

            psUpdate.execute();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @Override

    public void insertUpdateUseTransaction() {

        try (Connection conn = getConnection();

             Statement statement = conn.createStatement();

             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);

             PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

            statement.execute(SQL_TABLE_DROP);

            statement.execute(SQL_TABLE_CREATE);

            // start transaction block

            conn.setAutoCommit(false); // default true

// Chạy danh sách lệnh chèn
            psInsert.setString(1, "Quynh");

            psInsert.setBigDecimal(2, new BigDecimal(10));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();


            psInsert.setString(1, "Ngan");

            psInsert.setBigDecimal(2, new BigDecimal(20));

            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();


// Chạy danh sách lệnh cập nhật


            // dòng dưới đây gây ra lỗi, kiem tra giao tac

            // org.postgresql.util.PSQLException: Không có giá trị nào được chỉ định cho tham số 1.

            psUpdate.setBigDecimal(1, new BigDecimal(999.99));


            //psUpdate.setBigDecimal(1, new BigDecimal(999.99));

            psUpdate.setString(2, "Quynh");

            psUpdate.execute();


// kết thúc khối giao tác, cam kết thay đổi
            conn.commit();

// cách tốt nhất là đặt nó về mặc định đúng
            conn.setAutoCommit(true);


        } catch (Exception e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

        }

    }

    @Override
    public List<User> getUsers() {
        String query = "{CALL getUsers()}";

        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
             CallableStatement statement = connection.prepareCall(query);
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }


    @Override
    public void updateUser(int id, String name, String email, String country) {
        String query = "{CALL updateUser(?,?,?,?)}";


        try (Connection connection = getConnection();
             CallableStatement statement = connection.prepareCall(query)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.setString(4, country);

            statement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // Triển khai phương thức deleteUser()
    @Override
    public void deleteUsers(int id) {
        String query = "{CALL deleteUser(?)}";

        try (Connection connection = getConnection();
             CallableStatement statement = connection.prepareCall(query)) {

            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }


    }
}