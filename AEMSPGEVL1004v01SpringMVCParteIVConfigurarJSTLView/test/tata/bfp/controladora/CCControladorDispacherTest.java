package tata.bfp.controladora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import tata.bfp.controladora.CCControladorDispatcher;

public class CCControladorDispacherTest {
	private static Logger logger = LogManager.getLogger(CCControladorDispacherTest.class);

	@Test
	public void testHandleRequestView() throws IOException{
		
		CCControladorDispatcher oCCControlador = new CCControladorDispatcher();
		try{
			ModelAndView oModeloVista = oCCControlador.handleRequest(null, null);

			// 1. Modelo no vacio
			assertNotNull(oModeloVista.getModel());
						
			String lsObjetoEsperado = "/views/jsp0201v01MostrarFecha.jsp";
			String lsObjetoReal = oModeloVista.getViewName();
			String lsFechaSistema = "";
			
			// Inicialmente va fallar el test porque la clase Controladora no ha sido modificado
			logger.info("=====> Objeto Esperado :" + lsObjetoEsperado);
			logger.info("=====> Objeto Real     :" + lsObjetoReal);
			// 2. El JSP es lo que se espera
			assertEquals(lsObjetoEsperado, lsObjetoReal);
			
			// 3. El JSP real no es null
			assertNotNull(lsObjetoReal);
			
			logger.info("=====> Lectura de fecha de jsp");
			lsFechaSistema = (String) oModeloVista.getModel().get("vFechaActual");
			
			logger.info("=====> Objeto DOM     :" + lsFechaSistema);
			
			assertNotNull(lsFechaSistema);
			
		}catch(ServletException oSEX){
			System.out.println(oSEX.getMessage());
		}
	}
}
