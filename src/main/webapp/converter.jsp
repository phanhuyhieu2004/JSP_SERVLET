<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<h2>Chuyển đổi tiền tệ</h2>
<form action="converters.jsp" method="post">
    <label>Tỷ lệ: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Chuyển đổi"/>
</form>
</body>
</html>

</body>
</html>
