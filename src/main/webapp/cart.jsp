<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Giỏ hàng</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body>
<h1 style="align-content: center">Giỏ hàng</h1>

<table  class="table table-danger ">
 <thead>
    <tr>
        <th>Tên </th>
        <th>Gía</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cartItems}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="products.jsp">Quay về trang sản phẩm</a>
</body>
</html>