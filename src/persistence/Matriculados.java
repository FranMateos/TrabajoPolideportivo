package persistence;
// Generated 13 feb. 2018 10:14:40 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Matriculados generated by hbm2java
 */
public class Matriculados implements java.io.Serializable {

	private MatriculadosId id;
	private Alumno alumno;
	private Deporte deporte;
	private Date fechaMatriculacion;

	public Matriculados() {
	}

	public Matriculados(MatriculadosId id, Alumno alumno, Deporte deporte) {
		this.id = id;
		this.alumno = alumno;
		this.deporte = deporte;
	}

	public Matriculados(MatriculadosId id, Alumno alumno, Deporte deporte, Date fechaMatriculacion) {
		this.id = id;
		this.alumno = alumno;
		this.deporte = deporte;
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public MatriculadosId getId() {
		return this.id;
	}

	public void setId(MatriculadosId id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return this.alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public Date getFechaMatriculacion() {
		return this.fechaMatriculacion;
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

}