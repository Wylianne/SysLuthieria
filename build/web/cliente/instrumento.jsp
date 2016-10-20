<%-- 
    Document   : consultar
    Created on : 19/10/2016, 17:33:28
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoInstrumento"%>
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
            
        <table id="instrument" align="center" width="100%" class="table table-striped table-bordered" >
            <thead><tr><th>Nome</th><th>Telefone</th><th>Instrumentos</th><th>Editar</th></tr></thead>
                <tfoot><tr><th>Nome</th><th>Telefone</th><th>Instrumentos</th><th>Editar</th></tr></tfoot><tbody>
        <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoInstrumento instrumento = new AcessoInstrumento();
            int id;
            String cor;
            int ano;
            String marca;
            int id_cliente;
            String nome_instrumento;
            
            
            int id_post = Integer.parseInt(request.getParameter("id"));
            
            res = instrumento.BuscaExistente(id_post);

            while (res.next()) {
                id = res.getInt("id");
                cor = res.getString("cor");
                marca = res.getString("marca");
                nome_instrumento = res.getString("instrumento");
                
                out.println("<tr><td>" + nome_instrumento
                        + "</td><td>" +  cor
                        + "</td><td>"+ marca
                        +"</td><td><form method='post' action='editar.jsp'><input type='hidden' value='"+id+"'>"
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
                $('#instrument').DataTable();});
        </script>
    </body>
</html>
