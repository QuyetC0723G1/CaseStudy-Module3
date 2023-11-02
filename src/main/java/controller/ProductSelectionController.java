package controller;

import model.Product;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomePageController", value = "/home")
public class ProductSelectionController extends HttpServlet {
    ProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "home":
//                showHome(request,response);
                break;
        }
    }

    private void showAllProductToHome(HttpServletRequest request , HttpServletResponse response){
        List<Product> list = productService.findAll();
        request.setAttribute("listProduct",list);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void findByPrice(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double priceMin = Double.parseDouble(request.getParameter("priceMin"));
        double priceMax = Double.parseDouble(request.getParameter("priceMax"));
        List<Product> list = productService.findByPrice(priceMin,priceMax);
        request.setAttribute("listProduct",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/products.jsp");
        requestDispatcher.forward(request,response);
    }
}