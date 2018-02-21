package pe.tata.bfp.modelo.beans;

import pe.tata.bfp.servicio.beans.CIMensajeAnotacion;

public class CMMensajeAnotacion implements CIMensajeAnotacion{

	public CMMensajeAnotacion() {
	}

	@Override
	public void verMensajeAnotacion(String psMensaje) {
		System.out.println(" Mensaje con Anotación ----->" + psMensaje);
	}

}
