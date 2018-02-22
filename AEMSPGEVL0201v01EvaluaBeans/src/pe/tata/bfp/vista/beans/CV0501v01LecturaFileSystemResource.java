package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class CV0501v01LecturaFileSystemResource {
	@SuppressWarnings("unused")
	private static final Logger moLog = LogManager.getLogger(CV0501v01LecturaFileSystemResource.class);
	
	public CV0501v01LecturaFileSystemResource() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{
			/*
			 * El uso de FileSystemResource ubica el archivo del bean en la raíz del proyecto.
			 *  */
			
			Resource oCEBean = new FileSystemResource("CE0501v01Persona.xml");
			
			BeanFactory oFactory = new XmlBeanFactory(oCEBean);
			System.out.println(oFactory.getBean("idReina"));
			System.out.println(oFactory.getBean("idEsteban"));
			
		}catch(NoClassDefFoundError exNCDF){
			System.out.println(exNCDF.getMessage());
		}
	}

}
