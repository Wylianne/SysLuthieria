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
import AcessoDados.AcessoLogin;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wylianne
 */
public class SrvLogin extends HttpServlet {

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
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         try {
            ResultSet res;
            AcessoLogin login = new AcessoLogin();
            int id = 0;
            int id_usuario = 0;
            int id_escola = 0;
            String dat_hor_login = "";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SrvLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SrvLogin at " + request.getContextPath() + "</h1>");
            out.println("<table align=center width=289 border=1 class=datos_form>");
            out.println("<tr class=titulo_tabla><td colspan=4>LISTADO DE LOGIN </td></tr> ");
            out.println("<tr><td>ID</td><td>id_usuario</td><td>id_escola</td><td>dat_hor_login</td></tr>");
            res = login.Lista();
            
           
                  res = login.Lista();

            while (res.next()) {
                id = res.getInt("id");
                id_usuario = res.getInt("id_usuario");
                id_escola = res.getInt("id_escola");
                dat_hor_login = res.getString("dat_hor_login");
                out.println("<tr><td>" + id
                        + "</td><td>" + id_usuario 
                        + "</td><td>" + id_escola
                        + "</td><td>" + dat_hor_login+"</tr>");
            }
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
            
        } catch (Exception ex) {
            Logger.getLogger(SrvLogin.class.getName()).log(Level.SEVERE, null, ex);
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
