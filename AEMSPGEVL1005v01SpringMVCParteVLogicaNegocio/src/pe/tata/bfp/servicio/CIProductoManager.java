package pe.tata.bfp.servicio;

import java.io.Serializable;
import java.util.List;

import pe.tata.bfp.entidad.CEProducto;

public interface CIProductoManager extends Serializable {

	public void incrementaPrecio(int liPorcentaje);
	
	public List<CEProducto> getListaProducto();
	
}
