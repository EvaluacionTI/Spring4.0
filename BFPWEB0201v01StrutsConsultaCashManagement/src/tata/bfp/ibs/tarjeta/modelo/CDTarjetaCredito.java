package tata.bfp.ibs.tarjeta.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import tata.bfp.ibs.modelo.CDConexionAS400;
import tata.bfp.ibs.tarjeta.entidad.CETarjetaCredito;

public class CDTarjetaCredito {
	private Connection moCxn = null;
	private Statement moS = null;
	private ResultSet moRs = null;
	private List<CETarjetaCredito> moLista = null;
	
	private CETarjetaCredito moCESaldoTarjeta;
	
	public CDTarjetaCredito(){
		moCESaldoTarjeta = new CETarjetaCredito();
		moLista = new LinkedList<CETarjetaCredito>();
	}
	/**
	 *	Descripción		:	validar la consulta de saldo de tarjeta de crédito en DB2
	 */	
	public void evaluarSaldoTarjetaCredito(int piCodigoEmpresa) throws SQLException{
		String lsDB2Query = "";
		
		CDConexionAS400 moCDConexion = new CDConexionAS400();
		CDQueryTarjetaCredito moCDQuery = new CDQueryTarjetaCredito();
		
		lsDB2Query = moCDQuery.querySaldoTarjetaCredito(piCodigoEmpresa);
		
		moCxn = moCDConexion.conexionAS400();
		moS = moCxn.createStatement();
		moRs = moS.executeQuery(lsDB2Query);

		while (moRs.next()){
			System.out.println(moRs.getString(3));
		}
		
		desconexion();
	}

	/**
	 *	Descripción		:	lista por Cliente Empresarial de saldos de tarjeta de crédito 
	 *						asociado a su tarjeta habiente vinculado
	 */	
	public List<CETarjetaCredito> listaClienteSaldoTarjetaCredito(long piCodigoEmpresa) throws SQLException{
		String lsDB2Query = "";
		
		CDConexionAS400 moCDConexion = new CDConexionAS400();
		CDQueryTarjetaCredito moCDQuery = new CDQueryTarjetaCredito();
		
		lsDB2Query = moCDQuery.querySaldoTarjetaCredito(piCodigoEmpresa);
		
		moCxn = moCDConexion.conexionAS400();
		moS = moCxn.createStatement();
		moRs = moS.executeQuery(lsDB2Query);
		
		try{
			
			while (moRs.next()){
				moCESaldoTarjeta.setCodigoEmpresa(moRs.getLong(1));
				moCESaldoTarjeta.setNombreEmpresa(moRs.getString(2));
				moCESaldoTarjeta.setNumeroPan(moRs.getString(3));
				moCESaldoTarjeta.setNumeroTarjetaHabiente(moRs.getString(4));
				moCESaldoTarjeta.setNombreTarjeta(moRs.getString(5));
				moCESaldoTarjeta.setCodigoEstadoTarjeta(moRs.getString(6));
				moCESaldoTarjeta.setEstadoTarjeta(moRs.getString(7));
				moCESaldoTarjeta.setCodigoVinculado(moRs.getLong(8));
				moCESaldoTarjeta.setNombreCliente(moRs.getString(9));
				moCESaldoTarjeta.setCicloFacturacion(moRs.getInt(10));
				moCESaldoTarjeta.setLineaCredito(moRs.getDouble(11));
				moCESaldoTarjeta.setSaldoLineaCredito(moRs.getDouble(12));
				moCESaldoTarjeta.setLineaDisposicionEfectivo(moRs.getDouble(13));
				moCESaldoTarjeta.setSaldoDisposicionEfectivo(moRs.getDouble(14));
				moCESaldoTarjeta.setDdmmyyyyFacturacion(moRs.getString(15));
				moCESaldoTarjeta.setDdmmyyyyPago(moRs.getString(16));
				moCESaldoTarjeta.setPagoMinimoMN(moRs.getDouble(17));
				moCESaldoTarjeta.setPagoTotalMN(moRs.getDouble(18));
				moCESaldoTarjeta.setPagoMinimoME(moRs.getDouble(19));
				moCESaldoTarjeta.setPagoTotalME(moRs.getDouble(20));
				
				moLista.add(moCESaldoTarjeta);
				moCESaldoTarjeta = new CETarjetaCredito();
				
			}
		}catch(NullPointerException exNPE){
			exNPE.getMessage();
		}
		
		desconexion();
		
		return moLista;
	}

	/**
	 *	Descripción		:	lista Total de saldos de tarjeta de crédito de los Clientes Empresarial
	 *						asociados a su tarjeta habiente vinculado
	 */	
	public List<CETarjetaCredito> listaTotalSaldoTarjetaCredito() throws SQLException{
		String lsDB2Query = "";
		
		CDConexionAS400 moCDConexion = new CDConexionAS400();
		CDQueryTarjetaCredito moCDQuery = new CDQueryTarjetaCredito();
		
		lsDB2Query = moCDQuery.queryTotalSaldoTarjetaCredito();
		
		moCxn = moCDConexion.conexionAS400();
		moS = moCxn.createStatement();
		moRs = moS.executeQuery(lsDB2Query);
		
		try{
			
			while (moRs.next()){
				moCESaldoTarjeta.setCodigoEmpresa(moRs.getLong(1));
				moCESaldoTarjeta.setNombreEmpresa(moRs.getString(2));
				moCESaldoTarjeta.setNumeroPan(moRs.getString(3));
				moCESaldoTarjeta.setNumeroTarjetaHabiente(moRs.getString(4));
				moCESaldoTarjeta.setNombreTarjeta(moRs.getString(5));
				moCESaldoTarjeta.setCodigoEstadoTarjeta(moRs.getString(6));
				moCESaldoTarjeta.setEstadoTarjeta(moRs.getString(7));
				moCESaldoTarjeta.setCodigoVinculado(moRs.getLong(8));
				moCESaldoTarjeta.setNombreCliente(moRs.getString(9));
				moCESaldoTarjeta.setCicloFacturacion(moRs.getInt(10));
				moCESaldoTarjeta.setLineaCredito(moRs.getDouble(11));
				moCESaldoTarjeta.setSaldoLineaCredito(moRs.getDouble(12));
				moCESaldoTarjeta.setLineaDisposicionEfectivo(moRs.getDouble(13));
				moCESaldoTarjeta.setSaldoDisposicionEfectivo(moRs.getDouble(14));
				moCESaldoTarjeta.setDdmmyyyyFacturacion(moRs.getString(15));
				moCESaldoTarjeta.setDdmmyyyyPago(moRs.getString(16));
				moCESaldoTarjeta.setPagoMinimoMN(moRs.getDouble(17));
				moCESaldoTarjeta.setPagoTotalMN(moRs.getDouble(18));
				moCESaldoTarjeta.setPagoMinimoME(moRs.getDouble(19));
				moCESaldoTarjeta.setPagoTotalME(moRs.getDouble(20));
				
				moLista.add(moCESaldoTarjeta);
				moCESaldoTarjeta = new CETarjetaCredito();
				
			}
		}catch(NullPointerException exNPE){
			exNPE.getMessage();
		}
		
		desconexion();
		
		return moLista;
	}	
	public void desconexion(){
		try{
			moRs.close();
			moS.close();
			moCxn.close();
		}catch(SQLException exSQL){
			exSQL.getMessage();
		}
	}
	
	
}
