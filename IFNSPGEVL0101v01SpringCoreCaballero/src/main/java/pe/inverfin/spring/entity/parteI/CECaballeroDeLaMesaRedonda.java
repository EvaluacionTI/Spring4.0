package pe.inverfin.spring.entity.parteI;

import pe.inverfin.spring.view.parteI.CIAventura;
import pe.inverfin.spring.view.parteI.CICaballero;

public class CECaballeroDeLaMesaRedonda implements CICaballero {

	private String nombre;
	private CIAventura aventura;

	public CECaballeroDeLaMesaRedonda(String nombre) {
		super();
		this.nombre = nombre;
		this.aventura = new CESantoGrialAventura();
	}
	
	public Object embarcarEnAventura() throws CEAventuraFailedException {
		return aventura.embarcar();
	}

	public CIAventura getAventura() {
		return aventura;
	}

	public void setAventura(CIAventura aventura) {
		this.aventura = aventura;
	}

	public String getNombre() {
		return nombre;
	}

	public Object embarcarseEnAventura() throws CEAventuraFailedException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
