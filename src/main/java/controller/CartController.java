package controller;

import model.Cart;
import model.Customer;
import model.User;
import service.CartService;
import service.CustomerService;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartController", value = "/cart")
public class CartController extends HttpServlet {
    int userId;
    CartService cartService = new CartService();
    UserService userService = new UserService();
    CustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "cart":
                showCart(request,response);
                break;
            case "add":
                addToCart(request,response);
                break;

        }
    }

    private void showCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (user != null) {
                userId = user.getId();}
        Customer cus = customerService.getCustomerByUserId(userId);
        List<Cart> carts = cartService.findByIdToShowCart(cus.getId());
        double money = cartService.getTotalMoney(cus.getId());
        request.setAttribute("carts",carts);
        request.setAttribute("money",money);
        request.setAttribute("customerName",cus.getName());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("cart/cart.jsp");
        requestDispatcher.forward(request,response);
    }
    private void addToCart(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productId = request.getParameter("id");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user != null) {
            userId = user.getId();}
        Customer cus = customerService.getCustomerByUserId(userId);
        int customerId = cus.getId();
        Cart cart = new Cart(customerId,productId);
        cartService.addToCart(cart);
        response.sendRedirect("product?action=products");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}