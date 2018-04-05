package etg.bbva.controladora;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import etg.bbva.entidad.CEPersona;

//   http://localhost:8085/ServicioRestFul2/listadoPersonas.ea
@RestController
public class CC0201v01ListadoPersona {
	private static Logger moLog = LogManager.getLogger(CC0201v01ListadoPersona.class);
	/*
	 * En la URL se invoca con personas.ea y se muestra en formato JSON en pantalla
	 * 
	 */
	@RequestMapping(value="/listadoPersonas", method=RequestMethod.GET)
	public List<CEPersona> listaPersonas(){
		
		moLog.info("=====> listaPersonas");
		
		List<CEPersona> oListaPersona = new ArrayList<>();
		CEPersona oCEPersona = new CEPersona();
		oCEPersona.setId(1);
		oCEPersona.setNombre("Mery");
		oCEPersona.setId(50);
		oListaPersona.add(oCEPersona);
		
		oCEPersona = new CEPersona();
		oCEPersona.setId(2);
		oCEPersona.setNombre("Esteban");
		oCEPersona.setId(16);
		oListaPersona.add(oCEPersona);

		oCEPersona = new CEPersona();
		oCEPersona.setId(3);
		oCEPersona.setNombre("Illari");
		oCEPersona.setId(3);
		oListaPersona.add(oCEPersona);
		
		oCEPersona = new CEPersona();
		oCEPersona.setId(4);
		oCEPersona.setNombre("Luis");
		oCEPersona.setId(1);
		oListaPersona.add(oCEPersona);
		
		moLog.info("=====> CEPersona - cantidad " + oListaPersona.size());
		moLog.info("=====> CEPersona - objetos  " + oListaPersona);
		
		return oListaPersona;
	}
}
