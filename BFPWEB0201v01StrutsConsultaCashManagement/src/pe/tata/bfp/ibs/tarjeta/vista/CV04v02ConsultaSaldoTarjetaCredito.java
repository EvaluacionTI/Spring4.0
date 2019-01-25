package pe.tata.bfp.ibs.tarjeta.vista;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import pe.tata.bfp.ibs.tarjeta.controladora.CCTarjetaCredito;
import pe.tata.bfp.ibs.tarjeta.entidad.CETarjetaCredito;

public class CV04v02ConsultaSaldoTarjetaCredito {
	private static List<CETarjetaCredito> moLista = null;
	private static CETarjetaCredito moCETarjetaCredito;
	
	public static void main(String[] args) throws SQLException {
		String lsCodigoEmpresa;
		long liCodigoEmpresa = 0; //10566, 100396;
		int index = 0;
		
		CCTarjetaCredito moCCTarjetaCredito = new CCTarjetaCredito();
		
		lsCodigoEmpresa = JOptionPane.showInputDialog("Registre el c�digo de empresa");
		liCodigoEmpresa = Integer.parseInt(lsCodigoEmpresa);
		
		moLista = new LinkedList<CETarjetaCredito>();
		moLista = moCCTarjetaCredito.listaClienteSaldoTarjetaCredito(liCodigoEmpresa);
		
		moCETarjetaCredito = new CETarjetaCredito();
		Iterator<CETarjetaCredito> oIt = moLista.iterator();
		
		while (oIt.hasNext()){
			
			moCETarjetaCredito = moLista.get(index);
			
			System.out.print(moCETarjetaCredito.getCodigoEmpresa());
			System.out.print(" | " + moCETarjetaCredito.getNombreEmpresa());
			System.out.print(" | " + moCETarjetaCredito.getNumeroPan());
			System.out.print(" | " + moCETarjetaCredito.getNumeroTarjetaHabiente());
			System.out.print(" | " + moCETarjetaCredito.getNombreTarjeta());
			System.out.print(" | " + moCETarjetaCredito.getCodigoEstadoTarjeta());
			System.out.print(" | " + moCETarjetaCredito.getEstadoTarjeta());
			System.out.print(" | " + moCETarjetaCredito.getCodigoVinculado());
			System.out.print(" | " + moCETarjetaCredito.getNombreCliente());
			System.out.print(" | " + moCETarjetaCredito.getCicloFacturacion());
			System.out.print(" | " + moCETarjetaCredito.getLineaCredito());
			System.out.print(" | " + moCETarjetaCredito.getSaldoLineaCredito());
			System.out.print(" | " + moCETarjetaCredito.getLineaDisposicionEfectivo());
			System.out.print(" | " + moCETarjetaCredito.getSaldoDisposicionEfectivo());
			System.out.print(" | " + moCETarjetaCredito.getDdmmyyyyFacturacion());
			System.out.print(" | " + moCETarjetaCredito.getDdmmyyyyPago());
			System.out.print(" | " + moCETarjetaCredito.getPagoMinimoMN());
			System.out.print(" | " + moCETarjetaCredito.getPagoTotalMN());
			System.out.print(" | " + moCETarjetaCredito.getPagoMinimoME());
			System.out.print(" | " + moCETarjetaCredito.getPagoTotalME());
			
			System.out.print("\n");
			
			oIt.next();
			index ++;
		}
		
		
	}

}
