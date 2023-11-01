package controller;

import database.DbConnect;
import model.User;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UserController", value = "/user")
public class UserController extends HttpServlet {
    UserService userService = new UserService();
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


}