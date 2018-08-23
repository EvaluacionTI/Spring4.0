package pe.tata.bfp.entidad.beans;

public class CEMensaje {

	String mensaje;
	
	public CEMensaje() {
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String toString(){
		return "CEMensaje [mensaje = ] " + mensaje + " ] ";
	}
}
