package Controlador.Instituto;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Instituto.ClassAlumnoImp;
import Modelo.Instituto.ClassAlumno;

/**
 * Servlet implementation class ControladorAlumno
 */
@WebServlet("/ControladorRegistrarAlumno")
public class ControladorRegistrarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorRegistrarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperamos los Datos del Formulario			
		    String id=request.getParameter("id");
			String pass=request.getParameter("password");
			String nom=request.getParameter("nombre");
			String ape=request.getParameter("apellido");
			String dni=request.getParameter("dni");
			String corr=request.getParameter("correo");
			String fon=request.getParameter("fono");
			String carrera=request.getParameter("carrera");
			String fechanac=request.getParameter("fechanac");
			
			
		//Instanciamos las Clases
			ClassAlumno clal = new ClassAlumno();
			ClassAlumnoImp crudclal= new ClassAlumnoImp();
			
		//Asignamos Valores del Formulario
			clal.setIdAlumno(id);	
			clal.setPassAlumno(pass);
			clal.setNomAlumno(nom);
			clal.setApeAlumno(ape);
			clal.setDniAlumno(dni);
			clal.setCorreoAlumno(corr);
			clal.setFonoAlumno(fon);
			clal.setCarreraAlumno(carrera);		
			
		//Aplicamos la clase simpledateformat
			SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
			
			Date fecha;
			
			try{
				fecha= sdf.parse(fechanac);
				Date fechasql= new Date(fecha.getTime());
				
				clal.setFechanac(fechasql);
	
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			
			//Invocamos el m�todo RegistraProducto
			crudclal.RegistrarAlumno(clal);
				
			//Redireccionamos a la Vista
				request.getRequestDispatcher("/ListarAlumnoRegistrado.jsp").forward(request, response);
			
			doGet(request, response);
		}

}
