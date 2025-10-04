package com.example.requestforwarding;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int k =  (int) session.getAttribute("k");
//        session.removeAttribute("k");
        PrintWriter out = response.getWriter();
        out.println("<h2>Square of sum is: "+k*k);

    }
}
