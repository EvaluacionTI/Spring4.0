package pe.inverfin.spring.entity;

public class CECaballeroDeLaMesaRedonda {

	private String nombre;
	private CESantoGrialAventura aventura;

	public CECaballeroDeLaMesaRedonda(String nombre) {
		super();
		this.nombre = nombre;
		this.aventura = new CESantoGrialAventura();
	}
	
	public CESantoGrial embarcarEnAventura() throws CEGrialNotFoundException {
		return aventura.embarcar();
	}
}
