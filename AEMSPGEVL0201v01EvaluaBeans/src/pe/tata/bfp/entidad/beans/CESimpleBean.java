package pe.tata.bfp.entidad.beans;

import java.io.Serializable;
import java.util.HashMap;

public class CESimpleBean implements Serializable{

	private static final long serialVersionUID = 108008784421115969L;
	private int id;
	private String nombre;
	private HashMap<String, Object> oLista;

	public CESimpleBean() {
	}

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

	public HashMap<String, Object> getoLista() {
		return oLista;
	}

	public void setoLista(HashMap<String, Object> oLista) {
		this.oLista = oLista;
	}
	
	public String toString(){
		return "CESimpleBean [id=" + id + "], [nombre = " + nombre + "], [HashMap = " + oLista + "]";
	}
}
