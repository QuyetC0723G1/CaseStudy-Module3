package controller;

import model.Category;
import model.Product;
import service.CategoryService;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", value = "/home")
public class HomeController extends HttpServlet {
    ProductService productService = new ProductService();
    CategoryService categoryService = new CategoryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "home":
                showHome(request,response);
                break;
        }
    }

    private void showHome(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = productService.findAll();
        List<Category> listCat = categoryService.findAll();
        request.setAttribute("listProduct",list);
        request.setAttribute("listCategory", listCat);
        request.getRequestDispatcher("home/homepage.jsp").forward(request,response);
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