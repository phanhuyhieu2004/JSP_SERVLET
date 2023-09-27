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
    <title>Customer List</title>
</head>
<body>

<h1>Customers</h1>

<p>
    <a href="/customers?action=create" style="align-content: center">Create new customer </a></p>

<table border="1 ">
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
</body>
</html>

