<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 9/20/2023
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");
    String search = request.getParameter("search");
    PrintWriter printWriter=response.getWriter();

    String result = dic.get(search);
    if (result != null) {
        printWriter.println("Word: " + search);
        printWriter.println("Result: " + result);
    } else {
        printWriter.println("Not found");
    }
%>
</body>
</html>
</body>
</html>
