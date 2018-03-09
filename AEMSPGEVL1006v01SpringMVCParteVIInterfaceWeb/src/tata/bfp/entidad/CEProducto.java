package tata.bfp.entidad;

import java.io.Serializable;

public class CEProducto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1205446078291854780L;
	
	private int liId;
	private String lsDescripcion;
	private double ldPrecio;
	
	public int getIdentificador() {
		return liId;
	}

	public void setIdentificador(int liId) {
		this.liId = liId;
	}

	public String getDescripcion() {
		return lsDescripcion;
	}

	public void setDescripcion(String lsDescripcion) {
		this.lsDescripcion = lsDescripcion;
	}

	public double getPrecio() {
		return ldPrecio;
	}

	public void setPrecio(double ldPrecio) {
		this.ldPrecio = ldPrecio;
	}

	public String toString(){
		StringBuilder osbBuffer = new StringBuilder();
		
		osbBuffer.append("Id : " + getIdentificador() + ";");
		osbBuffer.append("Descripción : " + getDescripcion() + ";");
		osbBuffer.append("Precio : " + getPrecio());
		
		return osbBuffer.toString();
	}
	
}
