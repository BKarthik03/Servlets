package com.example.requestforwarding;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int k = 0;
        Cookie cookie[] = request.getCookies();
        for(Cookie c : cookie){
            if(c.getName().equals("k")){
                k = Integer.parseInt(c.getValue());
            }
        }
        PrintWriter out = response.getWriter();
        out.println("<h2>Square of sum is: "+k*k);


    }
}
