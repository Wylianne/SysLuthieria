<%-- 
    Document   : index
    Created on : 17/10/2016, 21:11:45
    Author     : Victor Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@include file="../inc/header.html" %>
 
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Instrumento</h1>
            <hr>
            <form name="formCadastrarCliente" method="post" action="../SrvTipoInstrumento" >
                Tipo<em>*</em> <input class="form-control" name="tipo" type="text" minlength="4" required /></br>
                Descrição<em>*</em> <textarea class="form-control" name="descricao" required></textarea>
               
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
