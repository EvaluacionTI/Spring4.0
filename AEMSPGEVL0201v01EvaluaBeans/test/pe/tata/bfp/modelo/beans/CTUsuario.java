package pe.tata.bfp.modelo.beans;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import pe.tata.bfp.entidad.beans.CEUsuario;
import pe.tata.bfp.modelo.beans.CDUsuario;

public class CTUsuario extends TestCase{
	private ClassPathXmlApplicationContext moCtx;
	private CDUsuario moCSUsuario;
	private CEUsuario moCEUsuario;
	
	private static final Logger moLog = LogManager.getLogger(CTUsuario.class);
	
	protected void setUp() throws Exception{
		moLog.debug("SETUP del test");
		try{
			String[] asPaths = {"CE0202v01ApplicationContext.xml"};
			
			moCtx = new ClassPathXmlApplicationContext(asPaths);
			
			moCSUsuario = (CDUsuario) moCtx.getBean("CSUsuario");			
		}catch(Exception oEx){
			
		}

		moLog.debug("Objeto de la implementacion " + moCSUsuario);
	}

	protected void tearDown() throws Exception{
		moCEUsuario = null;
		moCSUsuario = null;
	}
	
	public void testAddFindBorrar(){
		moCEUsuario = moCSUsuario.buscarUsuario(new Integer(1));
		moLog.debug(" Usuario ----->" + moCEUsuario);
		
		// Solo para verificar que hay conexion y no salta la excepcion
		moCEUsuario = new CEUsuario();
		moCEUsuario.setId(new Integer(1));
		moCEUsuario.setUsuario("Leasing with Spring");
		
		moCSUsuario.grabaUsuario(moCEUsuario);
		assertTrue(moCEUsuario != null);
		
		CEUsuario oCEUsuario2 = moCSUsuario.buscarUsuario(new Integer(1));
		moLog.debug("Recuperando usuario ----->" + oCEUsuario2);
		assertTrue(oCEUsuario2 != null);
		moLog.debug("Comparando el usuario ----->" + oCEUsuario2 + "  con  " + moCEUsuario);
		assertTrue(oCEUsuario2.equals(moCEUsuario));
		
		moCSUsuario.eliminaUsuario(new Integer(1));
		oCEUsuario2 = moCSUsuario.buscarUsuario(new Integer(1));
		assertNull("El usuario no debe existir", oCEUsuario2);
		
	}
	
	public static void main(String[] args){
		junit.textui.TestRunner.run(CTUsuario.class);
	}
}
