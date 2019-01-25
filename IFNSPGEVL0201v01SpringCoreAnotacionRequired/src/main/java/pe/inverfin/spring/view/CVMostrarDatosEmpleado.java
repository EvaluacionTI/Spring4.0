package pe.inverfin.spring.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.inverfin.spring.entity.CEEmpleado;

public class CVMostrarDatosEmpleado {
	private static Logger MOLOG = LogManager.getLogger(CVMostrarDatosEmpleado.class);
	
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		
		oCntx = new ClassPathXmlApplicationContext("classpath:*spring-anotacion-required.xml");
		MOLOG.info("Contexto = " + oCntx);
		CEEmpleado oCEEmpleado = (CEEmpleado) oCntx.getBean("idCEEmpleado");
		MOLOG.info("Entidad Empleado CEEmpleado = " + oCEEmpleado);
		MOLOG.info("Datos de la entidad = " + oCEEmpleado.toString());
	}

}
