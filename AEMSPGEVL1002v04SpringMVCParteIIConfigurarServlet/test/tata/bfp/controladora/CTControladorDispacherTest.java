package tata.bfp.controladora;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;
import tata.bfp.controladora.CCControladorDispatcher;

public class CTControladorDispacherTest extends TestCase {
	private static Logger logger = LogManager.getLogger(CTControladorDispacherTest.class);
	
	// Estamos manejando el JUnit Test de >Test Case 
	public void testHandleRequestView() throws IOException{
		
		CCControladorDispatcher oCCControlador = new CCControladorDispatcher();
		try{
			ModelAndView oModeloVista = oCCControlador.handleRequest(null, null);

			String lsObjetoEsperado = "index.jsp";
			String lsObjetoReal = oModeloVista.getViewName();
			logger.info("Objeto Esperado -> " + lsObjetoEsperado);
			logger.info("Objeto Real -----> " + lsObjetoReal);
			
			assertEquals(lsObjetoEsperado, lsObjetoReal);
			
		}catch(ServletException oSEX){
			System.out.println(oSEX.getMessage());
		}
		
		
		
	}
}
