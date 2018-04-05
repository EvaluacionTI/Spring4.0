package etg.bbva.entidad;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;

import etg.bbva.entidad.CE01Usuario;
import junit.framework.TestCase;

public class CE01UsuarioTest extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CE01UsuarioTest.class);
	private CE01Usuario moCEUsuario;
	
	@Before
	public void setUp(){
		moCEUsuario = new CE01Usuario();
		moLog.info("=====> Iniciar clase " + moCEUsuario);
	}
	
	public void testSetAndGetNombre(){
		String sNombreSperado = "Arquitecto Host";
		
		assertNull(moCEUsuario.getNombre());
		moCEUsuario.setNombre(sNombreSperado);
		assertEquals(sNombreSperado, moCEUsuario.getNombre());
	}

	public void testSetAndGetIdentificador(){
		int iIdentificadorEsperado = 100;
		
		moCEUsuario.setId(iIdentificadorEsperado);
		assertEquals(iIdentificadorEsperado, moCEUsuario.getId(), 1);
	}

}
