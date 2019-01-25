package pe.inverfin.spring.entity.parteII;

import pe.inverfin.spring.entity.parteII.CEAventuraFailedException;
import pe.inverfin.spring.view.parteII.CIAventura;

public class CESantoGrialAventura  implements CIAventura{

	public Object embarcar() throws CEAventuraFailedException {
		// TODO Auto-generated method stub
		return new CESantoGrial();
	}

}
