package Buoi3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/hi")
public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        request.setCharacterEncoding("UTF-8");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Máy sấy tóc", 50000.0));
        productList.add(new Product("Máy cắt cỏ", 100.0));
        productList.add(new Product("Máy chiếu", 200.0));
        productList.add(new Product("Máy tính", 300.0));

        HttpSession session = request.getSession();
        session.setAttribute("productList", productList);

        request.getRequestDispatcher("products.jsp").forward(request, response);
    }
}