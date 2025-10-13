package com.example.requestforwarding;

import DAO.AlienDAO;
import Model.Alien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/addAlien")
public class AddAlienController extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int aId = Integer.parseInt(req.getParameter("aId"));
        String aName = req.getParameter("aName");
        String tech = req.getParameter("tech");

        Alien alien = new Alien();
        alien.setaId(aId);
        alien.setName(aName);
        alien.setTech(tech);

        AlienDAO alienDAO = new AlienDAO();

        PrintWriter out = resp.getWriter();
        if(alienDAO.addAlien(alien)){
            out.println("<h3>Alien Added Successfully!!</h3>");
        }else{
            out.println("<h3>Failed to add Alien!!</h3>");
        }

    }
}
