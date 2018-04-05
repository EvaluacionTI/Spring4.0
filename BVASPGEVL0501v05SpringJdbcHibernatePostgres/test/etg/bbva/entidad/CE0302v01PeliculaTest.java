package etg.bbva.entidad;

import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;

import junit.framework.TestCase;

public class CE0302v01PeliculaTest extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CE0302v01PeliculaTest.class);
	private CE0301v01Actor moCEActor;
	private CE0302v01Pelicula moCEPelicula;
	
	@Before
	public void setUp(){
		moCEActor = new CE0301v01Actor();
		moCEPelicula = new CE0302v01Pelicula();
		moLog.info("=====> Iniciar clase " + moCEPelicula);
	}

	public void testSetAndGetIdentificador(){
		int iIdentificadorEsperado = 100;
		
		moCEPelicula.setId(iIdentificadorEsperado);
		assertEquals(iIdentificadorEsperado, moCEPelicula.getId(), 1);
	}
	
	public void testSetAndGetActor() {
		assertNotNull(moCEActor);
	}
	
	public void testSetAndGetNombre(){
		String sNombreSperado = "Arquitecto Host";
		
		assertNull(moCEPelicula.getNombre());
		moCEPelicula.setNombre(sNombreSperado);
		assertEquals(sNombreSperado, moCEPelicula.getNombre());
	}

	public void testSetAndGetFechaEstreno(){
		Date dFechaEsperado = null;
		
		assertNotNull(moCEPelicula.getEstreno());
		moCEPelicula.setEstreno(null);
		assertNotEquals(dFechaEsperado, moCEPelicula.getEstreno());
	}
}
