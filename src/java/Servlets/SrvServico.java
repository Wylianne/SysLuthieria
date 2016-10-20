/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import AcessoDados.AcessoServico;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victorcardoso
 */
public class SrvServico extends HttpServlet {

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
        
        PrintWriter out = response.getWriter();

        int id, prazo;
        String nome, descricao;
        double valor;
                
        nome = new String(request.getParameter("nome"));
        descricao = new String(request.getParameter("descricao"));
        valor = Double.parseDouble(request.getParameter("valor"));
        prazo = Integer.parseInt(request.getParameter("prazo"));
        
        AcessoServico con = new AcessoServico();
        
        try {
            
            String sql = "INSERT INTO servico (nome,marca,valor,prazo) VALUES('"+nome+"', '"+descricao+"', "+valor+", "+prazo+");";
            PreparedStatement stmt = (PreparedStatement) con.Conectar().prepareStatement(sql);
            
            
            stmt.execute();
            
            response.sendRedirect("servicos/consultar.jsp"); 
            
         }catch (Exception e){
             out.println(e);
         }
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
