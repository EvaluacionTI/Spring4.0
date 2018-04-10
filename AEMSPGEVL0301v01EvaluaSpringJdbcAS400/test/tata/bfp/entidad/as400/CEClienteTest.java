package tata.bfp.entidad.as400;

import static org.junit.Assert.*;

import org.junit.Test;

public class CEClienteTest {
	private int idCodigo;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nombre;
	
	@Test
	public void testFull() {
		CECliente oCECliente = new CECliente();
		
		// Información esperado
		idCodigo = 100;
		tipoDocumento = "DNI";
		numeroDocumento = "09313658";
		nombre = "Entelgy - BBVA";
		
		// Información actual que sera evaluado
		oCECliente.setIdCodigo(100);
		oCECliente.setTipoDocumento("DNI");
		oCECliente.setNumeroDocumento("09313658");
		oCECliente.setNombre("Entelgy - BBVA");
		
		// Test : Que la clase no sea null
		assertNotNull(oCECliente);
		
		// Test : Que el nombre no sea null
		assertNotNull(oCECliente.getNombre());
		
		// Test : Lo esperado vs los Real
		assertEquals(idCodigo, oCECliente.getIdCodigo());
		assertEquals(tipoDocumento, oCECliente.getTipoDocumento());
		assertEquals(numeroDocumento, oCECliente.getNumeroDocumento());
		assertEquals(nombre, oCECliente.getNombre());
		//fail("Not yet implemented");
	}

}
