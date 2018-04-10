package pe.tata.bfp.modelo.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pe.tata.bfp.entidad.beans.CEUsuario;
import pe.tata.bfp.servicio.beans.CIUsuario;

public class CDUsuario implements CIUsuario{

	@SuppressWarnings("unused")
	private static final Logger moLog = LogManager.getLogger(CDUsuario.class);
	@SuppressWarnings({ "rawtypes", "unused" })
	private static HashMap moTabla;
	
	@SuppressWarnings("rawtypes")
	public CDUsuario(){
//		moLog.debug("Implementación del Modelo ----->");
		try{
			moTabla = new HashMap();	
		}catch(Exception oEx){
			
		}
		
	}

	public void grabaUsuario(CEUsuario poCEUsuario) {
		
//		moLog.debug("Almacenando el usuario ----->" + poCEUsuario);
		// TODO Auto-generated method stub
		
	}

	public CEUsuario buscarUsuario(int pId) {
//		moLog.debug("Buscando el usuario ----->" + pId);
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminaUsuario(int pId) {
//		moLog.debug("Eliminando el usuario ----->" + pId);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("rawtypes")
	public List listaUsuario() {
//		moLog.debug("Listando el usuario ----->" );

		List<CEUsuario> oListaUsuario = new ArrayList<>();
		
		System.out.println("Lista de usuarios en general" + oListaUsuario.size());	
		return null;
	}

}
