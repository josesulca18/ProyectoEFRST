package Controlador.Instituto;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Instituto.ClassAlumnoImp;
import Modelo.Instituto.ClassAlumno;

/**
 * Servlet implementation class ControladorListarAlumno
 */
@WebServlet("/ControladorListarAlumno")
public class ControladorListarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorListarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassAlumno clal=new ClassAlumno();
		ClassAlumnoImp clcrud=new ClassAlumnoImp();
		
		List<ClassAlumno>listado=clcrud.ListarAlumno();
		
		for(ClassAlumno list:listado){
			
			//Recuperamos los Datos del Formulario			
		    String id=list.getIdAlumno();
			String pass=list.getPassAlumno();
			String nom=list.getNomAlumno();
			String ape=list.getApeAlumno();
			String dni=list.getDniAlumno();
			String corr=list.getCorreoAlumno();
			String fon=list.getFonoAlumno();
			String carrera=list.getCarreraAlumno();
			//String fechanac=list.getFechanac();
			
			//Asignamos Valores del Formulario
			clal.setIdAlumno(id);	
			clal.setPassAlumno(pass);
			clal.setNomAlumno(nom);
			clal.setApeAlumno(ape);
			clal.setDniAlumno(dni);
			clal.setCorreoAlumno(corr);
			clal.setFonoAlumno(fon);
			clal.setCarreraAlumno(carrera);		
			
			//Invocamos el m�todo RegistraProducto
			clcrud.ListarAlumno();
			
		//Aplicamos la clase simpledateformat
			/*SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
			
			Date fecha;
			
			try{
				fecha= sdf.parse(fechanac);
				Date fechasql= new Date(fecha.getTime());
				
				clal.setFechanac(fechasql);

			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			*/
			request.setAttribute("id", id);
			request.setAttribute("password", pass);
			request.setAttribute("nombre", nom);
			request.setAttribute("apellido", ape);
			request.setAttribute("dni", dni);
			request.setAttribute("correo", corr);
			request.setAttribute("fono", fon);
			request.setAttribute("carrera", carrera);
				
			
			//Redireccionamos a la Vista
			request.getRequestDispatcher("/ListarAlumnoRegistrado.jsp").forward(request, response);
		}
				
	
	
			
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
