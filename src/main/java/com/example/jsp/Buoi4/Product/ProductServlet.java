package com.example.jsp.Buoi4.Product;

import com.example.jsp.Buoi4.Customer;
import com.example.jsp.Buoi4.CustomerService;
import com.example.jsp.Buoi4.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




    @WebServlet(name = "ProductServletss", value = "/products")
    public class ProductServlet extends HttpServlet {
        private final ProductService productService = new ProductServiceImpl();

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html; charset=UTF-8");

            request.setCharacterEncoding("UTF-8");
            // Lấy Parameters (Dữ liệu request gửi đi) có name là "action".
            String action = request.getParameter("action");

            // Nếu dữ liệu request gửi đi không có "action" thì sẽ trả về null.
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "create":
                    createProduct(request, response);
                    break;
                case "edit":
                    updateProduct(request, response);
                    break;
                case "delete":
                    deleteProduct(request, response);
                    break;
                default:
                    break;
            }
        }

        private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                this.productService.remove(id);
                try {
                    response.sendRedirect("/products");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Double price = Double.valueOf(request.getParameter("price"));
            String information = request.getParameter("information");
            String producer = request.getParameter("producer");
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                product.setName(name);
                product.setPrice(price);
                product.setInformation(information);
                product.setProducer(producer);
                this.productService.update(id, product);
                request.setAttribute("product", product);
                request.setAttribute("message", "Thông tin về sản phẩm đã được cập nhật");
                dispatcher = request.getRequestDispatcher("product/edit.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void createProduct(HttpServletRequest request, HttpServletResponse response) {
            String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
            String information = request.getParameter("information");
            String producer=request.getParameter("producer");
            int id = (int) (Math.random() * 10000);

            Product product = new Product(id, name, price, information,producer);
            this.productService.save(product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
            request.setAttribute("message", "Tạo 1 Sản Phẩm mới thành công");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html; charset=UTF-8");

            request.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "create":
                    showCreateForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    showDeleteForm(request, response);
                    break;
                case "view":
                    viewProduct(request, response);
                    break;
                default:
                    listProduct(request, response);
                    break;
            }
        }


        private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                request.setAttribute("product", product);
                dispatcher = request.getRequestDispatcher("product/view.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                request.setAttribute("product", product);
                dispatcher = request.getRequestDispatcher("product/delete.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                request.setAttribute("product",product);
                dispatcher = request.getRequestDispatcher("product/edit.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void listProduct(HttpServletRequest request, HttpServletResponse response) {
            String searchName = request.getParameter("searchName");

            List<Product> products;
            if (searchName != null && !searchName.isEmpty()) {
                products = this.productService.searchByName(searchName);
            } else {
                products = this.productService.displayAll();
            }

            request.setAttribute("products", products);

            RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



