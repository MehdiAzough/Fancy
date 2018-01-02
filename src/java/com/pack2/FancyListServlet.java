/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack2;

import com.pack1.FancyList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Azough Mehdi
 */
@WebServlet(name = "FancyListServlet", urlPatterns = {"/FancyListServlet"})
public class FancyListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int size = 10 ; 
        double range=50.0;
        String adress;
        
        try{
            size = Integer.parseInt(request.getParameter("size"));
            range  = Double.parseDouble(request.getParameter("range"));
            out.print(size);
        }catch(Exception e){}
        
        try{
            InitialContext context = new InitialContext();
            FancyList fL = (FancyList) context.lookup("FancyListJNDIName");
            fL.initializeNumbers(size, range);
            adress = "fancyList.jsp";
            request.setAttribute("fancyList", fL);
            RequestDispatcher dispatcher = request.getRequestDispatcher(adress);
            dispatcher.forward(request, response);
            fL.removeList();
            
        }catch(Exception e){
        request.setAttribute("size",size);
                request.setAttribute("range",range);
                request.setAttribute("probleme",e.getMessage());
        adress = "notfound.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(adress);
        dispatcher.forward(request, response);
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
