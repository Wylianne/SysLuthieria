<%-- 
    Document   : consultar
    Created on : 18/10/2016, 19:50:18
    Author     : victorcardoso
--%>

<%@page import="AcessoDados.AcessoProduto"%>
<%@page import="java.io.IOException"%>
<%@page import="Servlets.SrvLogin"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="AcessoDados.AcessoLogin"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>
 
    <div style="margin-left: 10%; margin-right: 10%;">
        <h1>Lista de Produtos</h1><hr>
              <table id="product" align="center" width="100%" class="table table-striped table-bordered" >
                <thead><tr><th width="10%">Excluir</th><th>Nome</th><th>Marca</th><th>Valor</th><th width="10%">Editar</th></tr></thead>
                    <tfoot><tr><th>Excluir</th><th>Nome</th><th>Marca</th><th>Valor</th><th>Editar</th></tr></tfoot><tbody>
                
                    <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoProduto produto = new AcessoProduto();
            int id = 0;
            String nome = "";
            String marca = "";
            double valor = 0;
            res = produto.Lista();

            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                marca = res.getString("marca");
                valor = res.getDouble("valor");
                out.println("<tr><td align='center'><form method='post' action='../SrvExcluir'><input type='hidden' value='"+id+"' name='id_post'><input type='hidden' value='produto' name='src'>"
                        + "<button type='submit' class='btn btn-default excluir'><span class='glyphicon glyphicon-trash'></span></button></form>"
                        + "</td><td>" + nome 
                        + "</td><td>" + marca
                        + "</td><td>" + valor
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
                $('#product').DataTable();});
        </script>

       
        
    </body>
</html>
