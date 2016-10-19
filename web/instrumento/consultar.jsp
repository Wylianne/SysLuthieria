<%-- 
    Document   : consultar
    Created on : 19/10/2016, 17:33:28
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoTipoInstrumento"%>
<%@page import="java.io.IOException"%>
<%@page import="Servlets.SrvLogin"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="AcessoDados.AcessoLogin"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>

<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <div style="margin-left: 10%; margin-right: 10%;">
        <h1>Consulta de Tipo de Instrumento</h1><hr>
            
        <table id="instruments" align="center" width="100%" class="table table-striped table-bordered" >
            <thead><tr><th>ID</th><th>Nome</th><th>Descriçao</th></tr></thead>
                <tfoot><tr><th>ID</th><th>Nome</th><th>Descrição</th></tr></tfoot><tbody>
        <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoTipoInstrumento instrumento = new AcessoTipoInstrumento();
            int id = 0;
            String nome = "";
            String descricao = "";
            res = instrumento.Lista();

            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                descricao = res.getString("descricao");
                out.println("<tr><td>" + id
                        + "</td><td>" + nome 
                        + "</td><td>" + descricao+"</tr>");
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
                $('#instruments').DataTable();});
        </script>
    </body>
</html>
