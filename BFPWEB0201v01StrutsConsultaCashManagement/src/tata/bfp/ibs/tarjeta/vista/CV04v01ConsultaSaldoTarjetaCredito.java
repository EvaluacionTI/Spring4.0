package tata.bfp.ibs.tarjeta.vista;

import java.sql.SQLException;

import tata.bfp.ibs.tarjeta.controladora.CCTarjetaCredito;

public class CV04v01ConsultaSaldoTarjetaCredito {
	
	
	public static void main(String[] args) throws SQLException {
		
		int liCodigoEmpresa = 10566; //100396;
		CCTarjetaCredito moCCTarjetaCredito = new CCTarjetaCredito();
		
		moCCTarjetaCredito.evaluarSaldoTarjetaCredito(liCodigoEmpresa);
		
		System.out.println(moCCTarjetaCredito.listaClienteSaldoTarjetaCredito(liCodigoEmpresa));
		
		System.out.println(moCCTarjetaCredito.listaTotalSaldoTarjetaCredito());
	}

}
