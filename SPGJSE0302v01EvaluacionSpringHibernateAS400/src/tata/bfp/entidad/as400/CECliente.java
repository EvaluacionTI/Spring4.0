package tata.bfp.entidad.as400;

import java.io.Serializable;

public class CECliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int idCodigo;
	String tipoDocumento;
	String numeroDocumento;
	String nombre;
	
	public CECliente(){

	}
	
	public CECliente(int pIdCodigo, String pTipoDocumento, String pNumeroDocumento, String pNombre){
		this.idCodigo = pIdCodigo;
		this.tipoDocumento = pTipoDocumento;
		this.numeroDocumento = pNumeroDocumento;
		this.nombre = pNombre;
	}

	public int getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(int idCodigo) {
		this.idCodigo = idCodigo;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString(){
		return "Cliente [Id =" + idCodigo + ", Tipo Documento =" + tipoDocumento + " Número Documento = " + numeroDocumento + ", Nombre =" + nombre
				+ "]";
	}

}
