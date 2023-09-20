package Buoi1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet(name="ProductDiscountServlet",value="/product")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        String productDescription = request.getParameter("productDescription");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<p>" + productDescription + "</p>");
        writer.print("<p>Bảng giá: " + listPrice +"</p>");
        writer.print("<p>Phần trăm chiết khấu: "  + discountPercent +"</p>");
        writer.print("<p>Số tiền chiết khấu: " + listPrice* discountPercent*0.01+ "</p>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}