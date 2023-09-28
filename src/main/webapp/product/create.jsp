<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/28/2023
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tạo 1 sp mới</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>TẠO 1 SẢN PHẨM MỚI</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="products">Đến danh sách sp</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thông tin sp</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>Information: </td>
                <td><input type="text" name="information" id="information"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tạo sp"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>



