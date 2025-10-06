package com.example.requestforwarding;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String subject = "java";

        req.setAttribute("subject", subject);
        RequestDispatcher rd = req.getRequestDispatcher("Demo.jsp");
        rd.forward(req,res);
    }
}
