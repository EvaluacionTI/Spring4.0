package pe.inverfin.spring.view.parteI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.inverfin.spring.entity.parteI.CEAventuraFailedException;

public class CVCaballeroMostrar {
	private static ApplicationContext moContext;
	
	public static void main(String[] args) throws CEAventuraFailedException {
		try {
			moContext = new ClassPathXmlApplicationContext("classpath*:caballeroParteI.xml");
			
			CICaballero oCICaballero = moContext.getBean("idCECaballero", CICaballero.class );
			
			oCICaballero.embarcarseEnAventura();
			
		}catch(Exception ex) {
			ex.getMessage();
		}
		
		
	}

}
