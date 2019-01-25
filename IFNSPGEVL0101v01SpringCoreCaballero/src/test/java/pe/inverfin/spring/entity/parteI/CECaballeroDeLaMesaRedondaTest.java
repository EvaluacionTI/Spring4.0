package pe.inverfin.spring.entity.parteI;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.inverfin.spring.entity.parteI.CECaballeroDeLaMesaRedonda;
import pe.inverfin.spring.entity.parteI.CESantoGrial;

public class CECaballeroDeLaMesaRedondaTest {

	@Test
	public void testEmbarcarEnAventura() throws CEAventuraFailedException {
		CECaballeroDeLaMesaRedonda oCECaballero = new CECaballeroDeLaMesaRedonda("Esteban");
		CESantoGrial oCESanto = (CESantoGrial) oCECaballero.embarcarEnAventura();
		
		assertNotNull(oCESanto);
		assertTrue(oCESanto.isSanto());
	}
}
