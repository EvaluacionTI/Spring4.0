package tata.bfp.leasing.entidad;

import java.util.Calendar;


public class CEFechaFacturacion {
	Calendar fechaDesembolso;
	Calendar fechaFacturacion;
	Calendar fechaCorte;
	int  diaFacturacion;
	int  milisegundosFacturacion;
	int  milisegundosFechaDesembolso;

	public Calendar getFechaDesembolso() {
		return fechaDesembolso;
	}
	public Calendar getFechaFacturacion() {
		return fechaFacturacion;
	}
	public Calendar getFechaCorte() {
		return fechaCorte;
	}
	public int getDiaFacturacion() {
		return diaFacturacion;
	}
	public int getMilisegundosFacturacion() {
		return milisegundosFacturacion;
	}
	public int getMilisegundosFechaDesembolso() {
		return milisegundosFechaDesembolso;
	}
	public void setFechaDesembolso(Calendar fechaDesembolso) {
		this.fechaDesembolso = fechaDesembolso;
	}
	public void setFechaFacturacion(Calendar fechaFacturacion) {
		this.fechaFacturacion = fechaFacturacion;
	}
	public void setFechaCorte(Calendar fechaCorte) {
		this.fechaCorte = fechaCorte;
	}
	public void setDiaFacturacion(int diaFacturacion) {
		this.diaFacturacion = diaFacturacion;
	}
	public void setMilisegundosFacturacion(int milisegundosFacturacion) {
		this.milisegundosFacturacion = milisegundosFacturacion;
	}
	public void setMilisegundosFechaDesembolso(int milisegundosFechaDesembolso) {
		this.milisegundosFechaDesembolso = milisegundosFechaDesembolso;
	}
}
