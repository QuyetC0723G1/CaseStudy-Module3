package controller;

import database.DbConnect;
import model.Customer;
import model.User;
import service.CustomerService;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UserController", value = "/user")
public class UserController extends HttpServlet {
    UserService userService = new UserService();
    CustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch (action){
            case "signup" :
                showFormSignUp(request,response);
                break;
            case "login":
                showLogin(request,response);
                break;
        }
    }
    private void showFormSignUp(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/signup.jsp");
        dispatcher.forward(request,response);
    }
    private void showLogin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/login.jsp");
        requestDispatcher.forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "signup" :
                signup(request,response);
                break;
            case "login":
                login(request,response);
                break;
        }
    }

    private void login(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        User u = userService.getUser(user,password);
        if(u==null){
            request.setAttribute("err","Wrong user or pass");
            request.getRequestDispatcher("user/login.jsp").forward(request,response);

        }else {
            HttpSession session = request.getSession();
            session.setAttribute("user", u);
            session.setMaxInactiveInterval(300);
            response.sendRedirect("home?action=home");
        }

    }
    private void signup(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String fullname = request.getParameter("fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        User u = new User(user,password,phone);
        userService.add(u);
        User u1 = userService.getUserByUsername(user);
        Customer c = new Customer(fullname,age,address,email,u1.getId());
        customerService.add(c);
        request.setAttribute("mess","Register succeed");
        request.getRequestDispatcher("user/login.jsp").forward(request,response);
    }


}