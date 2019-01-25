package pe.tata.bfp.ibs.tarjeta.entidad;

import java.io.Serializable;
/**
 *	Descripción		:	Clase de Saldo de Tarjeta de Crédito Empresarial 
 */

public class CETarjetaCredito implements Serializable{
	private static final long serialVersionUID = -8306364222010578483L;
	private long codigoEmpresa;
	private String nombreEmpresa;
	private String numeroPan;
	private String numeroTarjetaHabiente;
	private String nombreTarjeta;
	private String codigoEstadoTarjeta;
	private String EstadoTarjeta;
	private long codigoVinculado;
	private String nombreCliente;
	private int cicloFacturacion;
	private double LineaCredito;
	private double saldoLineaCredito;
	private double LineaDisposicionEfectivo;
	private double saldoDisposicionEfectivo;
	private String ddmmyyyyFacturacion;
	private String ddmmyyyyPago;
	private double pagoMinimoMN;
	private double pagoTotalMN;
	private double pagoMinimoME;
	private double pagoTotalME;
	
	// Constructores
	public CETarjetaCredito(){}
	
	public CETarjetaCredito(long plCodigoEmpresa, String psNombreEmpresa, String psNumeroPan, String psNumeroTarjetaHabiente, 	String psNombreTarjeta,
							String psCodigoEstadoTarjeta, String psEstadoTarjeta, long plCodigoVinculado, String psNombreCliente, int piCicloFacturacion,
							double pdLineaCredito, double pdSaldoLineaCredito, double pdLineaDisposicionEfectivo, double pdSaldoDisposicionEfectivo, String psDdmmyyyyFacturacion,
							String psDdmmyyyyPago, double pdPagoMinimoMN, double pdPagoTotalMN, double pdPagoMinimoME, double pdPagoTotalME){
		this.codigoEmpresa = plCodigoEmpresa;
		this.nombreEmpresa = psNombreEmpresa;
		this.numeroPan = psNumeroPan;
		this.numeroTarjetaHabiente = psNumeroTarjetaHabiente;
		this.nombreTarjeta = psNombreTarjeta;
		this.codigoEstadoTarjeta = psCodigoEstadoTarjeta;
		this.EstadoTarjeta = psEstadoTarjeta;
		this.codigoVinculado = plCodigoVinculado;
		this.nombreCliente = psNombreCliente;
		this.cicloFacturacion = piCicloFacturacion;
		this.LineaCredito = pdLineaCredito;
		this.saldoLineaCredito = pdSaldoLineaCredito;
		this.LineaDisposicionEfectivo = pdLineaDisposicionEfectivo;
		this.saldoDisposicionEfectivo = pdSaldoDisposicionEfectivo;
		this.ddmmyyyyFacturacion = psDdmmyyyyFacturacion;
		this.ddmmyyyyPago = psDdmmyyyyPago;
		this.pagoMinimoMN = pdPagoMinimoMN;
		this.pagoTotalMN = pdPagoTotalMN;
		this.pagoMinimoME = pdPagoMinimoME;
		this.pagoTotalME = pdPagoTotalME;

	}
	
	// Métodos getter y setter
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNumeroPan() {
		return numeroPan;
	}
	public void setNumeroPan(String numeroPan) {
		this.numeroPan = numeroPan;
	}
	public String getNumeroTarjetaHabiente() {
		return numeroTarjetaHabiente;
	}
	public void setNumeroTarjetaHabiente(String numeroTarjetaHabiente) {
		this.numeroTarjetaHabiente = numeroTarjetaHabiente;
	}
	public String getNombreTarjeta() {
		return nombreTarjeta;
	}
	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}
	public String getCodigoEstadoTarjeta() {
		return codigoEstadoTarjeta;
	}
	public void setCodigoEstadoTarjeta(String codigoEstadoTarjeta) {
		this.codigoEstadoTarjeta = codigoEstadoTarjeta;
	}
	public String getEstadoTarjeta() {
		return EstadoTarjeta;
	}
	public void setEstadoTarjeta(String estadoTarjeta) {
		EstadoTarjeta = estadoTarjeta;
	}
	public long getCodigoVinculado() {
		return codigoVinculado;
	}
	public void setCodigoVinculado(long codigoVinculado) {
		this.codigoVinculado = codigoVinculado;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getCicloFacturacion() {
		return cicloFacturacion;
	}
	public void setCicloFacturacion(int cicloFacturacion) {
		this.cicloFacturacion = cicloFacturacion;
	}
	public double getLineaCredito() {
		return LineaCredito;
	}
	public void setLineaCredito(double lineaCredito) {
		LineaCredito = lineaCredito;
	}
	public double getSaldoLineaCredito() {
		return saldoLineaCredito;
	}
	public void setSaldoLineaCredito(double saldoLineaCredito) {
		this.saldoLineaCredito = saldoLineaCredito;
	}
	public double getLineaDisposicionEfectivo() {
		return LineaDisposicionEfectivo;
	}
	public void setLineaDisposicionEfectivo(double lineaDisposicionEfectivo) {
		LineaDisposicionEfectivo = lineaDisposicionEfectivo;
	}
	public double getSaldoDisposicionEfectivo() {
		return saldoDisposicionEfectivo;
	}
	public void setSaldoDisposicionEfectivo(double saldoDisposicionEfectivo) {
		this.saldoDisposicionEfectivo = saldoDisposicionEfectivo;
	}
	public String getDdmmyyyyFacturacion() {
		return ddmmyyyyFacturacion;
	}
	public void setDdmmyyyyFacturacion(String ddmmyyyyFacturacion) {
		this.ddmmyyyyFacturacion = ddmmyyyyFacturacion;
	}
	public String getDdmmyyyyPago() {
		return ddmmyyyyPago;
	}
	public void setDdmmyyyyPago(String ddmmyyyyPago) {
		this.ddmmyyyyPago = ddmmyyyyPago;
	}
	public double getPagoMinimoMN() {
		return pagoMinimoMN;
	}
	public void setPagoMinimoMN(double pagoMinimoMN) {
		this.pagoMinimoMN = pagoMinimoMN;
	}
	public double getPagoTotalMN() {
		return pagoTotalMN;
	}
	public void setPagoTotalMN(double pagoTotalMN) {
		this.pagoTotalMN = pagoTotalMN;
	}
	public double getPagoMinimoME() {
		return pagoMinimoME;
	}
	public void setPagoMinimoME(double pagoMinimoME) {
		this.pagoMinimoME = pagoMinimoME;
	}
	public double getPagoTotalME() {
		return pagoTotalME;
	}
	public void setPagoTotalME(double pagoTotalME) {
		this.pagoTotalME = pagoTotalME;
	}
	

	

	
}
