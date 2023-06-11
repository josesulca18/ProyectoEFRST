package Interfaces.Instituto;

import java.util.List;

import Modelo.Instituto.ClassProfesor;

public interface IntProfesoreable {
	
	// declaramos los metodos
	
	void RegistrarProfesor(ClassProfesor clusu);
	void ActualizarProfesor(ClassProfesor clusu);
	void EliminarProfesor(ClassProfesor clusu);
	List<ClassProfesor>ListarProfesor();
	ClassProfesor BuscarProfesor(ClassProfesor clusu);
	ClassProfesor ValidarProfesor(ClassProfesor clusu);

}// fin de la interface
