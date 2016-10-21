package org.apache.jsp.servico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import AcessoDados.AcessoServico;
import java.io.IOException;
import Servlets.SrvLogin;
import java.util.logging.Logger;
import java.util.logging.Level;
import AcessoDados.AcessoLogin;
import java.sql.ResultSet;
import java.io.PrintWriter;

public final class consultar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/servico/../inc/header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Optional theme -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            td{\r\n");
      out.write("                vertical-align: middle;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .excluir{\r\n");
      out.write("               /*color: #000;*/\r\n");
      out.write("               background: transparent;\r\n");
      out.write("            }\r\n");
      out.write("            .excluir:hover   {               \r\n");
      out.write("                background-image: linear-gradient(to bottom, #ea0000, #ff1414);\r\n");
      out.write("                border-color: #ea0000; /*set the color you want here*/\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write(" <ul class=\"nav navbar-nav\"> \r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><font><font>SysLuthieria</font></font></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <li id=\"home\"><a href=\"http://localhost:8080/SysLuthieria/index.jsp\">Home</a></li>\r\n");
      out.write("                <li id=\"cliente\" class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Cliente\r\n");
      out.write("                    <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/cliente/cadastrar.jsp\">Cadastrar</a></li>\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/cliente/consultar.jsp\">Consultar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"servico\" class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Servi&ccedil;os\r\n");
      out.write("                    <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/servico/cadastrar.jsp\">Cadastrar</a></li>\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/servico/consultar.jsp\">Consultar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"produto\" class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Produto\r\n");
      out.write("                    <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/cadastrar.jsp\">Cadastrar</a></li>\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/consultar.jsp\">Consultar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"instrumento\" class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> Tipo de Instrumento\r\n");
      out.write("                    <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/tipoinstrumento/cadastrar.jsp\">Cadastrar</a></li>\r\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/tipoinstrumento/consultar.jsp\">Consultar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            var url = window.location.href;\r\n");
      out.write("            url = url.substr(35, 5);\r\n");
      out.write("            if (url == \"\"){\r\n");
      out.write("                $('#home').addClass('active');\r\n");
      out.write("            }else\r\n");
      out.write("                if (url == \"clien\"){\r\n");
      out.write("                    $('#cliente').addClass('active');\r\n");
      out.write("                }else\r\n");
      out.write("                    if(url == \"instr\"){\r\n");
      out.write("                        $('#instrumento').addClass('active');\r\n");
      out.write("                    }else\r\n");
      out.write("                        if(url == \"produ\"){\r\n");
      out.write("                            $('#produto').addClass('active');\r\n");
      out.write("                        }else\r\n");
      out.write("                            if(url == \"servi\"){\r\n");
      out.write("                                $('#servico').addClass('active');\r\n");
      out.write("                            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("              <h1>Lista de Serviços</h1>\r\n");
      out.write("               \r\n");
      out.write("                <table id=\"product\" align=\"center\" width=\"100%\" class=\"table table-striped table-bordered\" >\r\n");
      out.write("                <thead><tr><th width=\"10%\">Excluir</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th><th width=\"10%\">Editar</th></tr></thead>\r\n");
      out.write("                    <tfoot><tr><th>Excluir</th><th>Nome</th> <th>Descrição</th><th>Valor</th><th>Prazo</th><th>Editar</th></tr></tfoot><tbody>\r\n");
      out.write("                    ");

     
        
         response.setContentType("text/html;charset=UTF-8");
        
         try {
            ResultSet res;
            AcessoServico servico = new AcessoServico();
            int id = 0;
            String nome = "";
            String descricao = "";
            double valor = 0;
            int prazo = 0;
            res = servico.Lista();
            while (res.next()) {
                id = res.getInt("id");
                nome = res.getString("nome");
                descricao = res.getString("descricao");
                valor = res.getDouble("valor");
                prazo = res.getInt("prazo");
                out.println("<tr><td align='center'><form method='post' action='../SrvExcluir'><input type='hidden' value='"+id+"' name='id_post'><input type='hidden' value='servico' name='src'>"
                        + "<button type='submit' class='btn btn-default excluir'><span class='glyphicon glyphicon-trash'></span></button></form>"
                        + "</td><td>" + nome 
                        + "</td><td>" + descricao
                        + "</td><td>" + valor
                        + "</td><td>" + prazo
                        + "</td><td align='center'><form method='post' action='editar.jsp'><input type='hidden' value='"+id+"' name='id_post'>"
                        + "<button type='submit' class='btn btn-default'><span class='glyphicon glyphicon-pencil'></span></button></form></td>"
                        + "</tr>");
            }          
            
        } catch (Exception ex) {
            Logger.getLogger(SrvLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         
      out.write("\r\n");
      out.write("        </tbody></table></div>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.12.3.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $('#product').DataTable();});\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
