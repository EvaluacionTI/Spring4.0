package tata.bfp.entidad.beans;

import tata.bfp.entidad.as400.CECliente;

public class CESaludoService {
	private String mSaludo;
	private CECliente moCliente;
	
	// 1.0 Bean simples Para una clase sin atributos solo el constructor
	public CESaludoService() {
	}

	// 2.0 Bean con inyección de Constructor
	public CESaludoService(String pSaludo){
		this.mSaludo = pSaludo;
	}
	
	// 3.0 Bean referencia de objeto de constructores
	
	public CESaludoService(String pSaludo, CECliente poCliente){
		this.mSaludo = pSaludo;
		this.moCliente = poCliente;
	}
	
	public String getmSaludo() {
		return mSaludo;
	}

	public void setmSaludo(String mSaludo) {
		this.mSaludo = mSaludo;
	}

	public CECliente getMoCliente() {
		return moCliente;
	}

	public void setMoCliente(CECliente moCliente) {
		this.moCliente = moCliente;
	}

}
