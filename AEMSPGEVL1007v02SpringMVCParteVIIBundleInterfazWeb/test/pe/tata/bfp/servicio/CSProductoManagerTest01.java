package pe.tata.bfp.servicio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.TestCase;
import pe.tata.bfp.servicio.impl.CSProductoManager;

public class CSProductoManagerTest01 extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CSProductoManagerTest01.class);
	@Autowired
	private CSProductoManager moCSProductoManager;

	@Before
	public void setUp(){
		moCSProductoManager = new CSProductoManager();
	}
	
	// Lista de Productos Null
	public void testGetProductoWithNoProducto(){
		moCSProductoManager = new CSProductoManager();
		moCSProductoManager.setMoListaProducto(null);
		moLog.info("=====> Lista" + moCSProductoManager.getMoListaProducto());
		assertNull(moCSProductoManager.getMoListaProducto());
	}
}


