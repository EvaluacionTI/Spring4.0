package pe.tata.bfp.vista.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.tata.bfp.entidad.beans.CEMensajeHerencia;
import pe.tata.bfp.entidad.beans.CEMensajeIndia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;



public class CV0401v01LecturaBeanHerencia {
	@SuppressWarnings("unused")
	private static final Logger moLog = LogManager.getLogger(CV0401v01LecturaBeanHerencia.class);
	private static ApplicationContext oCntx;
	
	public CV0401v01LecturaBeanHerencia() {
	}

	public static void main(String[] args) {

		try{
			oCntx = new ClassPathXmlApplicationContext("CE0401v01MensajeHerencia.xml");
			
			CEMensajeHerencia oCEMensajeHerencia = (CEMensajeHerencia) oCntx.getBean("idCEMensajeHerencia");
			
			System.out.println(oCEMensajeHerencia.getMensaje1());
			System.out.println(oCEMensajeHerencia.getMensaje2());
			
			CEMensajeIndia oCEMensajeIndia = (CEMensajeIndia) oCntx.getBean("idCEMensajeHerencia");
			
			System.out.println(oCEMensajeIndia.getMensaje1());
			System.out.println(oCEMensajeIndia.getMensaje2());
			System.out.println(oCEMensajeIndia.getMensaje3());
			
		}catch(Exception ex){
			
		}
	}

}
