<%-- 
    Document   : index
    Created on : 17/10/2016, 18:07:28
    Author     : Wylianne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>


        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <ul class="nav navbar-nav"> 
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"><font><font>SysLuthieria</font></font></a>
                </div>
                <li><a href="index.jsp">Home</a></li>
                <li class="dropdown active">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Cliente
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="cliente/cadastrarCliente.jsp">Cadastrar</a></li>
                      <li><a href="cliente/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
                <li  class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Serviços
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="servicos/cadastrarCliente.jsp">Cadastrar</a></li>
                      <li><a href="servicos/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
                <li  class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Produto
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="produto/cadastrarCliente.jsp">Cadastrar</a></li>
                      <li><a href="produto/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
                <li  class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Tipo de Instrumento
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="instrumento/cadastrarCliente.jsp">Cadastrar</a></li>
                      <li><a href="instrumento/consultar.jsp">Consultar</a></li>
                    </ul>
                </li>
                
            </ul>
        </nav>
        
        
        <div style="margin-left: 10%; margin-right: 10%;">
            <h1>Cadastrar Cliente</h1>
            <hr>
            <form name="formCadastrarCliente" method="post" action="responsecliente.jsp" >
                Nome: <input class="form-control" name="nome" type="text"  /></br>
                Telefone: <input class="form-control" name="telefone" type="text" />
                <hr>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
