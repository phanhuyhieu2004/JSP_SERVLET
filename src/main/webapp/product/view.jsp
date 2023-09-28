<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/28/2023
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xem sp</title>
</head>
<body>
<h1>Thông tin chi tiết</h1>
<p>
    <a href="products">Quay về sp</a>
</p>

<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Information: </td>
        <td>${requestScope["product"].getInformation()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${requestScope["product"].getProducer()}</td>
    </tr>
</table>
</body>
</html>

