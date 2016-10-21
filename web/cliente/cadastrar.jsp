<%-- 
    Document   : index
    Created on : 17/10/2016, 18:07:28
    Author     : Wylianne
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../inc/header.html" %>       
        
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Cliente</h1>
            <hr>
            <form name="formCadastrarCliente" method="post" action="../SrvCliente" >
                Nome<em>*</em> <input class="form-control" name="nome" type="text" minlength="4" required /></br>
                Telefone<em>*</em> <input class="form-control" name="telefone" type="text" pattern="\([0-9]{2}\) [0-9]{4,6}-[0-9]{3,4}$" title="Ex.: (99) 99999-9999" required />
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
