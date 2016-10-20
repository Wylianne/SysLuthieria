<%-- 
    Document   : cadastrar
    Created on : 17/10/2016, 23:38:24
    Author     : Wylianne
--%>

<%@include file="../inc/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Produto</h1>
            <hr>          
            <form name="formCadastrarProduto" method="post" action="../SrvProduto" >
                Nome<em>*</em> <input class="form-control" name="nome" type="text" required /></br>
                Marca<em>*</em> <input class="form-control" name="marca" type="text" required/></br>
                Valor<em>*</em> <input class="form-control" name="valor" type="text" required /></br>
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>