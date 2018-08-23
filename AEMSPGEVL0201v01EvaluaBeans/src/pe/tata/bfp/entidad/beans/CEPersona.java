package pe.tata.bfp.entidad.beans;

import java.io.Serializable;
import java.util.Collection;

public class CEPersona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String nombre;
	String fechaNacimiento;
	CEMensaje oCEMensaje;
	Collection<CEMensaje> oLista;
	
	// 1.0 Bean simple 
	public CEPersona() {
	}

	// 2.0 Bean con inyección por constructor
	public CEPersona(String psNombre){
		this.nombre = psNombre;
	}
	
	// 3.0 Bean con referencia de objetos constructores
	public CEPersona (int piId, CEMensaje poCEMensaje){
		this.id = piId;
		this.oCEMensaje = poCEMensaje;		
	}
	
	// 4.0 Bean con inyección de propiedades con valores simples
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	// 5.0 Bean con inyección de propiedades con Listas
	
	public void setMensaje(Collection<CEMensaje> poLista){
		this.oLista = poLista;
	}
	
	public String toString(){
		return "Id = [" + id + " ] Nombre = [ " + nombre + " ] Fecha Nacimiento = [ " + fechaNacimiento + " ]";
	}
	
}
