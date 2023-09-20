<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>

<html>
<head>
    <title>Title</title>
    <title>Insert title here</title>
</head>
<body>

<h1>Display the session value on this page</h1>

    <%
String name=(String)session.getAttribute("user");
PrintWriter printWriter=response.getWriter();
printWriter.print("Hello "+name);
%>

<body>

</body>
</html>
