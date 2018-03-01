package tata.bfp.controladora;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/* 1.0:
 * 	Configura la clase como un controlador WEB
 *	La clase java con la anotación @Controller, elegido con anotaciones en clases dentro del paquete tata.bfp.controladora,
 *	como indica el fichero apl-spring-servlet.xml
 */
@Controller
public class CCControladorDispatcher{
	private static Logger logger = LogManager.getLogger(CCControladorDispatcher.class);	
	// 2.0
	// Mapea este controlador con una URL
	@RequestMapping(value="/hello.ea")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		String lsArchivoJsp = "/WEB-INF/views/jsp0201v01MostrarFecha.jsp";
		String lsFechaSistema = (new Date()).toString();
		logger.info("=====> Fecha Real     :" + lsFechaSistema);

		return new ModelAndView(lsArchivoJsp, "vFechaActual", lsFechaSistema);

	}

}


