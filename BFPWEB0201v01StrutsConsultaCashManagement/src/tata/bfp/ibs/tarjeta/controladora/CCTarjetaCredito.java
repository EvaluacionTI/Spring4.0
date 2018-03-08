package tata.bfp.ibs.tarjeta.controladora;

import java.sql.SQLException;
import java.util.List;

import tata.bfp.ibs.tarjeta.entidad.CETarjetaCredito;
import tata.bfp.ibs.tarjeta.modelo.CDTarjetaCredito;

public class CCTarjetaCredito {
	CDTarjetaCredito moCDTajetaCredito = new CDTarjetaCredito();
	
	public void evaluarSaldoTarjetaCredito(int piCodigoEmpresa) throws SQLException{
		
		moCDTajetaCredito.evaluarSaldoTarjetaCredito(piCodigoEmpresa);
	}

	public List<CETarjetaCredito> listaClienteSaldoTarjetaCredito(long piCodigoEmpresa) throws SQLException{
		
		return moCDTajetaCredito.listaClienteSaldoTarjetaCredito(piCodigoEmpresa);
	}

	public List<CETarjetaCredito> listaTotalSaldoTarjetaCredito() throws SQLException{
		
		return moCDTajetaCredito.listaTotalSaldoTarjetaCredito();
	}		
}
