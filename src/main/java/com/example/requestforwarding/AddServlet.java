package com.example.requestforwarding;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;

        Cookie cookie = new Cookie("k",String.valueOf(k));
        resp.addCookie(cookie);

        resp.sendRedirect("sq");


    }
}
