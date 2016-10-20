package org.apache.jsp.instrumento;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/instrumento/../inc/header.html");
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
      out.write(" ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write(" <ul class=\"nav navbar-nav\"> \n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><font><font>SysLuthieria</font></font></a>\n");
      out.write("                </div>\n");
      out.write("                <li id=\"home\"><a href=\"http://localhost:8080/SysLuthieria/index.jsp\">Home</a></li>\n");
      out.write("                <li id=\"cliente\" class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Cliente\n");
      out.write("                    <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/cliente/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/cliente/consultar.jsp\">Consultar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li id=\"servico\" class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Serviços\n");
      out.write("                    <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/servicos/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/servicos/consultar.jsp\">Consultar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li id=\"produto\" class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Produto\n");
      out.write("                    <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/produto/consultar.jsp\">Consultar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li id=\"instrumento\" class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> Tipo de Instrumento\n");
      out.write("                    <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/instrumento/cadastrar.jsp\">Cadastrar</a></li>\n");
      out.write("                      <li><a href=\"http://localhost:8080/SysLuthieria/instrumento/consultar.jsp\">Consultar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("         </nav>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var url = window.location.href;\n");
      out.write("            url = url.substr(35, 5);\n");
      out.write("            if (url == \"\"){\n");
      out.write("                $('#home').addClass('active');\n");
      out.write("            }else\n");
      out.write("                if (url == \"clien\"){\n");
      out.write("                    $('#cliente').addClass('active');\n");
      out.write("                }else\n");
      out.write("                    if(url == \"instr\"){\n");
      out.write("                        $('#instrumento').addClass('active');\n");
      out.write("                    }else\n");
      out.write("                        if(url == \"produ\"){\n");
      out.write("                            $('#produto').addClass('active');\n");
      out.write("                        }else\n");
      out.write("                            if(url == \"servi\"){\n");
      out.write("                                $('#servico').addClass('active');\n");
      out.write("                            }\n");
      out.write("        </script>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        <div style=\"margin-left: 10%; margin-right: 10%;\">\r\n");
      out.write("            <h1>Cadastrar Instrumento</h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <form name=\"formCadastrarCliente\" method=\"post\" action=\"../SrvInstrumento\" >\r\n");
      out.write("                Tipo: <input class=\"form-control\" name=\"tipo\" type=\"text\"  /></br>\r\n");
      out.write("                Descrição: <textarea class=\"form-control\" name=\"descricao\"></textarea>\r\n");
      out.write("               \r\n");
      out.write("                <hr>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Cadastrar</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
