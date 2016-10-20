<%-- 
    Document   : cadastraServicos
    Created on : 17/10/2016, 21:48:30
    Author     : victorcardoso
--%>
<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Serviços</h1>
            <hr>
          
            <form name="formCadastrarCliente" method="post" action="../SrvServico" >
                Nome: <input class="form-control" name="nomeServico" type="text" minlength="4" required /></br>
                Descrição: <textarea class="form-control" name="descricaoServico" required ></textarea>
                Valor: <input class="form-control" name="valorServico" type="number" required /></br>
                Prazo: <input class="form-control" name="prazoServico" type="number" required /></br>
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>

