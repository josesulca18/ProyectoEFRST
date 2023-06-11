package Modelo.Instituto;

import java.util.Date;

public class ClassProfesor {
	
	private String idProfesor;
	private String passProfesor;
	private String nomProfesor;
	private String apeProfesor;
	private String dniProfesor;
	private String correoProfesor;
	private String fonoProfesor;
	private String cursosProfesor;
	private Date fechanac;
	
	public String getIdProfesor() {
		return idProfesor;
	}
	public String getPassProfesor() {
		return passProfesor;
	}
	
	public String getNomProfesor() {
		return nomProfesor;
	}
	public String getApeProfesor() {
		return apeProfesor;
	}
	public String getDniProfesor() {
		return dniProfesor;
	}
	public String getCorreoProfesor() {
		return correoProfesor;
	}
	public String getFonoProfesor() {
		return fonoProfesor;
	}
	public Date getFechanac() {
		return fechanac;
	}
	public String getCursosProfesor() {
		return cursosProfesor;
	}
	
	///////////////////////////////////////////
	
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public void setPassProfesor(String passProfesor) {
		this.passProfesor = passProfesor;
	}
	public void setApeProfesor(String apeProfesor) {
		this.apeProfesor = apeProfesor;
	}
	public void setNomProfesor(String nomProfesor) {
		this.nomProfesor = nomProfesor;
	}
	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}
	public void setCorreoProfesor(String correoProfesor) {
		this.correoProfesor = correoProfesor;
	}
	public void setFonoProfesor(String fonoProfesor) {
		this.fonoProfesor = fonoProfesor;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}
	public void setCursosProfesor(String cursosProfesor) {
		this.cursosProfesor = cursosProfesor;
	}
	
	public ClassProfesor(String idProfesor, String passProfesor, String nomProfesor, String apeProfesor,
			String dniProfesor, String correoProfesor, String fonoProfesor, Date fechanac) {
		this.idProfesor = idProfesor;
		this.passProfesor = passProfesor;
		this.nomProfesor = nomProfesor;
		this.apeProfesor = apeProfesor;
		this.dniProfesor = dniProfesor;
		this.correoProfesor = correoProfesor;
		this.fonoProfesor = fonoProfesor;
		this.fechanac = fechanac;
	}
	
	public ClassProfesor() {
		// TODO Auto-generated constructor stub
	}
	
	
}// fin de la clase usuario..
