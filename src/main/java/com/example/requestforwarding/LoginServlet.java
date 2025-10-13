package com.example.requestforwarding;

import com.example.requestforwarding.DAO.LoginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    LoginDAO logindao = new LoginDAO();
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("uname");
        String password = req.getParameter("passwd");

        if(logindao.check(name,password)){
            HttpSession session = req.getSession();
            session.setAttribute("uname", name);
            res.sendRedirect("welcome.jsp");
        }else{
            res.sendRedirect("login.jsp");
        }
    }
}
