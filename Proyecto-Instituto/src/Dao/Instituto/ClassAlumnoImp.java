package Dao.Instituto;

import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

import ConectarBD.ConectarMYSQL;
import Interfaces.Instituto.IntAlumneable;
import Modelo.Instituto.ClassAlumno;

public class ClassAlumnoImp  implements IntAlumneable{

	@Override
	public void RegistrarAlumno(ClassAlumno cestu) {
		//
		ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="insert into tbl_alumno values(?,?,?,?,?,?,?,?,?);";
		
		PreparedStatement ps=null;
		
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			ps.setString(1,cestu.getIdAlumno());
			ps.setString(2,cestu.getPassAlumno());
			ps.setString(3,cestu.getNomAlumno());
			ps.setString(4,cestu.getApeAlumno());
			ps.setString(5,cestu.getDniAlumno());
			ps.setString(6,cestu.getCorreoAlumno());
			ps.setString(7,cestu.getFonoAlumno());
			ps.setString(8,cestu.getCarreraAlumno());
			ps.setDate(9,new java.sql.Date(cestu.getFechanac().getTime()));
			
			int x=ps.executeUpdate();
			
			if(x>0){
				
				System.out.println("Alumno Registrado en la BD");
				
			}else {
				
				System.out.println("Alumno No Registrado en la BD");
				
			}// fin del else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// fin del m�todo RegistrarAlumno

	@Override
	public void ActualizarAlumno(ClassAlumno cestu) {
		//
		ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="update tbl_alumno set pass_alumno=?, nom_alumno=?,ape_alumno=?, dni_alumno=?,correo_alumno=?,fono_alumno=?, carrera_alumno=?,fecha_nac=? where id_alumno=?;";
		
		PreparedStatement ps=null;
		
		try {
			
			ps=conex.conexionbd().prepareStatement(sql);
			
			ps.setString(2,cestu.getPassAlumno());
			ps.setString(3,cestu.getNomAlumno());
			ps.setString(4,cestu.getApeAlumno());
			ps.setString(5,cestu.getDniAlumno());
			ps.setString(6,cestu.getCorreoAlumno());
			ps.setString(7,cestu.getFonoAlumno());
			ps.setString(8,cestu.getCarreraAlumno());
			ps.setDate(9,new java.sql.Date(cestu.getFechanac().getTime()));
			ps.setString(1,cestu.getIdAlumno());
			
			int z=ps.executeUpdate();
			
			if(z>0){
				
				System.out.println("Alumno Actualizado Correctamente");
				
			}else {
				System.out.println("Alumno No Actualizado Correctamente");
			}// fin del else
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// fin del catch
		
	}// fin del m�todo ActualizarAlumno

	@Override
	public void ElimnarAlumno(ClassAlumno cestu) {
		// 
		
		ConectarMYSQL conex =new ConectarMYSQL();
		
		String sql="delete from tbl_Alumno where id_Alumno=?";
		
		PreparedStatement ps=null;
		
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			
			ps.setString(1,cestu.getIdAlumno());
			
			int x=ps.executeUpdate();
			
			if(x>0){
				
				System.out.println("Alumno Eliminado de la BD");
				
			}else {
				
				System.out.println("Alumno No Eliminado de la BD");
				
			}// fin del else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// fin del catch
		
		
		
	}// fin del m�todo EliminarAlumno

	@Override
	public List<ClassAlumno> ListarAlumno() {
		//
		ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="select * from tbl_alumno;";
		
		
		PreparedStatement ps=null;
		ResultSet rs=null;

		List<ClassAlumno> Listar=new ArrayList<ClassAlumno>();
		
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			
			rs=ps.executeQuery();
			
			while(rs.next()){
				ClassAlumno clestu=new ClassAlumno();
				
				clestu.setIdAlumno(rs.getString(1));
				clestu.setPassAlumno(rs.getString(2));
				clestu.setNomAlumno(rs.getString(3));
				clestu.setApeAlumno(rs.getString(4));
				clestu.setDniAlumno(rs.getString(5));
				clestu.setCorreoAlumno(rs.getString(6));
				clestu.setFonoAlumno(rs.getString(7));
				clestu.setCarreraAlumno(rs.getString(8));
				clestu.setFechanac(rs.getDate(9));
				
				Listar.add(clestu);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return Listar;
	}// fin del m�todo ListarAlumno

	@Override
	public ClassAlumno BuscarAlumno(ClassAlumno cestu) {
		// 
		ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="select * from tbl_Alumno where id_alumno=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ClassAlumno estualm=new ClassAlumno();
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			
			ps.setString(1,cestu.getIdAlumno());
			
			rs=ps.executeQuery();
			
			if(rs.next()){
				estualm.setIdAlumno(rs.getString(1));
				estualm.setPassAlumno(rs.getString(2));
				estualm.setNomAlumno(rs.getString(3));
				estualm.setApeAlumno(rs.getString(4));
				estualm.setDniAlumno(rs.getString(5));
				estualm.setCorreoAlumno(rs.getString(6));
				estualm.setFonoAlumno(rs.getString(7));
				estualm.setCarreraAlumno(rs.getString(8));
				estualm.setFechanac(rs.getDate(9));
								
			}else {
				
			} // fin del else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// fin del catch
		
		return estualm;
	}//fin del m�todo BuscarAlumno
	
	
	
	public ClassAlumno ValidarAlumno(ClassAlumno cestu) {
		// 
		ConectarMYSQL conex=new ConectarMYSQL();
		
		String sql="select * from tbl_Alumno where idAlumno=?";
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ClassAlumno estualm=new ClassAlumno();
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			
			ps.setString(1,cestu.getIdAlumno());
			
			rs=ps.executeQuery();
			
			if(rs.next()){
				estualm.setIdAlumno(rs.getString(1));
				estualm.setNomAlumno(rs.getString(2));
				estualm.setApeAlumno(rs.getString(3));
				estualm.setDniAlumno(rs.getString(4));
				estualm.setCorreoAlumno(rs.getString(5));
				estualm.setFonoAlumno(rs.getString(6));
				estualm.setCarreraAlumno(rs.getString(7));
				estualm.setFechanac(rs.getDate(8));
								
			}else {
				
			} // fin del else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// fin del catch
		
		return estualm;
	}//fin del m�todo BuscarAlumno




}// fin de la calse