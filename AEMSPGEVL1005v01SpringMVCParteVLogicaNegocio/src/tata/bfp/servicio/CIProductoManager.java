package tata.bfp.servicio;

import java.io.Serializable;
import java.util.List;

import tata.bfp.entidad.CEProducto;

public interface CIProductoManager extends Serializable {

	public void incrementaPrecio(int liPorcentaje);
	
	public List<CEProducto> getListaProducto();
	
//	public void setListaProducto(List<CEProducto> poListaProducto);
}
