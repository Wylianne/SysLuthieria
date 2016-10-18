<%-- 
    Document   : cadastraServicos
    Created on : 17/10/2016, 21:48:30
    Author     : victorcardoso
--%>
<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Cliente</h1>
            <hr>
          
            <form name="formCadastrarCliente" method="post" action="response.jsp" >
                Nome: <input class="form-control" name="nomeServico" type="text"  /></br>
                Descrição: <textarea class="form-control" name="descricaoServico"></textarea>
                Valor: <input class="form-control" name="valorServico" type="number"  /></br>
                Prazo: <input class="form-control" name="prazoServico" type="number"  /></br>
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>

