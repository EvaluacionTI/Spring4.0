package tata.bfp.modelo;

import java.util.ArrayList;
import java.util.List;

import tata.bfp.entidad.CEProducto;

public class CDListaProducto {

	public List<CEProducto> dataListaProducto(){
	       // Creando una lista de datos
        CEProducto oCEProducto = new CEProducto();
        List<CEProducto> oListaProducto = new ArrayList<>();
        
        oCEProducto.setIdentificador(100);
        oCEProducto.setDescripcion("LEASING BIEN MUEBLE");
        oCEProducto.setPrecio(100);
        oListaProducto.add(oCEProducto);
        oCEProducto = new CEProducto();
        
        oCEProducto.setIdentificador(200);
        oCEProducto.setDescripcion("LEASING BIEN INMUEBLE");
        oCEProducto.setPrecio(200);
        oListaProducto.add(oCEProducto);
        oCEProducto = new CEProducto();
 
        oCEProducto.setIdentificador(300);
        oCEProducto.setDescripcion("LEASEBACK BIEN INMUEBLE");
        oCEProducto.setPrecio(300);
        oListaProducto.add(oCEProducto);
        oCEProducto = new CEProducto();        

        oCEProducto.setIdentificador(400);
        oCEProducto.setDescripcion("LEASEBACK BIEN INMUEBLE");
        oCEProducto.setPrecio(400);
        oListaProducto.add(oCEProducto);
        
        return oListaProducto;
	}
}
