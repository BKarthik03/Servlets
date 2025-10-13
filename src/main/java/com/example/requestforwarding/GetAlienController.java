package com.example.requestforwarding;

import DAO.AlienDAO;
import Model.Alien;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int aid =  Integer.parseInt(req.getParameter("aId"));
        AlienDAO  alienDAO = new AlienDAO();
        Alien a = alienDAO.getAlien(aid);

        req.setAttribute("alien",a);
        RequestDispatcher rd = req.getRequestDispatcher("showAlien.jsp");
        rd.forward(req,resp);
    }
}
