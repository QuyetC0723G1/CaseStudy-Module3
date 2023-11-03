package controller;

import model.Cart;
import service.CartService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartController", value = "/cart")
public class CartController extends HttpServlet {
    CartService cartService = new CartService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "cart":
                showCart(request,response);
                break;
        }
    }
    private void showCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cart> carts = cartService.findByIdToShowCart(133);
        double money = cartService.getTotalMoney(133);
        String name = carts.get(0).getCustomerName();
        request.setAttribute("carts",carts);
        request.setAttribute("money",money);
        request.setAttribute("customerName",name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("cart/cart.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}