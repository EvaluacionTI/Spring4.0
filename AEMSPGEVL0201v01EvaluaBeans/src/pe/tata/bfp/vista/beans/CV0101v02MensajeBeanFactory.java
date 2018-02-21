package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import pe.tata.bfp.entidad.beans.CEMensaje;

@SuppressWarnings("deprecation")
public class CV0101v02MensajeBeanFactory {
	private static final Logger moLog = LogManager.getLogger(CV0101v02MensajeBeanFactory.class);

	public CV0101v02MensajeBeanFactory() {
	}

	public static void main(String[] args) {
		try{
			// 1. Referenciamos al XML que referencia al Bean
			BeanFactory oBFMensaje = new XmlBeanFactory(new ClassPathResource("CE0101v02Mensaje.xml"));
			System.out.println(" Mostrar BeanFactory -----> " + oBFMensaje);

			// 2. Asociamos un objeto con el identificador de referencia de XML
			CEMensaje oCEMensaje = (CEMensaje)oBFMensaje.getBean("idCEMensaje");
			System.out.println(" Mostrar Objeto oCEMensaje -----> " + oCEMensaje);
			
			// 3.0 Imprimir el valor del Bean
			System.out.println(" Mostrar Mensaje del Bean -----> " + oCEMensaje.getMensaje());
			
			System.out.println(" Asignar Mensaje al Bean ");
			oCEMensaje.setMensaje("Carta Fianza por SUNAT");
			System.out.println(" Mostrar Mensaje Asignado -----> " + oCEMensaje.getMensaje());
			
		}catch(Exception ex){
			System.out.println(" Error excepción " + ex.getMessage());
			moLog.error(" Error :" + ex.getLocalizedMessage());
		}

	}
	

}
