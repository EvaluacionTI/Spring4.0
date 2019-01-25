package pe.inverfin.spring.view.parteII;

import pe.inverfin.spring.entity.parteII.CEAventuraFailedException;

public interface CICaballero {
	public Object embarcarseEnAventura() throws CEAventuraFailedException;
	public String getNombre();
}
