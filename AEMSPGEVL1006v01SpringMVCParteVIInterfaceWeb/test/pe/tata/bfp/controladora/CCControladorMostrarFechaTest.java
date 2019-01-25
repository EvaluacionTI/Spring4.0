package pe.tata.bfp.controladora;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;
import pe.tata.bfp.controladora.CCControladorMostrarFecha;

public class CCControladorMostrarFechaTest extends TestCase {
	private static Logger logger = LogManager.getLogger(CCControladorMostrarFechaTest.class);

	public void testHandleRequestView(){
		
		CCControladorMostrarFecha oCCControlador = new CCControladorMostrarFecha();

		ModelAndView oModeloVista = oCCControlador.handleRequest(null, null);
		// 1. Modelo no vacio
		assertNotNull(oModeloVista.getModel());
						
		String lsObjetoEsperado = "jsp0201v01MostrarFecha";
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
	}
}
