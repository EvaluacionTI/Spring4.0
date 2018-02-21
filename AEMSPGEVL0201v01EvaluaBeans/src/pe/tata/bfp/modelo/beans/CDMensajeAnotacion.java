package pe.tata.bfp.modelo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import pe.tata.bfp.servicio.beans.CIMensajeAnotacion;

@Configuration
public class CDMensajeAnotacion {

	public CDMensajeAnotacion() {
	}

	@Bean(name="idCDMensajeAnotacion")
	@Description("Carta Fianza con Anotaciones")
	public CIMensajeAnotacion mensajeAnotacion(){
		return (CIMensajeAnotacion) new CDMensajeAnotacion();
	}
}
