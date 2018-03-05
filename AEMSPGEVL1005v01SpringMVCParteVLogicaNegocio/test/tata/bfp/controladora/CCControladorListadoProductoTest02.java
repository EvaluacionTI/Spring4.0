package tata.bfp.controladora;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

/*
 * Los tests son una parte vital del desarrollo del software. El mejor momento para escribir los tests es durante el desarrollo, no después, 
 * de manera que aunque nuestro controlador no contiene lógica demasiado compleja vamos a escribir un test para probarlo. Esto nos permitirá hacer cambios 
 * en el futuro con total seguridad. 
 * Creamos una clase de test llamada 'CTTestControler'
 */

public class CCControladorListadoProductoTest02 extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CCControladorListadoProductoTest02.class);
	private CCControladorListadoProducto oCCController;
	
	@Test
	protected void setUp() {
		oCCController = new CCControladorListadoProducto();
	}
	
	public void testGetProductsWithNoProduct() throws ServletException, IOException {
		oCCController = new CCControladorListadoProducto();
		moLog.info("=====> Lista " + oCCController.handleRequest(null, null));
		assertNotNull(oCCController);
		
	}
	
    public void testHandleRequestView() throws Exception{
		
        ModelAndView oModeloVista = oCCController.handleRequest(null, null);
        
        String lsNombreJsp = "jsp0301v01MostrarListaProducto";
        String lsVariableDom = "vFechaActual";
        
        // Error 
        // assertEquals("/WEB-INF/views/hello", modelAndView.getViewName());
        // Correcto
        moLog.info("=====> Controlador     :"+ oCCController);
        moLog.info("=====> Nombre de la vista : " + oModeloVista.getViewName());
        moLog.info("=====> Datos : " + oModeloVista.getModel());
        moLog.info("=====> Estado : " + oModeloVista.getStatus());
        moLog.info("=====> Vista : " + oModeloVista.getView());
        
        // Verificar el archivo JSP
        assertEquals(lsNombreJsp, oModeloVista.getViewName());        
        assertNotNull(oModeloVista.getModel());
        
        @SuppressWarnings("unchecked")
        Map<String, Object> oModeloMap = (Map<String, Object>) oModeloVista.getModel().get("vModeloInventario");

        moLog.info("=====> Tama�o del Map  : " + oModeloMap.size());
        moLog.info("=====> Nombre Modelo   : " + oModeloMap.getClass());
        moLog.info("=====> Fecha Actual    : " + oModeloMap.get("vFechaActual"));        
        moLog.info("=====> Lista Productos : " + oModeloMap.get("vListaProducto"));
        
        String lsFechaActual = (String) oModeloMap.get(lsVariableDom);
        assertNotNull(lsFechaActual);
    }
}

