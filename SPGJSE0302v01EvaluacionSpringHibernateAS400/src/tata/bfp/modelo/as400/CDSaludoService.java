package tata.bfp.modelo.as400;

import tata.bfp.servicio.as400.CISaludoService;

public class CDSaludoService implements CISaludoService {
	private String mSaludo;
	
	public CDSaludoService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println(mSaludo);
	}

	public String getmSaludo() {
		return mSaludo;
	}

	public void setmSaludo(String mSaludo) {
		this.mSaludo = mSaludo;
	}

}
