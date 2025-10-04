package com.example.requestforwarding;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int k =  (int) request.getAttribute("k");
        PrintWriter out = response.getWriter();
        out.println("<h2>square of sum is: "+ k*k+"</h2>");

    }
}
