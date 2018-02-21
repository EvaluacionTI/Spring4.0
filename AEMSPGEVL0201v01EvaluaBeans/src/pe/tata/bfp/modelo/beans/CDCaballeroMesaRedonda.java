package pe.tata.bfp.modelo.beans;

public class CDCaballeroMesaRedonda {
	private String nombre;
	private CDSantoGrialAventura aventura;
	
	public CDCaballeroMesaRedonda(String nombre){
		this.nombre = nombre;
		aventura = new CDSantoGrialAventura();
	}
	
	public Object embarcarEnAventura() {
		return aventura.embarcar();
	}
	
	public Object isSanto(){
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CDSantoGrialAventura getAventura() {
		return aventura;
	}

	public void setAventura(CDSantoGrialAventura aventura) {
		this.aventura = aventura;
	}
}
