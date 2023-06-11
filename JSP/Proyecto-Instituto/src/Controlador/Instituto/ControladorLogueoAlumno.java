package Controlador.Instituto;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Instituto.ClassAlumnoImp;
import Modelo.Instituto.ClassAlumno;

/**
 * Servlet implementation class ControladorLogueo
 */
@WebServlet("/ControladorLogueoAlumno")
public class ControladorLogueoAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogueoAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }// fin del constructor

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.write("Programando con Servlet y Base de Datos");
		
		//redireccionar con servelts
		
			//forma 1
				//response.sendRedirect("index.jsp");
				
			//forma 2
				//request.getRequestDispatcher("/index.jsp").forward(request, response);
		
			//Recuperamos los datos del formulario index(logueo)
				String usuario=request.getParameter("usuario");
				String pass=request.getParameter("password");
				String mensaje="";
				String imagen="";
				
				ClassAlumno clusu= new ClassAlumno();
				
				//Asignamos Valores
					clusu.setIdAlumno(usuario);
					clusu.setPassAlumno(pass);
				
				//Instanciamos clase
					ClassAlumnoImp climp= new ClassAlumnoImp();
					
				//Recuperamos los datos de la BD
					
				//Invocamos el m�todo validarusuario
					ClassAlumno valalumno=climp.BuscarAlumno(clusu);
					
			//Aplicamos condici�n
				//if(usuario.equals("cibertec") && pass.equals("123456"))
				//if(clusu.getUsuario().equals("cibertec") && clusu.getPassword().equals("123456")){
				
					//Condicion con base de datos
						if(valalumno.getIdAlumno()!= null  && valalumno.getPassAlumno()!= null){
					
					//mensaje de confirmacion
							
						mensaje="�Enhorabuena! Acabas de Ingresar al Sistema";
						imagen="Images/check.png";
					
					//enviamos alerta
						request.setAttribute("mensaje", mensaje);
						request.setAttribute("imagen", imagen);
					
					//redireccionamos al men� principal
						request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				}
				
				else{
					//mensaje de confimaci�n
						mensaje="Credenciales Incorrectas.";
						
					//enviamos a la vista
						request.setAttribute("mensaje", mensaje);
						
					//redireccionamos
						request.getRequestDispatcher("/indexAlumno.jsp").forward(request, response);
				}
				
				
		
		
	}// fin del metodo service

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	} // fin del metodo doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}// fin del metodo doPost

}
