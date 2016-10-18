<%-- 
    Document   : login
    Created on : 18/10/2016, 20:05:48
    Author     : victorcardoso
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
        <div class="container">
            <div style="width: 100%; margin: 0 auto; top: 0; left: 0;
                 right: 0;">
         <form class="form-horizontal">
                <div class="control-group">
                  <label class="control-label" for="inputEmail">E-mail</label>
                  <div class="controls">
                    <input id="inputEmail" type="text" name="email" placeholder="Digite o seu e-mail..." />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="inputPassword">Senha</label>
                  <div class="controls">
                    <input id="inputPassword" type="password" name="senha" placeholder="Digite a sua senha..." />
                  </div>
                </div>
                <div class="control-group" style="margin-top: 2%;">
                  <div class="controls">
                    <button class="btn btn-success" type="submit">Acessar</button>
                  </div>
                </div>
              </form>
                </div> 
            </div> 
    </body>
</html>
