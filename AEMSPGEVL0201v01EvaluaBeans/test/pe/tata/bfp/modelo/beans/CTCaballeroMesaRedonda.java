package pe.tata.bfp.modelo.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import junit.framework.TestCase;
import pe.tata.bfp.modelo.beans.CDCaballeroMesaRedonda;

public class CTCaballeroMesaRedonda extends TestCase{

	private static final Logger moLog = LogManager.getLogger(CTCaballeroMesaRedonda.class);
	
	public void EmbarcarAventura(){
		CDCaballeroMesaRedonda oCDCaballero = new CDCaballeroMesaRedonda("Amadeo");
		
		Object oGrial = oCDCaballero.embarcarEnAventura();
		assertNotNull(oGrial);
//		assertTrue(oGrial.isSanto());
	}
	
}
