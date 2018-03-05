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

@Controller
public class CCControladorMostrarFecha {
	private static final Logger moLog = LogManager.getLogger(CCControladorMostrarFecha.class);
	
/*
 * Esta implementación del controlador, mediante la anotación @Controller, es muy básica. Más tarde iremos expandiendo. 
 * En Spring Web MVC, los componentes @Controller manejan las solicitudes y devuelven normalmente un objeto ModelAndView. 
 * En este caso, uno llamado 'jsp01v01MostrarFecha.jsp', el cual hace referencia al nombre del archivo JSP que vamos a crear a continuación. 
 * 
 * El modelo que esta clase devuelve es resuelto a través del ViewResolver. 
 * Puesto que no hemos definido explicitamente un ViewResolver, vamos a obtener uno por defecto de Spring que simplemente redigir 
 * a una dirección URL que coincida con el nombre de la vista especificada. 
 * 
 * Además, hemos especificado un logger de manera que podemos verificar que pasamos por el manejador en cada momento. 
 * Usando STS, estos mensajes de log deben mostrarse en la pestaña 'Console'.
 */
	
	@RequestMapping(value="/hello.ea")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		String lsArchivoJsp = "jsp0201v01MostrarFecha";
		String lsFechaSistema = (new Date()).toString();
		moLog.info("=====> Fecha Real     :" + lsFechaSistema);

		return new ModelAndView(lsArchivoJsp, "vFechaActual", lsFechaSistema);
	}
 
}
