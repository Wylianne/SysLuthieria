<%-- 
    Document   : index
    Created on : 17/10/2016, 21:11:45
    Author     : Victor Cardoso
--%>

 <%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Instrumento</h1>
            <hr>
            <form name="formCadastrarCliente" method="post" action="../SrvInstrumento" >
                Tipo: <input class="form-control" name="tipo" type="text"  /></br>
                Descrição: <textarea class="form-control" name="descricao"></textarea>
               
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
