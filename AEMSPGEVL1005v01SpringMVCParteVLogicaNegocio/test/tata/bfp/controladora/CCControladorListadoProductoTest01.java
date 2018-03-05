package tata.bfp.controladora;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

/*
 * Los tests son una parte vital del desarrollo del software. El mejor momento para escribir los tests es durante el desarrollo, no después, 
 * de manera que aunque nuestro controlador no contiene lógica demasiado compleja vamos a escribir un test para probarlo. Esto nos permitirá hacer cambios 
 * en el futuro con total seguridad. 
 * Creamos una clase de test llamada 'CTTestControler'
 */

public class CCControladorListadoProductoTest01 extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CCControladorListadoProductoTest01.class);
	private CCControladorListadoProducto oCCController;
	
	protected void setUp() {
		oCCController = new CCControladorListadoProducto();
	}
	
	public void testGetProductsWithNoProduct() throws ServletException, IOException {
		oCCController = new CCControladorListadoProducto();
		
		ModelAndView oModeloVista = oCCController.handleRequest(null, null);
		
		moLog.info("=====> Controlador :" + oCCController);
		moLog.info("=====> Modelo :" + oModeloVista.getViewName());
		
		assertNull(oCCController.handleRequest(null, null));
	}
}

