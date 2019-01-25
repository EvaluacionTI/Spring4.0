package tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tata.bfp.entidad.beans.CESaludoService;

public class CV0101v01LecturaBeans {
	private static final Logger moLog = LogManager.getLogger(CV0101v01LecturaBeans.class);

	public CV0101v01LecturaBeans() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String sNombreBeans = "saldudoService";
		try{
			ApplicationContext oCntx = new ClassPathXmlApplicationContext(sNombreBeans);
			
			System.out.println(" Context -----> " + oCntx);
			
			CESaludoService oCESaludo = (CESaludoService) oCntx.getBean("idSaludoService");
			
			oCESaludo.getmSaludo();
			
			System.out.println(" Saludo del Bean Service -----> " + oCESaludo.getmSaludo());
		}catch(NoClassDefFoundError exNCDF){
			moLog.error(exNCDF.getMessage());

		}catch(Exception ex){
			moLog.error(ex.getMessage());
		}
		
	
		

	}

}
