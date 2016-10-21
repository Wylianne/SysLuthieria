<%-- 
    Document   : editar
    Created on : 21/10/2016, 01:17:31
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoProduto"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>


    <%
        ResultSet res;
        AcessoProduto produto = new AcessoProduto();
        
        int id = 0;
        String nome = "";
        String marca = "";
        double valor = 0.00;
            
        
        int id_post = Integer.parseInt(request.getParameter("id_post"));
            
        res = produto.BuscaExistente(id_post);
        
        boolean rs_isEmpty = !res.next();
 
        if(!rs_isEmpty){
            nome = res.getString("nome");
            if(nome == null){nome = "";}
            
        
            marca = res.getString("marca");
            if(marca == null){marca = "";}
            
            valor = res.getDouble("valor");
            if(valor <=0 ){valor = 0.00;}
        }
       
    %>
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Produto</h1>
            <hr>          
            <form name="formEditarProduto" method="post" action="../SrvProduto" >
                Nome<em>*</em> <input value="<%= nome%>" class="form-control" name="nome" type="text" minlength="4" required /></br>
                Marca<em>*</em> <input value="<%= marca%>" class="form-control" name="marca" type="text" minlength="4" required/></br>
                Valor<em>*</em> <input value="<%= valor%>" class="form-control" name="valor" type="text" title="Ex.: 1999.00" pattern="[0-9]{1,5}.[0-9]{2}$" required /></br>
                <input type="hidden" name="id_post" value="<%= id_post%>" />
                <hr>
                <button type="submit" class="btn btn-primary">Atualizar</button>
            </form>
        </div>
    </body>
</html>