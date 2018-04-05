package etg.bbva.controladora;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//1. Digitar en la URL mostrarMensaje.ea
//   http://localhost:8085/ServicioRestFul2/mostrarMensaje.ea
@RestController
public class CC0101v01MostrarMensajeNWeb {
	private static Logger moLog = LogManager.getLogger(CC0101v01MostrarMensajeNWeb.class);
	
	// 1. Digitar en la URL mostrarMensaje.ea
	@RequestMapping("/mostrarMensaje")
	public Map<String, Object> mostrarSaludo(){		
		moLog.info("=====> " + "mostrarSaludo");

		Map<String, Object> oModeloDatos = new HashMap<>();
        
		oModeloDatos.put("saludo1", "Arquitectura: Host - Distribuido");
		oModeloDatos.put("saludo2", "Arquitectura: Holding");
		oModeloDatos.put("saludo3", "Arquitectura: PAAS");
		oModeloDatos.put("saludo4", "Arquitectura: Host - Cobol");
		oModeloDatos.put("saludo5", "Arquitectura: Host - JCL");
		
		moLog.info("=====> " + oModeloDatos);
		return oModeloDatos;
	}
}