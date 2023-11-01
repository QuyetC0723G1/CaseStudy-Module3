package controller;

import model.Product;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    ProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "formadd":
                showFormAddProduct(request,response);
                break;
        }
    }
  private void showFormAddProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/formadd.jsp");
        dispatcher.forward(request,response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void addProduct(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String manufacture = request.getParameter("manufacture");
        int category = Integer.parseInt(request.getParameter("category"));
        String image = request.getParameter("image");
        String description = request.getParameter("description");
        Product product = new Product(id,name,quantity,price,manufacture,category,image,description);
        productService.add(product);
        try {
            response.sendRedirect("/home?action=home");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}