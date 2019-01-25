package pe.tata.bfp.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV0203v01UbicarPropertiesResourceBundle {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
		System.out.println(context);
		
	}
	
}
