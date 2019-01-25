package pe.inverfin.spring.view.parteII;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.inverfin.spring.entity.parteII.CEAventuraFailedException;
import pe.inverfin.spring.view.parteII.CICaballero;

public class CaballeroApp {
	private static ApplicationContext moContext;
	
	public static void main(String[] args) throws CEAventuraFailedException {
		moContext = new ClassPathXmlApplicationContext("classpath*:caballeroParteII.xml");
		CICaballero oCICaballero = moContext.getBean("idCECaballero", CICaballero.class );
		oCICaballero.embarcarseEnAventura();
	}

}
