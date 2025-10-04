package com.example.requestforwarding;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int k = Integer.parseInt(request.getParameter("k"));
        PrintWriter out = response.getWriter();
        out.println("<h2>Square of sum is: "+k*k+"</h2>");

    }
}
