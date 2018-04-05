package etg.bbva.entidad;

import static org.junit.Assert.assertNotEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;

import junit.framework.TestCase;

public class CE02CustomerTest extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CE02CustomerTest.class);
	private CE02Customer moCECustomer;
	
	@Before
	public void setUp(){
		moCECustomer = new CE02Customer();
		moLog.info("=====> Iniciar clase " + moCECustomer);
	}

	public void testSetAndGetEdad(){
		int iEdadSperado = 2;
		
		assertNotNull(moCECustomer.getAge());
		moCECustomer.setAge(5);
		assertNotEquals(iEdadSperado, moCECustomer.getAge());
	}

	public void testSetAndGetNombre(){
		String sNombreSperado = "Arquitecto Host";
		
		assertNull(moCECustomer.getName());
		moCECustomer.setName(sNombreSperado);
		assertEquals(sNombreSperado, moCECustomer.getName());
	}

	public void testSetAndGetIdentificador(){
		long iIdentificadorEsperado = 100;
		
		moCECustomer.setCustId(iIdentificadorEsperado);
		assertEquals(iIdentificadorEsperado, moCECustomer.getCustId(), 1);
	}

}
