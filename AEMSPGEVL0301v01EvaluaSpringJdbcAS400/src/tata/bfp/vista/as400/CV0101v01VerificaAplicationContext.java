package tata.bfp.vista.as400;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV0101v01VerificaAplicationContext {

	private static ApplicationContext moRutaXmlContext;
	private static final Logger moLog = LogManager.getLogger(CV0101v01VerificaAplicationContext.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			moLog.info(" Ruta 1 -- >" + moRutaXmlContext.CLASSPATH_ALL_URL_PREFIX);
			moLog.info(" Ruta 2 -- >" + moRutaXmlContext.CLASSPATH_URL_PREFIX);
			moLog.trace(" getClassLoader  -- >" + moRutaXmlContext.getClassLoader());
			moLog.trace(" getEnviroment  -- >" + moRutaXmlContext.getEnvironment());
			moLog.info(" id -- > " + moRutaXmlContext.getId());
			
			moRutaXmlContext = new ClassPathXmlApplicationContext("spring-modulo-as400.xml");
			
			System.out.println(" id -- > " + moRutaXmlContext.getId());
			System.out.println(" Beans -- > " + moRutaXmlContext.getBeanDefinitionNames());
			
		}catch(NullPointerException ex){
			ex.getMessage();
		}
	}

}
