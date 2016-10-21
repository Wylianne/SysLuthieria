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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>
    
        <div class="container">
              <h1>Lista de Serviços</h1>
               
                <table id="product" align="center" width="100%" class="table table-striped table-bordered" >
                <thead><tr><th width="10%">Excluir</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th><th width="10%">Editar</th></tr></thead>
                    <tfoot><tr><th>Excluir</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th><th>Editar</th></tr></tfoot><tbody>
                    <%
     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoServico servico = new AcessoServico();
            int id = 0;
            String nome = "";
            String descricao = "";
            double valor = 0;
            int prazo = 0;
            res = servico.Lista();
            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                descricao = res.getString("descricao");
                valor = res.getDouble("valor");
                prazo = res.getInt("prazo");
                out.println("<tr><td align='center'><form method='post' action='../SrvExcluir'><input type='hidden' value='"+id+"' name='id_post'><input type='hidden' value='servico' name='src'>"
                        + "<button type='submit' class='btn btn-default excluir'><span class='glyphicon glyphicon-trash'></span></button></form>"
                        + "</td><td>" + nome 
                        + "</td><td>" + descricao
                        + "</td><td>" + valor
                        + "</td><td>" + prazo
                        + "</td><td align='center'><form method='post' action='editar.jsp'><input type='hidden' value='"+id+"' name='id_post'>"
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
