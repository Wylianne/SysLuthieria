<%-- 
    Document   : editar
    Created on : 20/10/2016, 14:23:55
    Author     : Wylianne
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="AcessoDados.AcessoCliente"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>      
        
    <%
        ResultSet res;
        AcessoCliente cliente = new AcessoCliente();
        int id;
        String nome="";
        String telefone="";
            
            
        int id_post = Integer.parseInt(request.getParameter("id_post"));
            
        res = cliente.BuscaExistente(id_post);
        
       boolean rs_isEmpty = !res.next();
 
        if(!rs_isEmpty){
            nome = res.getString("nome");
            if(nome == null){nome = "";}
            
        
            telefone = res.getString("telefone");
            if(telefone == null){telefone = "";}
        }
       
    %>
       
    <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Cliente</h1>
            <hr>
            <form name="formEditarCliente" method="post" action="../SrvCliente" >
                Nome<em>*</em> <input value="<%= nome%>" class="form-control" name="nome" type="text" minlength="4" required /></br>
                Telefone<em>*</em> <input value="<%= telefone%>" class="form-control" name="telefone" type="text" pattern="\([0-9]{2}\) [0-9]{4,6}-[0-9]{3,4}$" title="Ex.: (99) 99999-9999" required />
                <input type="hidden" name="id_post" value="<%= id_post%>" />
                <hr>
                <button type="submit" class="btn btn-primary">Atualizar</button>
            </form>
        </div>
    </body>
</html>
