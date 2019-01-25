package pe.inverfin.spring.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CECaballeroDeLaMesaRedondaTest {

	@Test
	public void testEmbarcarEnAventura() throws CEGrialNotFoundException {
		CECaballeroDeLaMesaRedonda oCECaballero = new CECaballeroDeLaMesaRedonda("Esteban");
		CESantoGrial oCESanto = oCECaballero.embarcarEnAventura();
		
		assertNotNull(oCESanto);
		assertTrue(oCESanto.isSanto());
	}

}
