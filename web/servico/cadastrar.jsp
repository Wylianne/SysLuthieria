<%-- 
    Document   : cadastraServicos
    Created on : 17/10/2016, 21:48:30
    Author     : victorcardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>
    
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Serviços</h1>
            <hr>
          
            <form name="formCadastrarCliente" method="post" action="../SrvServico" >
                Nome: <input class="form-control" name="nome" type="text" minlength="4" required /></br>
                Descrição: <textarea class="form-control" name="descricao" required ></textarea>
                Valor: <input class="form-control" name="valor" type="tel" title="Ex.: 1999.00" pattern="[0-9]{1,5}.[0-9]{2}$" required /></br>
                Prazo: <input class="form-control" name="prazo" type="tel" pattern="[0-9]+$" required /></br>
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>

