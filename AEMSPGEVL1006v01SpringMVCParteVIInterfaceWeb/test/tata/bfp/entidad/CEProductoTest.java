package tata.bfp.entidad;

import org.junit.Before;

import junit.framework.TestCase;
import tata.bfp.entidad.CEProducto;

public class CEProductoTest extends TestCase{
	private CEProducto moCEProducto;
	
	@Before
	public void setUp(){
		moCEProducto = new CEProducto();
	}
	
	public void testSetAndGetDescription(){
		String lsTestDescripcion = "aDescripcion";
		
		assertNull(moCEProducto.getDescripcion());
		moCEProducto.setDescripcion(lsTestDescripcion);
		assertEquals(lsTestDescripcion, moCEProducto.getDescripcion());
	}

	public void testSetAndGetPrecio(){
		double ldTestPrecio = 100.00;
		
		assertEquals(0, 0, 0);
		moCEProducto.setPrecio(ldTestPrecio);
		assertEquals(ldTestPrecio, moCEProducto.getPrecio(), 1);
	}

}
