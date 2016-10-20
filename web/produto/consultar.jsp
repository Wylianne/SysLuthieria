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

<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <div class="container">
              <h1>Lista de Produtos</h1>
                <table border="1" class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nome</th>
                            <th>Marca</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
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
                out.println("<tr><td>" + id
                        + "</td><td>" + nome 
                         + "</td><td>" + marca
                        + "</td><td>" + valor+"</td></tr>");
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
