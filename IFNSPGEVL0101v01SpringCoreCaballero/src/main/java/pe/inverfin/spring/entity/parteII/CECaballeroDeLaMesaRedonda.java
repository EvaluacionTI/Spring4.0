package pe.inverfin.spring.entity.parteII;

import pe.inverfin.spring.entity.parteII.CEAventuraFailedException;
import pe.inverfin.spring.view.parteII.CIAventura;
import pe.inverfin.spring.view.parteII.CICaballero;

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
