package pe.inverfin.spring.view.parteII;

import pe.inverfin.spring.entity.parteII.CEAventuraFailedException;

public interface CIAventura {
	public Object embarcar() throws CEAventuraFailedException;
}
