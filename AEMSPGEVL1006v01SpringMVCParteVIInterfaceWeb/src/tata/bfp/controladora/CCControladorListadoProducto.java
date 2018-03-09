package tata.bfp.controladora;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tata.bfp.entidad.CEProducto;
import tata.bfp.modelo.CDListaProducto;
import tata.bfp.servicio.impl.CSProductoManager;

@Controller
public class CCControladorListadoProducto {
	private static final Logger moLog = LogManager.getLogger(CCControladorListadoProducto.class);
	
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
	private CSProductoManager moProductoManager;
	
    @RequestMapping(value="/listado.ea")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
    	CDListaProducto oCDDataProducto;
    	List<CEProducto> oListaProducto;

    	oCDDataProducto = new CDListaProducto();
    	moProductoManager = new CSProductoManager();
    	
    	String lsNombreJsp = "jsp0301v01MostrarListaProducto";
    	String lsVariableDom = "vModeloInventario";

        String lsFechaActual = (new Date()).toString();
        
        oListaProducto = oCDDataProducto.dataListaProducto();
        moLog.info("=====> Lista de Productos antes de Controladora : " + oListaProducto.size());
        this.moProductoManager.setMoListaProducto(oListaProducto);
        moLog.info("=====> Lista de Productos despues de Controladora : " + moProductoManager.getMoListaProducto());        
        moLog.info("=====> Cantidad Productos : " + moProductoManager.getListaProducto().size());
        
        // Creando un mapa de datos con la lista a procesar
        Map<String, Object> oModeloDatos = new HashMap<>();
        
        oModeloDatos.put("vFechaActual", lsFechaActual);
        oModeloDatos.put("vListaProducto", this.moProductoManager.getListaProducto());
        
        moLog.info("=====> ModelAndView generado  :" + oModeloDatos);
        
        return new ModelAndView(lsNombreJsp, lsVariableDom, oModeloDatos);
    }
}
