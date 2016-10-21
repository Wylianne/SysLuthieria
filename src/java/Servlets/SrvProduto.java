/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import AcessoDados.AcessoProduto;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wylianne
 */
public class SrvProduto extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SrvProduto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SrvProduto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        PrintWriter out = response.getWriter();
        
        int id_post = 0;
        String nome, marca;
        double valor;
        
        nome = new String(request.getParameter("nome").getBytes("ISO-8859-1"),"UTF-8");
        marca = new String(request.getParameter("marca").getBytes("ISO-8859-1"),"UTF-8");
        valor = Double.parseDouble(request.getParameter("valor"));
        
        if (request.getParameter("id_post") != null){
            id_post = Integer.parseInt(request.getParameter("id_post"));
        }
        
        AcessoProduto con = new AcessoProduto();
        
        String sql = "";
        try{
            if(id_post > 0){
                sql = "UPDATE PRODUTO SET nome = '"+nome+"', marca = '"+marca+"', valor = "+valor+" WHERE id = "+id_post+";";
            }else{
                sql = "INSERT INTO PRODUTO (nome, marca, valor) VALUES('"+nome+"', '"+marca+"', "+valor+");";
            }
            
            PreparedStatement stmt = (PreparedStatement) con.Conectar().prepareStatement(sql);
            
            
            stmt.execute();
            
            response.sendRedirect("produto/consultar.jsp"); 
            
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
