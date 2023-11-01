package controller;

import model.Product;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    ProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "products":
                showListProduct(request,response);
            case "formadd":
                showFormAddProduct(request,response);
                break;
            case "productmanager":
                showCrud(request,response);
                break;
            case "formedit":
                showFormEdit(request,response);
                break;
        }
    }
    private void showCrud(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = productService.findAll();
        request.setAttribute("listProduct",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/productmanager.jsp");
        requestDispatcher.forward(request,response);
    }
    private void showListProduct(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = productService.findAll();
        request.setAttribute("listProduct",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/products.jsp");
        requestDispatcher.forward(request,response);
    }
  private void showFormAddProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/formadd.jsp");
        dispatcher.forward(request,response);
    }
    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("product",productService.findById(id));
        request.getRequestDispatcher("product/formedit.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "formadd" :
                addProduct(request,response);
                break;
            case "formedit" :
                editProduct(request,response);
                break;
        }

    }
    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String manufacture = request.getParameter("manufacture");
        int category = Integer.parseInt(request.getParameter("categoryId"));
        String image = request.getParameter("image");
        String description = request.getParameter("description");
        Product product = new Product(id,name,quantity,price,manufacture,category,image,description);
        productService.add(product);
        response.sendRedirect("product?action=productmanager");

    }
    private void editProduct(HttpServletRequest request,HttpServletResponse response){
        String index = request.getParameter("oldId");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        String manufacture = request.getParameter("manufacture");
        int category = Integer.parseInt(request.getParameter("categoryId"));
        String image = request.getParameter("image");
        String description = request.getParameter("description");
        Product product = new Product(id,name,quantity,price,manufacture,category,image,description);
        productService.edit(index,product);
        try {
            response.sendRedirect("product?action=productmanager");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}