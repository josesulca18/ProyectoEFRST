package Modelo.Instituto;

import java.util.Date;

public class ClassAlumno {
	
	private String idAlumno;
	private String passAlumno;
	private String nomAlumno;
	private String apeAlumno;
	private String dniAlumno;
	private String correoAlumno;
	private String fonoAlumno;
	private String carreraAlumno;
	private Date fechanac;
	
	
// M�todos Getters y Setters
	public String getIdAlumno() {
		return idAlumno;
	}
	public String getNomAlumno() {
		return nomAlumno;
	}
	
	public String getPassAlumno() {
		return passAlumno;
	}
	public void setPassAlumno(String passAlumno) {
		this.passAlumno = passAlumno;
	}
	public String getApeAlumno() {
		return apeAlumno;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public String getCorreoAlumno() {
		return correoAlumno;
	}
	public String getFonoAlumno() {
		return fonoAlumno;
	}
	public String getCarreraAlumno() {
		return carreraAlumno;
	}
	public Date getFechanac() {
		return fechanac;
	}
	public void setIdAlumno(String usuario) {
		this.idAlumno = usuario;
	}
	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}
	public void setApeAlumno(String apeAlumno) {
		this.apeAlumno = apeAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public void setCorreoAlumno(String correoAlumno) {
		this.correoAlumno = correoAlumno;
	}
	public void setFonoAlumno(String fonoAlumno) {
		this.fonoAlumno = fonoAlumno;
	}
	public void setCarreraAlumno(String carreraAlumno) {
		this.carreraAlumno = carreraAlumno;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}


	
	public ClassAlumno(String idAlumno, String passAlumno, String nomAlumno, String apeAlumno, String dniAlumno,
			String correoAlumno, String fonoAlumno, String carreraAlumno, Date fechanac) {
		this.idAlumno = idAlumno;
		this.passAlumno = passAlumno;
		this.nomAlumno = nomAlumno;
		this.apeAlumno = apeAlumno;
		this.dniAlumno = dniAlumno;
		this.correoAlumno = correoAlumno;
		this.fonoAlumno = fonoAlumno;
		this.carreraAlumno = carreraAlumno;
		this.fechanac = fechanac;
	}
	
	public ClassAlumno() {
	// TODO Auto-generated constructor stub
	}
	


	

}// fin de la clase
