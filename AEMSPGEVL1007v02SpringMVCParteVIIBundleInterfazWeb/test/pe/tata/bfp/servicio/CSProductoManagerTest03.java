package pe.tata.bfp.servicio;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.TestCase;
import pe.tata.bfp.entidad.CEProducto;
import pe.tata.bfp.modelo.CDDataConstant;
import pe.tata.bfp.servicio.impl.CSProductoManager;

public class CSProductoManagerTest03 extends TestCase{
	private static final Logger moLog = LogManager.getLogger(CSProductoManagerTest03.class);
	@Autowired
	private CSProductoManager moCSProductoManager;
	private CEProducto moCEProducto;
	private List<CEProducto> moListaProducto;

	public void setUp(){
		moCSProductoManager = new CSProductoManager();
		
		moCEProducto = new CEProducto();
		moListaProducto = new ArrayList<CEProducto>();

        // stub up a list of products
		moCEProducto.setDescripcion("Chair");
		moCEProducto.setPrecio(CDDataConstant.CHAIR_PRICE);
		moListaProducto.add(moCEProducto);
        
		moCEProducto = new CEProducto();
		moCEProducto.setDescripcion("Table");
		moCEProducto.setPrecio(CDDataConstant.TABLE_PRICE);
		moListaProducto.add(moCEProducto);
        
		moCSProductoManager.setMoListaProducto(moListaProducto);	
	}
	
	// Lista de Productos Null
	public void testGetProductoWithNoProducto(){
		moCSProductoManager = new CSProductoManager();
		moCSProductoManager.setMoListaProducto(null);
		moLog.info("=====> " + moCSProductoManager);
		assertNull(moCSProductoManager.getMoListaProducto());
	}

	// Lista de productos esta vac�a
    public void testGetProducts() {
        List<CEProducto> oListaProductos = moCSProductoManager.getListaProducto();
        
        assertNotNull(oListaProductos);        
        assertEquals(CDDataConstant.PRODUCT_COUNT, moCSProductoManager.getListaProducto().size());
    
        CEProducto oCEProducto = oListaProductos.get(0);
        assertEquals(CDDataConstant.CHAIR_DESCRIPTION, oCEProducto.getDescripcion());
        assertEquals(CDDataConstant.CHAIR_PRICE, oCEProducto.getPrecio());
        
        oCEProducto = oListaProductos.get(1);
        assertEquals(CDDataConstant.TABLE_DESCRIPTION, oCEProducto.getDescripcion());
        assertEquals(CDDataConstant.TABLE_PRICE, oCEProducto.getPrecio());      
    }

	// Incrementa el precio en 10%
    public void testIncreasePriceWithNullListOfProducts() {
        try {
        	moCSProductoManager = new CSProductoManager();
        	moCSProductoManager.incrementaPrecio(CDDataConstant.POSITIVE_PRICE_INCREASE);
        }
        catch(NullPointerException ex) {
            fail("Products list is null.");
        }
    }

    public void testIncreasePriceWithEmptyListOfProducts() {
        try {
        	moCSProductoManager = new CSProductoManager();
        	moCSProductoManager.setMoListaProducto(new ArrayList<CEProducto>());
        	moCSProductoManager.incrementaPrecio(CDDataConstant.POSITIVE_PRICE_INCREASE);
        }
        catch(Exception ex) {
            fail("Products list is empty.");
        }           
    }
    
    public void testIncreasePriceWithPositivePercentage() {
    	moCSProductoManager.incrementaPrecio(CDDataConstant.POSITIVE_PRICE_INCREASE);
        double expectedChairPriceWithIncrease = 100.00;
        double expectedTablePriceWithIncrease = 200.00;
        
        List<CEProducto> products = moCSProductoManager.getListaProducto();      
        CEProducto product = products.get(0);
        moLog.info("=====> Resultado Esperado = " + expectedChairPriceWithIncrease);
        moLog.info("=====> Resultado Actual   = " + product.getPrecio());
        assertEquals(expectedChairPriceWithIncrease, product.getPrecio(), 0);
        
        product = products.get(1);
        moLog.info("=====> Resultado Esperado = " + expectedTablePriceWithIncrease);
        moLog.info("=====> Resultado Actual   = " + product.getPrecio());

        assertEquals(expectedTablePriceWithIncrease, product.getPrecio(), 0);       
    }	
	
}