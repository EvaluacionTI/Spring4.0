package etg.bbva.entidad;

import java.util.Date;

public class CE0302v01Pelicula {
	int id;
	CE0301v01Actor oCEActor;
	String nombre;
	Date estreno;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CE0301v01Actor getoCEActor() {
		return oCEActor;
	}
	public void setoCEActor(CE0301v01Actor oCEActor) {
		this.oCEActor = oCEActor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getEstreno() {
		return estreno;
	}
	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}
}
