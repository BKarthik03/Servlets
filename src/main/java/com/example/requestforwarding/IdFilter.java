package com.example.requestforwarding;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class IdFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        int id  = Integer.parseInt(req.getParameter("aId"));
        String name = req.getParameter("aName");

        if(id>1 && name.length()>=3)
            filterChain.doFilter(servletRequest, servletResponse);
        else
            out.print("<h2>Invalid Input</h2><h4>Id should be a natural Number and Name should be of at least 3 characters</h4>");
    }
}
