package pe.tata.bfp.modelo.beans;

import pe.tata.bfp.servicio.beans.CIMensaje;

public class CDMensaje implements CIMensaje{

	private String msMensaje;
	
	public CDMensaje() {
	}

	public CDMensaje(String psMensaje) {
		this.msMensaje = psMensaje;
	}
	
	@Override
	public void mostrarMensaje() {
		System.out.println(msMensaje);
	}

	public void setMostrarMensaje(String psMensaje){
		this.msMensaje = psMensaje;
	}
}
