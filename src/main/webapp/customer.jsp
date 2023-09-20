<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Buoi2.Customer" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<head>
    <title>Danh Sách</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>

<table class="table table-danger table-striped">
    <tr>
        <th>Name</th>
        <th>Sex</th>
        <th>Address</th>
        <th>Picture</th>
    </tr>

    <c:forEach var="item" items="${list}">
        <tr class="table-primary">
            <td class="table-secondary">${item.name}</td>
            <td class="table-info">${item.sex}</td>
            <td>${item.address}</td>
            <td><img src="${item.picture}" alt="anh" style="width: 50px ; height: 50px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
