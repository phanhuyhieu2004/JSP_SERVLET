<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/28/2023
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa sp</title>
</head>
<body>
<h1>CHỈNH SỬA SP</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="products">Quay về list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Thông tin SP</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Information: </td>
                <td><input type="text" name="information" id="information" value="${requestScope["product"].getInformation()}"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer" value="${requestScope["product"].getProducer()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Cập nhật SP"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

