package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.tata.bfp.modelo.beans.CMMensajeAnotacion;

public class CV0601v01LecturaBeanAnotacion {
	@SuppressWarnings("unused")
	private static final Logger moLog = LogManager.getLogger(CV0601v01LecturaBeanAnotacion.class);
	
	public CV0601v01LecturaBeanAnotacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try{
			//AbstractApplicationContext oCntx = new AnnotationConfigApplicationContext(CDMensajeAnotacion.class);
			AbstractApplicationContext oCntx = new ClassPathXmlApplicationContext("CE0601MensajeAnotacion.xml");
			CMMensajeAnotacion oCIAnotacion = (CMMensajeAnotacion) oCntx.getBean("idCMMensajeAnotacion");
			oCIAnotacion.verMensajeAnotacion("Carta Fianza con Spring and Angular");
			oCntx.close();
		}catch(Exception ex){
			ex.getMessage();
		}
	}
}
