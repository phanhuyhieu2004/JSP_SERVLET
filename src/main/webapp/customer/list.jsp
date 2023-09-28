<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/26/2023
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <style>
        body {
            background-image:url("https://e.khoahoc.tv/photos/image/2017/09/19/bong-tuyet.jpg") ;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
        }
        body > * {
            margin-bottom: 10px;
        }
    </style>
    <title>Danh sách KH</title>
</head>
<%--<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">--%>

<body>

<h1>Khách Hàng</h1>

<p>
    <a href="/customers?action=create" style="align-content: center">Tạo 1 KH  </a></p>
<form action="customers" method="GET">
    <input type="text" name="searchName" placeholder="Enter name">
    <button type="submit">Search</button>
</form>


<div align="center">
<table border="10">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</div>
<a href="http://localhost:8080/customers">Quay lại</a>

</body>
</html>

