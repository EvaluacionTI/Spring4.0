package pe.tata.bfp.controladora;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import pe.tata.bfp.controladora.CCControladorDispatcher;

public class CCControladorDispacherTest {

	@Test
	public void testHandleRequestView() throws IOException{
		
		CCControladorDispatcher oCCControlador = new CCControladorDispatcher();
		try{
			ModelAndView oModeloVista = oCCControlador.handleRequest(null, null);

			String lsObjetoEsperado = "index.jsp";
			String lsObjetoReal = oModeloVista.getViewName();
			
			System.out.println(" Objeto Real ---->" + lsObjetoReal);
			
			assertEquals(lsObjetoEsperado, lsObjetoReal);
			
		}catch(ServletException oSEX){
			System.out.println(oSEX.getMessage());
		}
		
		
		
	}
}
