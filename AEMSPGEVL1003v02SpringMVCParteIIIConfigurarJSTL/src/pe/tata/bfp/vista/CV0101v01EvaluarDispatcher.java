package pe.tata.bfp.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;


public class CV0101v01EvaluarDispatcher {
	private static Logger logger = LogManager.getLogger(CV0101v01EvaluarDispatcher.class);
	public static void main(String[] args) {

		DispatcherServlet oServletSpring = new DispatcherServlet();
		logger.info( "=====> " + oServletSpring);
		try{
			System.out.println(oServletSpring.getServletName());	
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}

}
