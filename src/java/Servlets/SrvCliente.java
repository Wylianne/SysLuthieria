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
import AcessoDados.AcessoCliente;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wylianne
 */
public class SrvCliente extends HttpServlet {

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
//        processRequest(request, response);
//        
//         response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        
//         try {
//            ResultSet res;
//            AcessoCliente cliente = new AcessoCliente();
//            int id = 0;
//            String nome = "";
//            String telefone = "";
//            
//            out.println("<!DOCTYPE html>\n" +
//"<html>\n" +
//"    <head>\n" +
//"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
//"        <title>JSP Page</title>\n" +
//"        \n" +
//"        <!-- Latest compiled and minified CSS -->\n" +
//"        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" >\n" +
//"        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css\" >\n" +
//"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n" +
//"\n" +
//"        <!-- Optional theme -->\n" +
//"        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n" +
//"\n" +
//"        <!-- Latest compiled and minified JavaScript -->\n" +
//"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n" +
//"        \n" +
//"    </head>\n" +
//"    <body>\n" +
//"        <nav class=\"navbar navbar-inverse\">\n" +
//" <ul class=\"nav navbar-nav\"> \n" +
//"                <div class=\"navbar-header\">\n" +
//"                    <a class=\"navbar-brand\" href=\"#\"><font><font>SysLuthieria</font></font></a>\n" +
//"                </div>\n" +
//"                <li id=\"home\"><a href=\"http://localhost:8080/SysLuthieria/index.jsp\">Home</a></li>\n" +
//"                <li id=\"cliente\" class=\"dropdown active\">\n" +
//"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Cliente\n" +
//"                    <span class=\"caret\"></span></a>\n" +
//"                    <ul class=\"dropdown-menu\">\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/cliente/cadastrar.jsp\">Cadastrar</a></li>\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/SrvCliente\">Consultar</a></li>\n" +
//"                    </ul>\n" +
//"                </li>\n" +
//"                <li id=\"servico\" class=\"dropdown\">\n" +
//"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Serviços\n" +
//"                    <span class=\"caret\"></span></a>\n" +
//"                    <ul class=\"dropdown-menu\">\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/servicos/cadastrar.jsp\">Cadastrar</a></li>\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/servicos/consultar.jsp\">Consultar</a></li>\n" +
//"                    </ul>\n" +
//"                </li>\n" +
//"                <li id=\"produto\" class=\"dropdown\">\n" +
//"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Produto\n" +
//"                    <span class=\"caret\"></span></a>\n" +
//"                    <ul class=\"dropdown-menu\">\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/cadastrar.jsp\">Cadastrar</a></li>\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/consultar.jsp\">Consultar</a></li>\n" +
//"                    </ul>\n" +
//"                </li>\n" +
//"                <li id=\"instrumento\" class=\"dropdown\">\n" +
//"                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> Tipo de Instrumento\n" +
//"                    <span class=\"caret\"></span></a>\n" +
//"                    <ul class=\"dropdown-menu\">\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/instrumento/cadastrar.jsp\">Cadastrar</a></li>\n" +
//"                      <li><a href=\"http://localhost:8080/SysLuthieria/instrumento/consultar.jsp\">Consultar</a></li>\n" +
//"                    </ul>\n" +
//"                </li>\n" +
//"                \n" +
//"            </ul>\n" +
//"         </nav>");
//            
//            out.println("<div style=\"margin-left: 10%; margin-right: 10%;\">"
//                    + "<h1>Consulta de Cliente</h1><hr>");
//            out.println("<table id=\"cliente\" align=center width=100% class=\"table table-striped table-bordered\" >");
//            out.println("<thead><tr><th>ID</th><th>Nome</th><th>Telefone</th></tr></thead>"
//                    + "<tfoot><tr><th>ID</th><th>Nome</th><th>Telefone</th></tr></tfoot><tbody>");
//            res = cliente.Lista();
//            
//                  res = cliente.Lista();
//
//            while (res.next()) {
//                id = res.getInt("id");
//                nome = res.getString("nome");
//                telefone = res.getString("telefone");
//                out.println("<tr><td>" + id
//                        + "</td><td>" + nome 
//                        + "</td><td>" + telefone+"</tr>");
//            }
//            out.println("</tbody></table></div>");
//            
//            out.println("<script src=\"//code.jquery.com/jquery-1.12.3.js\"></script>");
//            out.println("<script src=\"https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>");
//            out.println("<script src=\"https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js\"></script>");
//            out.println("<script>\n"
//                        + "$(document).ready(function() { $('#cliente').DataTable();});\n"
//                    + "</script>"
//                    + "</body>");
//            out.println("</html>");
//            
//        } catch (Exception ex) {
//            Logger.getLogger(SrvLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        
        String nome, telefone;
        int id_post = 0;
        
        nome = request.getParameter("nome");
        telefone = request.getParameter("telefone");
        
        if (request.getParameter("id_post") != null){
            id_post = Integer.parseInt(request.getParameter("id_post"));
        }
        
        
        AcessoCliente con = new AcessoCliente();
        String sql= "";
        try{
            if(id_post > 0){
                sql = "UPDATE CLIENTE SET nome = '"+nome+"', telefone = '"+telefone+"' WHERE id = "+id_post+";";
            }else{
                sql = "INSERT INTO CLIENTE (nome, telefone) VALUES('"+nome+"', '"+telefone+"')";
            }
            
            
            PreparedStatement stmt = (PreparedStatement) con.Conectar().prepareStatement(sql);
            stmt.execute();
            
            response.sendRedirect("cliente/consultar.jsp"); 
            
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
