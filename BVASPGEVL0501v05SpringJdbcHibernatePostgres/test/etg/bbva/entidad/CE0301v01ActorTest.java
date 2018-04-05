package etg.bbva.entidad;

import static org.junit.Assert.assertNotEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;

import junit.framework.TestCase;

public class CE0301v01ActorTest extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CE0301v01ActorTest.class);
	private CE0301v01Actor moCEActor;
	
	@Before
	public void setUp(){
		moCEActor = new CE0301v01Actor();
		moLog.info("=====> Iniciar clase " + moCEActor);
	}

	public void testSetAndGetIdentificador(){
		int iIdentificadorEsperado = 100;
		
		moCEActor.setId(iIdentificadorEsperado);
		assertEquals(iIdentificadorEsperado, moCEActor.getId(), 1);
	}
	
	public void testSetAndGetNombre(){
		String sNombreSperado = "Arquitecto Host";
		
		assertNull(moCEActor.getNombre());
		moCEActor.setNombre(sNombreSperado);
		assertEquals(sNombreSperado, moCEActor.getNombre());
	}

	public void testSetAndGetEdad(){
		int iEdadSperado = 2;
		
		assertNotNull(moCEActor.getEdad());
		moCEActor.setEdad(5);
		assertNotEquals(iEdadSperado, moCEActor.getEdad());
	}
}
