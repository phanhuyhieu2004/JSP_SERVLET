<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/28/2023
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa sp</title>
</head>
<body>
<h1>XÓA SẢN PHẨM</h1>
<p>
    <a href="products">Đến xem danh sách sp</a>
</p>
<form method="post">
    <h3>Bạn chắc muon xóa không?</h3>
    <fieldset>
        <legend>Thông tin sp</legend>
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
            <tr>
                <td><input type="submit" value="Xóa sp"></td>
                <td><a href="products">Xem danh sách sp</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

