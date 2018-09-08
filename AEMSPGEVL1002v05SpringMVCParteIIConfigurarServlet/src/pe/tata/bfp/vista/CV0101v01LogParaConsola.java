package pe.tata.bfp.vista;

//import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.Logger;

import pe.tata.bfp.controladora.CCControladorDispatcher;

public class CV0101v01LogParaConsola {
	
	private static Logger logger = LogManager.getLogger(CV0101v01LogParaConsola.class);
	
	public static void main(String[] args){
//		BasicConfigurator.configure();
		CCControladorDispatcher oCCControlador = new CCControladorDispatcher();
		
        logger.info("===> Entrando en la aplicacion"+oCCControlador);
        System.out.println("Se ha definido un archivo de configuración para consola, archivo");
        logger.info("===> Finalizando aplicacion");
	}
}
