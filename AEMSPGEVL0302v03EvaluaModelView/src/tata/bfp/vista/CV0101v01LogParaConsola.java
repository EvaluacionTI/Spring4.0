package tata.bfp.vista;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import tata.bfp.controladora.CCControladorDispatcher;

public class CV0101v01LogParaConsola {
	
	static Logger logger = Logger.getLogger(CV0101v01LogParaConsola.class);
	
	public static void main(String[] args){
		BasicConfigurator.configure();
		CCControladorDispatcher oCCControlador = new CCControladorDispatcher();
		
        logger.info("Entrando en la aplicacion" + oCCControlador);
        System.out.println("Se ha definido un archivo de configuraci�n para consola, archivo");
        logger.info("Finalizando aplicacion");
	}
}
