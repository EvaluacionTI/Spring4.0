package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.tata.bfp.modelo.beans.CDCaballeroMesaRedonda;


public class CV0801v01CaballeroMesaRedonda {
	private static final Logger moLog = LogManager.getLogger(CV0801v01CaballeroMesaRedonda.class);

	public static void main(String[] args) {
		try{
			AbstractApplicationContext oCntx = new ClassPathXmlApplicationContext("CE0801v01Caballero.xml");

			CDCaballeroMesaRedonda oCDCaballero = (CDCaballeroMesaRedonda) oCntx.getBean("idCaballero");
			
			oCDCaballero.embarcarEnAventura();
			
			oCntx.close();
		}catch(Exception ex){
			ex.getMessage();
		}

	}

}
