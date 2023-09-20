package Buoi2;

import Buoi2.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name="CustomerServlet",value="/customer")


public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Phan Huy Hieu","Nam","HN","https://hinhgaixinh.com/wp-content/uploads/2022/04/ngan-98-min.jpg"));
        list.add(new Customer("Phan Huy Hieu","Nam","HN","https://2sao.vietnamnetjsc.vn/images/2021/09/12/17/07/ngan-98-2.jpeg"));
        list.add(new Customer("Phan Huy Hieu","Nam","HN","https://hinhgaixinh.com/wp-content/uploads/2022/04/ngan-98-min.jpg"));
        list.add(new Customer("Phan Huy Hieu","Nam","HN","https://2sao.vietnamnetjsc.vn/images/2021/09/12/17/07/ngan-98-2.jpeg"));


        request.setAttribute("list",list);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }
}
