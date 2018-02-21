package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV0102v01LecturaMasDeUnAplicationContext {
	private static final Logger moLog = LogManager.getLogger(CV0102v01LecturaMasDeUnAplicationContext.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// Crea y referencia al Bean
			oCntx = new ClassPathXmlApplicationContext("CE0201v01SimpleBean.xml", "CE0101v02Mensaje.xml");
			
			System.out.println(" Instancia del Application Context -----> " + oCntx);
			System.out.println(" ApplicationName : " + oCntx.getApplicationName());
			System.out.println(" Id : " + oCntx.getId());
			System.out.println(" ClassLoader : " + oCntx.getClassLoader());
			System.out.println(" Environment : " + oCntx.getEnvironment());
			
		}catch(NoClassDefFoundError exNCDF){
			moLog.error("Error NoClassDefFoundError ---->" + exNCDF.getMessage());

		}catch(Exception ex){
			moLog.error("Error Exception ---->" + ex.getMessage());
		}

	}

}
