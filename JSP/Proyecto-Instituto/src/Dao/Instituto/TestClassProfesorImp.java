package Dao.Instituto;

import java.text.SimpleDateFormat;
import java.util.Date;

import Modelo.Instituto.ClassProfesor;

public class TestClassProfesorImp {

	public static void main(String[] args) {
		// instanciamos las respectivas clases
		
		ClassProfesor clusu=new ClassProfesor();
		
		ClassProfesorImp climp=new ClassProfesorImp();
		
		// asignamos valores a los metodos setter
		
		clusu.setIdProfesor("CARLOS");
		clusu.setPassProfesor("12345");
		
		// recuperamons valores de la base de datos
		
		ClassProfesor valusu=climp.ValidarProfesor(clusu);
		
		// aplicamos una condicion
		
		if(valusu.getIdProfesor()!=null && valusu.getPassProfesor()!=null){
			
			// emitimos un mensaje por consola 
			
			System.out.println("Credenciales Correctas");
		}else {
			System.out.println("Credenciales Incorrectas");
			
		}// FIN DE LA CONDICION

	}// fin del metodo principal

} // fin de la clase