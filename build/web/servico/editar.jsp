<%-- 
    Document   : editar
    Created on : 21/10/2016, 01:50:13
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoServico"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>


    <%
        ResultSet res;
        AcessoServico servico = new AcessoServico();
        int id = 0, prazo = 0;
        String nome = "", descricao = "";
        double valor = 0.0;
            
            
        int id_post = Integer.parseInt(request.getParameter("id_post"));
            
        res = servico.BuscaExistente(id_post);
        
       boolean rs_isEmpty = !res.next();
 
        if(!rs_isEmpty){
            nome = res.getString("nome");
            if(nome == null){nome = "";}
            
        
            descricao = res.getString("descricao");
            if(descricao == null){descricao = "";}
            
            prazo = res.getInt("prazo");
            
            valor = res.getDouble("valor");
        }
       
    %>
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Serviços</h1>
            <hr>
          
            <form name="formCadastrarCliente" method="post" action="../SrvServico" >
                Nome: <input value="<%= nome%>" class="form-control" name="nome" type="text" minlength="4" required /></br>
                Descrição: <textarea class="form-control" name="descricao" required ><%= descricao%></textarea>
                Valor: <input value="<%= valor%>" class="form-control" name="valor" type="tel" title="Ex.: 1999.00" pattern="[0-9]{1,5}.[0-9]{2}$" required /></br>
                Prazo: <input value="<%= prazo%>" class="form-control" name="prazo" type="tel" pattern="[0-9]+$" required /></br>
                <input type="hidden" name="id_post" value="<%= id_post%>" />

                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>