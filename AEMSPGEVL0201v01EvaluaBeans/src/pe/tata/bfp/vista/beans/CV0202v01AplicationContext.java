package pe.tata.bfp.vista.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.tata.bfp.modelo.beans.CDUsuario;

public class CV0202v01AplicationContext {

		private static ConfigurableApplicationContext moConfiguracionContext = null;
		private static ClassPathXmlApplicationContext moRutaXmlContext = null;
		
		private static final Logger moLog = LogManager.getLogger(CV0202v01AplicationContext.class);
	
		public static void main(String[] args) {
			try{
//				ApplicationContext context = new FileSystemXmlApplicationContext("classpath*:applicationContext.xml");
//				moRutaXmlContext = new ClassPathXmlApplicationContext("applicationContext.xml"); -- ERROR				
//				moRutaXmlContext = new ClassPathXmlApplicationContext("D:/2017/04-LanguajeProgram/10Spring4.3.8/SPG0202v01EvaluaSpringJEE/src/applicationContext.xml"); ERROR
				// El classpath actual es src.
				moRutaXmlContext = new ClassPathXmlApplicationContext("CE0202v01ApplicationContext.xml");				
				
				System.out.println("Referencia a la clase CDUsuario :");
				CDUsuario oCDUsuario = (CDUsuario) moRutaXmlContext.getBean("CDUsuario");
				System.out.println("Imprimir información :" + oCDUsuario.toString());
				oCDUsuario.listaUsuario();
				
				moConfiguracionContext.close();
				
				moLog.info("Lectura del xml: Aplication Context ----->" + moRutaXmlContext);				
//			}catch(NoClassDefFoundError exNCDF){
//				exNCDF.getMessage();

			}catch(Exception ex){
				ex.getMessage();
			}



			
	}

}
