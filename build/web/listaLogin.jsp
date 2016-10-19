<%-- 
    Document   : listaLogin
    Created on : 18/10/2016, 21:44:47
    Author     : Wylianne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form method="post" action="SrvLogin">
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>ID</td>
                <td>Id_usuario</td>   
                <td>Id_escola</td>
                <td>dat_hor_login</td>

            </tr> 
            <tr>
                <td><input type="text" name="id" class="text" /></td>
                <td><input type="text" name="Id_usuario" class="text" /></td>            
                <td><input type="text" name="Id_escola" class="text" /></td>
                <td><input type="text" name="dat_hor_login" class="text" /></td>
                <td><input type='submit' name="Buscar" /></td>

            </tr>
        </table>
    </body>
</html>
