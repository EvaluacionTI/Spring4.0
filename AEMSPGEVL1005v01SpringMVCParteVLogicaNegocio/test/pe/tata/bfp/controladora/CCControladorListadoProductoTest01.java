package pe.tata.bfp.controladora;

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
		moLog.info("=====> testGetProductsWithNoProduct");
		oCCController = new CCControladorListadoProducto();
		moLog.info("=====> Instancia del controlador : " + oCCController);
		ModelAndView oModeloVista = oCCController.handleRequest(null, null);
		moLog.info("=====> Modelo Vista del Controlador " + oModeloVista);
		moLog.info("=====> Esperado  - Controlador :" + "jsp0301v01MostrarListaProducto");
		moLog.info("=====> Resultado - Modelo :" + oModeloVista.getViewName());
		moLog.info("=====> Resultado - Modelo su tama�o :" + oModeloVista.getModel().size());
		moLog.info("=====> Resultado - Modelo contenido :" + oModeloVista.getModel().get("vModeloInventario"));
		
		assertNotNull(oModeloVista.getViewName());
		assertEquals("jsp0301v01MostrarListaProducto", oModeloVista.getViewName());
		assertNotNull(oModeloVista.getModel().get("vModeloInventario"));
	}
}

