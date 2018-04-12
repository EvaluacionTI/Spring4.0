package tata.bfp.controladora;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/* 1.0:
 * 	Configura la clase como un controlador WEB
 *	La clase java con la anotaci�n @Controller, elegido con anotaciones en clases dentro del paquete tata.bfp.controladora,
 *	como indica el fichero apl-spring-servlet.xml
 */
//@Controller
public class CCControladorDispatcher implements Controller{
	private static final Logger moLog = LogManager.getLogger(CCControladorDispatcher.class);
//	@RequestMapping(value="/hello.ea")
	// 2.0
	// Mapea este controlador con una URL
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

//		System.out.println(request.getContentType());
		// 3.0 Asigna la pagina destino		
		
		String lsArchivoJsp = "hello.jsp";
		moLog.info("Se asigna el del index al ModelAndView ----->" + lsArchivoJsp);
		// 4.0 Retorna la pagina destino
		moLog.info("Objeto ModelAndView ----->" + new ModelAndView());
		return new ModelAndView(lsArchivoJsp);
	}
	


}


