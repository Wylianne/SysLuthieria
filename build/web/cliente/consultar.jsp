<%-- 
    Document   : consultar
    Created on : 19/10/2016, 17:33:28
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoCliente"%>
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
        <h1>Consulta de Cliente</h1><hr>
            
        <table id="client" align="center" width="100%" class="table table-striped table-bordered" >
            <thead><tr><th>Nome</th><th>Telefone</th><th>Instrumentos</th><th>Editar</th></tr></thead>
                <tfoot><tr><th>Nome</th><th>Telefone</th><th>Instrumentos</th><th>Editar</th></tr></tfoot><tbody>
        <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoCliente cliente = new AcessoCliente();
            int id = 0;
            String nome = "";
            String telefone = "";
            res = cliente.Lista();

            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                telefone = res.getString("telefone");
                out.println("<tr><td style='vertical-align: middle;'>" + nome
                        + "</td><td style='vertical-align: middle;'>" +  telefone
                        + "</td><td align='center'><form method='post' action='instrumento.jsp'><input type='hidden' value='"+id+"' name='id'>"
                        + "<button type='submit' class='btn btn-default'><span class='glyphicon glyphicon-search'></span></button></form></td>"
                        + "<td align='center'><form method='post' action='editar.jsp'><input type='hidden' value='"+id+"' name='id_post'>"
                        + "<button type='submit' class='btn btn-default'><span class='glyphicon glyphicon-pencil'></span></button></form></td>"
                        + "</tr>");
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
                $('#client').DataTable();});
        </script>
    </body>
</html>
