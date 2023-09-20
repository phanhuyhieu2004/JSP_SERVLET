package Buoi2;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
    public class CalculatorServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
            float firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
            float secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
            char operate = request.getParameter("operate").charAt(0);
            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<h1>Result:</h1>");
            try{
                float result = Calculate.calculate( firstNumber,  secondNumber, operate);
                writer.println(firstNumber + " " + operate + " " + secondNumber + " = " + result);
            }catch (Exception ex){
                writer.println("Error: " + ex.getMessage());
            }
            writer.println("</html>");
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }

