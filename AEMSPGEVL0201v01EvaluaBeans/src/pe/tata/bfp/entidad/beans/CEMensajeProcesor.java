package pe.tata.bfp.entidad.beans;

public class CEMensajeProcesor {

	String mensaje;
	
	public CEMensajeProcesor() {
	}

	public String getMensaje() {
		System.out.println(" Su mensaje es " + mensaje);
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void init(){
		System.out.println(" Iniciando Bean ");
	}
	
	public void destroy(){
		System.out.println(" Destruyendo Bean ");
	}
	public String toString(){
		return "CEMensajeProcesor [mensaje = ] " + mensaje + " ] ";
	}
}
