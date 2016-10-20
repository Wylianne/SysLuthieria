<%-- 
    Document   : consultar
    Created on : 18/10/2016, 19:52:54
    Author     : victorcardoso
--%>
<%@page import="AcessoDados.AcessoServico"%>
<%@page import="java.io.IOException"%>
<%@page import="Servlets.SrvLogin"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="AcessoDados.AcessoLogin"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <div class="container">
              <h1>Lista de Serviços</h1>
               
                        <table id="product" align="center" width="100%" class="table table-striped table-bordered" >
                <thead><tr><th>ID</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th></tr></thead>
                    <tfoot><tr><th>ID</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th></tr></tfoot><tbody>
                    <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoServico servico = new AcessoServico();
            int id = 0;
            String nome = "";
            String marca = "";
            double valor = 0;
            int prazo = 0;
            res = servico.Lista();
            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                marca = res.getString("marca");
                valor = res.getDouble("valor");
                prazo = res.getInt("prazo");
                out.println("<tr><td>" + id
                        + "</td><td>" + nome 
                         + "</td><td>" + marca
                         + "</td><td>" + valor
                        + "</td><td>" + prazo+"</tr>");
            }          
            
        } catch (Exception ex) {
            Logger.getLogger(SrvLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         %>
        </tbody></table></div>
        <script src="//code.jquery.com/jquery-1.12.3.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
       
        
        
        <script>
            $(document).ready(function(){
                $('#product').DataTable();});
        </script>

        </body>
</html>
