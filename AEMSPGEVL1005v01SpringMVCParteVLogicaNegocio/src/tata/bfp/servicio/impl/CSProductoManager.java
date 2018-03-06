package tata.bfp.servicio.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tata.bfp.entidad.CEProducto;
import tata.bfp.modelo.CDListaProducto;
import tata.bfp.servicio.CIProductoManager;

public class CSProductoManager implements CIProductoManager {
	private static final Logger moLog = LogManager.getLogger(CSProductoManager.class);
	private static final long serialVersionUID = -645425184584887524L;

	private List<CEProducto> moListaProducto; 
	
	
	@Override
	public void incrementaPrecio(int liPorcentaje) {
		moLog.info("=====> Metodo Impl = incrementaPrecio");
		if (moListaProducto !=null){
			for (CEProducto oCEProducto:moListaProducto){
				double ldNuevoPrecio = oCEProducto.getPrecio() + oCEProducto.getPrecio() * (liPorcentaje * 0.01);
				oCEProducto.setPrecio(ldNuevoPrecio);
			}
		}
		moLog.info("=====> Lista " + moListaProducto);
	}

	@Override
	public List<CEProducto> getListaProducto() {
		CDListaProducto oCDDataProducto = new CDListaProducto();
		moListaProducto = oCDDataProducto.dataListaProducto();
		return moListaProducto;
	}
	
	public List<CEProducto> getMoListaProducto() {
		return moListaProducto;
	}

	public void setMoListaProducto(List<CEProducto> poListaProducto) {
		moLog.info("=====> Metodo = setListaProducto" + poListaProducto);
		this.moListaProducto = poListaProducto;
	}

}

