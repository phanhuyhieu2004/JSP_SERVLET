<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/26/2023
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa KH</title>
</head>
<body>
<h1>Xóa KH</h1>
<p>
    <a href="customers">Quay về list</a>
</p>
<form method="post">
    <h3>Bạn có chac muốn xóa không?</h3>
    <fieldset>
        <legend>Thông tin của KH là</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["customer"].getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["customer"].getEmail()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["customer"].getAddress()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Xóa KH"></td>
                <td><a href="customers">Quay về list </a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>


