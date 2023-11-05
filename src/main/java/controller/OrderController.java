package controller;

import model.Cart;
import model.Order;
import service.CartService;
import service.OrderService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "OrderController", value = "/order")
public class OrderController extends HttpServlet {
    private  final OrderService orderService = new OrderService();
    private CartService cartService = new CartService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "ordermanager" :
                showListOrder(request,response);
                break;
            case "create":
                showOrder(request,response);
                break;
        }
    }
    private void showListOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Order> orderList = orderService.findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("order/ordermanager.jsp");
        request.setAttribute("orderlist",orderList);
        requestDispatcher.forward(request,response);
    }
    public void showOrder(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        List<Cart> list = cartService.findByIdToShowCart(133);
        double money = cartService.getTotalMoney(133);
        String name = list.get(0).getCustomerName();
        request.setAttribute("listPick",list);
        request.setAttribute("money",money);
        request.setAttribute("customerName",name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("order/createorder.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}