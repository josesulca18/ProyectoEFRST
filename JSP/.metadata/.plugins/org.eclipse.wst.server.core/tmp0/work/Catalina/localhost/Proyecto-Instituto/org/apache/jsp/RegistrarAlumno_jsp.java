/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2023-06-11 20:58:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class RegistrarAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        private static final String NUMBERS = "0123456789";

        public String generarContraseña(int longitud) {
            StringBuilder contraseña = new StringBuilder();
            Random random = new Random();

            // Generar al menos un número
            contraseña.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));

            // Generar letras minúsculas y mayúsculas
            for (int i = 1; i < longitud - 1; i++) {
                contraseña.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }

            return contraseña.toString();
        }
    
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Registar Alumnos</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Estilos/EstilosRegistrar.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.13.2/jquery-ui.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------>\r\n");
      out.write("<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------>\r\n");
      out.write("  <script>\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#fechanac\" ).datepicker({\r\n");
      out.write("    \tdateFormat: 'dd/mm/yy'\r\n");
      out.write("    });\r\n");
      out.write("  } );\t\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \t\t");

        // Generar un número aleatorio de 5 dígitos
        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 10000;

        // Generar la cadena resultante
        String result = "I2023" + randomNumber;
    		
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    ");
 
        int longitudContraseña = 10; // Define la longitud deseada de la contraseña
        String contraseñaGenerada = generarContraseña(longitudContraseña);
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("        function convertirMayusculas(input) {\r\n");
      out.write("            input.value = input.value.toUpperCase();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("   <script>\r\n");
      out.write("        function generarCodigo() {\r\n");
      out.write("            // Generar un número aleatorio de 5 dígitos\r\n");
      out.write("            var randomNumber = Math.floor(Math.random() * 90000) + 10000;\r\n");
      out.write("\r\n");
      out.write("            // Generar la cadena resultante\r\n");
      out.write("            var result = \"I2023\" + randomNumber;\r\n");
      out.write("\r\n");
      out.write("            // Mostrar el código generado en el elemento con id \"codigoGenerado\"\r\n");
      out.write("            document.getElementById(\"codigoGenerado\").innerHTML = result;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------>\r\n");
      out.write("<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"body\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"contenedor\">\r\n");
      out.write("\t\t<div class=\"botones\">\r\n");
      out.write("\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"Images/logopremi.png\" class=\"logo\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<ul class=\"list-group\">\r\n");
      out.write("\t\t\t   <a href=\"MenuPrincipal.jsp\" ><li class=\"list-group-item\">Menú Principal</li></a>\r\n");
      out.write("\t\t\t  <br>\r\n");
      out.write("\t\t\t  <a href=\"RegistrarAlumno.jsp\"><li class=\"list-group-item list-group-item-action list-group-item-secondary\">Registrar Alumnos</li></a>\r\n");
      out.write("\t\t\t  <a href=\"ListarAlumnoRegistrado.jsp\" ><li class=\"list-group-item\">Listar Alumnos</li></a>\r\n");
      out.write("\t\t\t  <a href=\"#\"><li class=\"list-group-item\">Actualizar Alumnos</li></a>\r\n");
      out.write("\t\t\t  <a href=\"#\"><li class=\"list-group-item\">Eliminar Alumnos</li></a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\t\t<div class=\"cuerpo\">\r\n");
      out.write("\t\t\t<form action=\"ControladorRegistrarAlumno\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\" align=\"center\">Registrar Alumno</h2>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t <br><br>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">ID</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t      <input type=\"text\" name=\"id\"  value=\"");
      out.print( result );
      out.write("\" class=\"form-control mb-2\" readonly> \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Contraseña</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t      <input type=\"text\" name=\"password\"  value=\"");
      out.print( contraseñaGenerada );
      out.write("\" class=\"form-control mb-2\" readonly> \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Nombres</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"nombre\" class=\"form-control mb-2\" oninput=\"convertirMayusculas(this)\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Apellidos</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"apellido\" class=\"form-control mb-2\" oninput=\"convertirMayusculas(this)\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">DNI</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"dni\" class=\"form-control mb-2\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Correo</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"correo\" class=\"form-control mb-2\" oninput=\"convertirMayusculas(this)\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Telefono</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"fono\" class=\"form-control mb-2\" >\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Carrera</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select class=\"form-control mb-2\" id=\"carrera\" name=\"carrera\" >\r\n");
      out.write("\t\t\t\t\t\t        <option selected>Seleccione...</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"ADMINISTRACIÓN DE EMPRESAS\">ADMINISTRACIÓN DE EMPRESAS</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"ADMINISTRACIÓN DE NEGOCIOS INTERNACIONALES\">ADMINISTRACIÓN DE NEGOCIOS INTERNACIONALES</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"COMPUTACIÓN E INFORMÁTICA\">COMPUTACIÓN E INFORMÁTICA</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"CONTABILIDAD\">CONTABILIDAD</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"DISEÑO GRÁFICO\">DISEÑO GRÁFICO</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"ELECTRICIDAD INDUSTRIAL\">ELECTRICIDAD INDUSTRIAL</option>\r\n");
      out.write("\t\t\t\t\t\t        <option value=\"MECÁNICA AUTOMOTRIZ\">MECÁNICA AUTOMOTRIZ</option>\r\n");
      out.write("\t\t\t\t\t\t      </select>\r\n");
      out.write("\t\t\t\t\t      </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr class=\"trcarrera\">\r\n");
      out.write("\t\t\t\t\t\t<td style=\"color: white;\">Fecha de Nacimiento</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"fechanac\" class=\"form-control mb-2\"  id=\"fechanac\">\r\n");
      out.write("\t\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\"  value=\"Hecho\" class=\"btn btn-primary\" id=\"registrar\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
