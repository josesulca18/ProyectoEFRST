package Interfaces.Instituto;

import java.util.List;

import Modelo.Instituto.ClassAlumno;

public interface IntAlumneable {
	
	void RegistrarAlumno(ClassAlumno cestu);
	void ActualizarAlumno(ClassAlumno cestu);
	void ElimnarAlumno(ClassAlumno cestu);
	List<ClassAlumno>ListarAlumno();
	ClassAlumno BuscarAlumno(ClassAlumno cestu);
	ClassAlumno ValidarAlumno(ClassAlumno cestu);
}
