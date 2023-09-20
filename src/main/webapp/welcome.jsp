<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>

<html>
<head>
    <title>Insert title here</title>
</head>
<body>

    <%
String name=request.getParameter("uname");
PrintWriter printWriter=response.getWriter();
printWriter.print("Welcome "+name);

session.setAttribute("user",name);
%>

<a href="second.jsp">Display the value</a>


<body>

</body>
</html>
