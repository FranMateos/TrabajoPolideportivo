package persistence;
// Generated 13 feb. 2018 10:14:40 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Deporte generated by hbm2java
 */
public class Deporte implements java.io.Serializable {

	private BigDecimal codDeporte;
	private Monitor monitor;
	private Polideportivo polideportivo;
	private String descripcionDeporte;
	private BigDecimal precioDeporte;
	private Set matriculadoses = new HashSet(0);

	public Deporte() {
	}

	public Deporte(BigDecimal codDeporte, Monitor monitor, Polideportivo polideportivo) {
		this.codDeporte = codDeporte;
		this.monitor = monitor;
		this.polideportivo = polideportivo;
	}
	
	public Deporte(BigDecimal codDeporte, String monitor, int polideportivo) {
		this.codDeporte = codDeporte;
		this.monitor=new Monitor();
		this.monitor.setDniMonitor(monitor);
		this.polideportivo=new Polideportivo();
		this.polideportivo.setCodPolideportivo(new BigDecimal(polideportivo));
	}
	
	public Deporte(BigDecimal codDeporte, BigDecimal precio, String monitor, int polideportivo) {
		this.codDeporte = codDeporte;
		this.precioDeporte=precio;
		this.monitor=new Monitor();
		this.monitor.setDniMonitor(monitor);
		this.polideportivo=new Polideportivo();
		this.polideportivo.setCodPolideportivo(new BigDecimal(polideportivo));
	}
        
        public Deporte(String descripcionDeporte, BigDecimal precio, int polideportivo, String monitor) {
		this.codDeporte = codDeporte;
		this.precioDeporte=precio;
                this.descripcionDeporte=descripcionDeporte;
		this.monitor=new Monitor();
		this.monitor.setDniMonitor(monitor);
		this.polideportivo=new Polideportivo();
		this.polideportivo.setCodPolideportivo(new BigDecimal(polideportivo));
	}

	public Deporte(BigDecimal codDeporte, Monitor monitor, Polideportivo polideportivo, String descripcionDeporte,
			BigDecimal precioDeporte, Set matriculadoses) {
		this.codDeporte = codDeporte;
		this.monitor = monitor;
		this.polideportivo = polideportivo;
		this.descripcionDeporte = descripcionDeporte;
		this.precioDeporte = precioDeporte;
		this.matriculadoses = matriculadoses;
	}

	public BigDecimal getCodDeporte() {
		return this.codDeporte;
	}

	public void setCodDeporte(BigDecimal codDeporte) {
		this.codDeporte = codDeporte;
	}

	public Monitor getMonitor() {
		return this.monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Polideportivo getPolideportivo() {
		return this.polideportivo;
	}

	public void setPolideportivo(Polideportivo polideportivo) {
		this.polideportivo = polideportivo;
	}

	public String getDescripcionDeporte() {
		return this.descripcionDeporte;
	}

	public void setDescripcionDeporte(String descripcionDeporte) {
		this.descripcionDeporte = descripcionDeporte;
	}

	public BigDecimal getPrecioDeporte() {
		return this.precioDeporte;
	}

	public void setPrecioDeporte(BigDecimal precioDeporte) {
		this.precioDeporte = precioDeporte;
	}

	public Set getMatriculadoses() {
		return this.matriculadoses;
	}

	public void setMatriculadoses(Set matriculadoses) {
		this.matriculadoses = matriculadoses;
	}

}
