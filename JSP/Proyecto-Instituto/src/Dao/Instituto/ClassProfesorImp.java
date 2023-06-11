package Dao.Instituto;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import ConectarBD.ConectarMYSQL;
import Interfaces.Instituto.IntProfesoreable;
import Modelo.Instituto.ClassProfesor;

public class ClassProfesorImp implements IntProfesoreable {

	@Override
	public void RegistrarProfesor(ClassProfesor clusu) {
			ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="insert into tbl_profesor values(null,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=null;
		
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			ps.setString(2,clusu.getPassProfesor());
			ps.setString(3,clusu.getNomProfesor());
			ps.setString(4,clusu.getApeProfesor());
			ps.setString(5,clusu.getDniProfesor());
			ps.setString(6,clusu.getCorreoProfesor());
			ps.setString(7,clusu.getFonoProfesor());
			ps.setString(8,clusu.getCursosProfesor());
			ps.setDate(9,new java.sql.Date(clusu.getFechanac().getTime()));
			
			
			
			
			int x=ps.executeUpdate();
			
			if(x>0){
				
				System.out.println("Profesor Registrado en la BD");
				
			}else {
				
				System.out.println("Profesor No Registrado en la BD");
				
			}// fin del else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// fin del metodo registrarProfesor

	
	@Override
	public void ActualizarProfesor(ClassProfesor clusu) {
		// TODO Auto-generated method stub
		
	}// fin del metodo ActualizarProfesor

	@Override
	public void EliminarProfesor(ClassProfesor clusu) {
		// TODO Auto-generated method stub
		
	}// fin del metodo EliminarProfesor

	@Override
	public List<ClassProfesor> ListarProfesor() {
		// TODO Auto-generated method stub
		return null;
	} // fin del metodo ListarProfesor

	@Override
	public ClassProfesor BuscarProfesor(ClassProfesor clusu) {
		// TODO Auto-generated method stub
		return null;
	}// fin del metodo BuscarProfesor 

	@Override
	public ClassProfesor ValidarProfesor(ClassProfesor clusu) {
		// instanciamos la clase conectar
		
		ConectarMYSQL conex= new ConectarMYSQL();
		
		// creamos una cadena en mysql
		
		String sql="select * from tbl_profesor where id_profesor=? and pass_profesor=?";
		
		// aplicamos la interfaces predeterminada para base de datos
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		// instanciamos la claseProfesor
		
		ClassProfesor clalm= new ClassProfesor();
		//asignamos la cadena y la conexion
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			
			//asignamos los parametros
			
			ps.setString(1,clusu.getIdProfesor());
			ps.setString(2,clusu.getPassProfesor());
			
			
			//realizamos la ejecucion
			rs=ps.executeQuery();
			
			// aplicamos una condicion
			
			if(rs.next()){
				//almacenamos los valores recuperados de la BD
				
				clalm.setIdProfesor(rs.getString(1));
				clalm.setPassProfesor(rs.getString(2));
				
			}// fin de la condicion
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return clalm;
	} // fin del metodo ValidarProfesor
	

}// fin de la clase ProfesorImp
