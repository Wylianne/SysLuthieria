<%-- 
    Document   : editar
    Created on : 21/10/2016, 00:45:32
    Author     : Wylianne
--%>

<%@page import="AcessoDados.AcessoTipoInstrumento"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>

    <%
        ResultSet res;
        AcessoTipoInstrumento t_instrumento = new AcessoTipoInstrumento();
        int id;
        String tipo="";
        String descricao="";
            
        
        int id_post = Integer.parseInt(request.getParameter("id_post"));
            
        res = t_instrumento.BuscaExistente(id_post);
        
        boolean rs_isEmpty = !res.next();
 
        if(!rs_isEmpty){
            tipo = res.getString("nome");
            if(tipo == null){tipo = "";}
            
        
            descricao = res.getString("descricao");
            if(descricao == null){descricao = "";}
        }
       
    %>
 
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Instrumento</h1>
            <hr>
            <form name="formEditarTipoInstrumento" method="post" action="../SrvTipoInstrumento" >
                Tipo<em>*</em> <input value="<%= tipo%>" class="form-control" name="tipo" type="text" minlength="4" required /></br>
                Descrição<em>*</em> <textarea class="form-control" name="descricao" required><%= descricao%></textarea>
                <input type="hidden" name="id_post" value="<%= id_post%>" />
               
                <hr>
                <button type="submit" class="btn btn-primary">Atualizar</button>
            </form>
        </div>
    </body>
</html>
