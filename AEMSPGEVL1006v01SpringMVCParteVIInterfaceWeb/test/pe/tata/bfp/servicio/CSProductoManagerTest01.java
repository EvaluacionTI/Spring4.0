package pe.tata.bfp.servicio;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.TestCase;
import pe.tata.bfp.servicio.impl.CSProductoManager;

public class CSProductoManagerTest01 extends TestCase{

	@Autowired
	private CSProductoManager moCSProductoManager;

	@Before
	public void setUp(){
		moCSProductoManager = new CSProductoManager();
	}
	
	// Lista de Productos Null
	public void testGetProductoWithNoProducto(){
		moCSProductoManager = new CSProductoManager();
		
		assertNull(moCSProductoManager.getListaProducto());
	}
}


