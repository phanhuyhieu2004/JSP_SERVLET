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

@WebServlet(name = "AddToCartServlet", value = "/addToCart")
public class AddToCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        HttpSession session = request.getSession();
        List<Product> cartItems = (List<Product>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        cartItems.add(new Product(name, price));
        session.setAttribute("cartItems", cartItems);

        response.sendRedirect("cart.jsp");
    }
}
