package com.example.requestforwarding;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addAlien")
public class Myservlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int id  = Integer.parseInt(req.getParameter("aId"));
        String name = req.getParameter("aName");

        PrintWriter out = res.getWriter();
        out.println("<h3>Welcome "+name+"</h3>");
    }
}
