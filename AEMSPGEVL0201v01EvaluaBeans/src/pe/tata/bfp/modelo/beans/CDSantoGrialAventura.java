package pe.tata.bfp.modelo.beans;

import pe.tata.bfp.servicio.beans.CIAventura;

public class CDSantoGrialAventura implements CIAventura {
	public CDSantoGrialAventura(){}

	@Override
	public Object embarcar() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public SantoGrial embarcar(){
//		return new SantoGrial();
//	}
	
	public String embarcarEnAventura(){
		return "Embargar";
	}
	
}
