package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.tata.bfp.entidad.beans.CESimpleBean;

public class CV0201v01LecturaSimpleBeanApplicationContext {
	private static final Logger moLog = LogManager.getLogger(CV0201v01LecturaSimpleBeanApplicationContext.class);
	private static ApplicationContext oCntx;
	
	public CV0201v01LecturaSimpleBeanApplicationContext() {
	}

	public static void main(String[] args) {

		try{
			oCntx = new ClassPathXmlApplicationContext("CE0201v01SimpleBean.xml");
			CESimpleBean oCESimpleBean = (CESimpleBean) oCntx.getBean("idCESimpleBean");
			
			System.out.println(" Lectura del constructor del Bean -----> " + oCESimpleBean);
			
		}catch(NoClassDefFoundError exNCDF){
			moLog.error("Error NoClassDefFoundError ---->" + exNCDF.getMessage());

		}catch(Exception ex){
			moLog.error("Error Exception ---->" + ex.getMessage());
		}
	}

}
