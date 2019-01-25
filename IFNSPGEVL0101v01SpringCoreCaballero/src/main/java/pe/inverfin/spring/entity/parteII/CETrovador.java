package pe.inverfin.spring.entity.parteII;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pe.inverfin.spring.view.parteII.CICaballero;

public class CETrovador {

	private static final Logger MOLOG = LogManager.getLogger(CETrovador.class);
	
	public void cantarAntes(CICaballero caballero) {
		MOLOG.info("Do re mi fa so la si" + caballero.getNombre() + " buena mi Ricotona, te amo");
	}
	
	public void cantarDespues(CICaballero caballero) {
		MOLOG.info("Do re mi fa so la si" + caballero.getNombre() + " buena mi Ricoton, te amo");
	}
}
