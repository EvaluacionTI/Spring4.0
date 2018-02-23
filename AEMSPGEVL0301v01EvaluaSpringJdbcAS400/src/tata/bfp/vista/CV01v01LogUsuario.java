package tata.bfp.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV01v01LogUsuario{
	
	private static final Logger moLog = LogManager.getLogger(CV01v01LogUsuario.class);
	
	public static void main(String[] args){
		moLog.info(" ===> Informativo ");
		moLog.debug(" ===> Debug ");
		moLog.warn(" ===> Warning ");
		moLog.error(" ===> Error");
	}
}
