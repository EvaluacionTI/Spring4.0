package pe.inverfin.spring.entity.parteI;

import pe.inverfin.spring.view.parteI.CIAventura;

public class CESantoGrialAventura  implements CIAventura{

	public Object embarcar() throws CEAventuraFailedException {
		// TODO Auto-generated method stub
		return new CESantoGrial();
	}

}
