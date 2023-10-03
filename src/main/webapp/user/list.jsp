<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<style>
    body{
        background-image: url("https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/anh-anime-nu-25.jpg") ;
        background-size: cover;
    }
</style>
<body>
<content>
<center>
    <h1>User Management</h1>
    <div class="container mt-4" >
        <form action="/users" method="get">
            <input type="hidden" name="action" value="search">
            <div class="form-group row">
                <label for="keyword" class="col-sm-3 col-form-label">Search by Keyword:</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="keyword" name="keyword">
                </div>
                <div class="col-sm-3">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </div>
        </form>
    </div>
    <h2>
        <a href="/users?action=create" class="btn btn-success">Add New User</a>
    </h2>


</center>
<div class="container mt-4">
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%-- Thêm kiểm tra nếu danh sách người dùng không rỗng thì hiển thị dữ liệu --%>
        <c:if test="${not empty listUser}">
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}"/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.country}"/></td>
                    <td>
                        <a href="/users?action=edit&id=${user.id}" class="btn btn-primary">Edit</a>
                        <a href="/users?action=delete&id=${user.id}" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            <%-- Nếu danh sách người dùng rỗng, hiển thị thông báo --%>
            <c:if test="${empty listUser}">
                <tr>
                    <td colspan="5">Không có người dùng.</td>
                </tr>
            </c:if>
        </c:if>
        </tbody>
    </table>
    
</div>
</content>
<img style="background-color: aliceblue" src="http://forum.knightageonline.com/app/view/forum/15345569196030.png">






</body>
</html>