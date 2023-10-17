package com.example.store.control;


import com.example.store.dao.ProductDAO;
import com.example.store.model.Category;
import com.example.store.model.Product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "HomeControl", urlPatterns = {"/shop"})
public class HomeControl extends HttpServlet {
    private ProductDAO productDAO;


    public void init() {
        productDAO = new ProductDAO();
    }

    protected void getRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<Product> list = productDAO.getAllProduct();

        List<Category> listC = productDAO.getAllCategory();
        Product last = productDAO.getLast();


        request.setAttribute("listC", listC);
// Tiếp tục xử lý danh sách và truyền cho JSP
        request.setAttribute("listP", list);
        request.setAttribute("p", last);
        request.getRequestDispatcher("Home.jsp").forward(request, response);

    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        request.setCharacterEncoding("UTF-8");
        getRequest(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        request.setCharacterEncoding("UTF-8");
        getRequest(request, response);

    }
}
