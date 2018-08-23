package pe.tata.bfp.vista.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;

import pe.tata.bfp.entidad.beans.CEMensajeProcesor;

public class CV0302v01LecturaBeanProcesor {
	@SuppressWarnings("unused")
	private static final Logger moLog = LogManager.getLogger(CV0302v01LecturaBeanProcesor.class);
	public static ApplicationContext oCntx;
	
	public CV0302v01LecturaBeanProcesor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try{
		
			oCntx = new ClassPathXmlApplicationContext("CE0301v01MensajeProcesor.xml");
			System.out.println("1. Referencia al XML del Bean  " + oCntx);
			
			CEMensajeProcesor oCEMensaje = (CEMensajeProcesor) oCntx.getBean("idCEMensajeProcesor");
			System.out.println(" Instancia al Bean  " + oCEMensaje);
			
			System.out.println(" Mostrar los datos  " + oCEMensaje.getMensaje());
			
		}catch(NoClassDefFoundError exNCDF){
			moLog.error("Error NoClassDefFoundError ---->" + exNCDF.getMessage());

		}catch(Exception ex){
			moLog.error("Error Exception ---->" + ex.getMessage());
		}

	}

}
