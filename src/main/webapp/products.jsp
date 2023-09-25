<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Trang Sản Phẩm</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<h1 style="align-content: center">Sản phẩm phục vụ cuộc sống</h1>

<table class="table table-danger ">
    <thead>
    <tr>
        <th>Tên SP</th>
        <th>Gía </th>
        <th>Mua hay không mua???</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
                <form action="${pageContext.request.contextPath}/addToCart" method="post">
                    <input type="hidden" name="name" value="${product.name}">
                    <input type="hidden" name="price" value="${product.price}">
                    <button type="submit">Mua điiii</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="cart.jsp">Xem giỏ hàng</a>

</body>
</html>