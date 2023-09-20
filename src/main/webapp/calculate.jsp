<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính online </title>

</head>

<body>

<h1>MÁY TÍNH ĐƠN GIẢN</h1>
<form method="post" action="calculate">
    <fieldset>
        <legend>Máy tính</legend>
        <table>
            <tr>
                <td>Nhập số thứ nhất vào đây: </td>
                <td><input name="firstNumber" type="text"/></td>
            </tr>
            <tr>
                <td>Toán tử ban chọn là gì : </td>
                <td>
                    <select name="operate">
                        <option value="+">Cộng</option>
                        <option value="-">Trừ</option>
                        <option value="*">Nhân</option>
                        <option value="/">Chia</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Nhập số thứ 2 vào đây: </td>
                <td><input name="secondNumber" type="text"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate"/></td>
            </tr>
        </table>
    </fieldset>

</form>

</body>
</html>
