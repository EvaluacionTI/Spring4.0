package etg.bbva.modelo.impl;

import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etg.bbva.entidad.CE01Usuario;
import etg.bbva.modelo.impl2.CDUsuarioDAOOtraImpl;
import junit.framework.TestCase;
import junit.textui.TestRunner;

public class CDUsuarioDAOOtraImplTest extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CDUsuarioDAOOtraImplTest.class);
	
	private ClassPathXmlApplicationContext oCntx;
	private CDUsuarioDAOOtraImpl oCDUsuario;
	private CE01Usuario oCEUsuario;

	protected void setUp() throws IOException{
		moLog.debug("Setup del Test");
		// Para el test es necesario copiar el archivo applicationContext.xml en la carpeta resources
		String[] oPaths = {"applicationContext.xml"};
		oCntx = new ClassPathXmlApplicationContext(oPaths);
		oCDUsuario = (CDUsuarioDAOOtraImpl) oCntx.getBean("idCDUsuarioOtraImpl");
		moLog.debug("Hemos obtenido el objeto que implementa CIUsuario");
	}
	
	protected void tearDown() {
		oCEUsuario = null;
		oCDUsuario = null;
	}

	public void testAddFindBorrar() {
		oCEUsuario = oCDUsuario.findUsuario(new Integer (1));
		moLog.info("=====> testAddFindBorrar");
		moLog.info("=====> " + oCEUsuario);

		// Para verificar que hay conexion y no salta excepcion
		oCEUsuario = new CE01Usuario();
		oCEUsuario.setId(new Integer(15));
		oCEUsuario.setNombre("Arquitectura");
		oCDUsuario.saveUsuario(oCEUsuario);
		moLog.info("=====> " + oCEUsuario);
		
		assertTrue(oCEUsuario!=null);
		
		CE01Usuario oCEUsuario2 = oCDUsuario.findUsuario(new Integer(1));
		moLog.info("=====> [Recuperado usuario =" + oCEUsuario2 + "]");
		assertFalse(oCEUsuario2!=null);
		moLog.info("=====> [Comparamos = " + oCEUsuario2 + " con " + oCEUsuario + "]");
		assertNotEquals(oCEUsuario, oCEUsuario2);
		
		//Recuperamos el mismo usuario
		oCDUsuario.deleteUsuario(new Integer(1));
		oCEUsuario2 = oCDUsuario.findUsuario(new Integer(1));
		assertNull("El usuario no debe existir", oCEUsuario2);
		moLog.info("=====> [Eliminado = " + oCEUsuario2 + "]");		
	}
	
	public static void main(String[] args) {
		TestRunner.run(CDUsuarioDAOOtraImplTest.class);

	}

}
