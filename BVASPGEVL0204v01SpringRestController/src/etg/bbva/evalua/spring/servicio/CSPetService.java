package etg.bbva.evalua.spring.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import etg.bbva.evalua.spring.entidad.CEAnimal;
import etg.bbva.evalua.spring.entidad.CEMascota;

@Service
public class CSPetService {
	List<CEMascota> oListPet;
	
	public List<CEMascota> findAll(){
		if (oListPet == null) {
			oListPet = new ArrayList<CEMascota>();
			oListPet.add(new CEMascota(1, "Lobo", new CEAnimal("Perro")));
			oListPet.add(new CEMascota(2, "Negro", new CEAnimal("Caballo")));
			oListPet.add(new CEMascota(3, "Rayo", new CEAnimal("Toro")));
			oListPet.add(new CEMascota(4, "Sambo", new CEAnimal("Sapo")));
			oListPet.add(new CEMascota(5, "Apache", new CEAnimal("Tarantula")));
		}
		return oListPet;
	}
	
	public CEMascota findById(int pId) {
		for (CEMascota oPet: findAll()) {
			if (oPet.getId() == pId) {
				return oPet;
			}
		}
		return null;
		
	}
}
