package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class CV0103v01GenericApplicationContext {
	private static final Logger moLog = LogManager.getLogger(CV0103v01GenericApplicationContext.class);
	private static GenericApplicationContext oCntx;
	
	public static void main(String[] args) {
		try{
			oCntx = new GenericApplicationContext();
			new XmlBeanDefinitionReader(oCntx).loadBeanDefinitions("CE0201v01SimpleBean.xml", "CE0101v02Mensaje.xml");
			oCntx.refresh();
			
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
