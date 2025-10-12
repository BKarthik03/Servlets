package com.example.requestforwarding;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("uname");
        String password = req.getParameter("passwd");

        if((name.equals("karthik12"))&&(password.equals("1234"))){
            HttpSession session = req.getSession();
            session.setAttribute("uname", name);
            res.sendRedirect("welcome.jsp");
        }else{
            res.sendRedirect("login.jsp");
        }
    }
}
