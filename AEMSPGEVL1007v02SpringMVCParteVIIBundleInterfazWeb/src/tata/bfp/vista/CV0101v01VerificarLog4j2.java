package tata.bfp.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV0101v01VerificarLog4j2 {
	private static final Logger moLog = LogManager.getLogger(CV0101v01VerificarLog4j2.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("A. Recuperar un loger :" + moLog);
        moLog.debug("oLogRecupera");
        
        System.out.println("Parametro de main "+ args.length);
        moLog.debug("trace");
        moLog.debug("DEBUG");
        moLog.warn("warn" );
        moLog.info("info");
        moLog.error("ERROR");
        moLog.fatal("FATAL");
	}

}
