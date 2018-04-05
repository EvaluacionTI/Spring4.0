package etg.bbva.modelo.impl2;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import etg.bbva.entidad.CE01Usuario;
import etg.bbva.modelo.CIUsuarioDAO;

public class CDUsuarioDAOOtraImpl implements CIUsuarioDAO {
	private static Logger moLog = LogManager.getLogger(CDUsuarioDAOOtraImpl.class);
	private static HashMap<Integer, CE01Usuario> oTabla;
	
	public CDUsuarioDAOOtraImpl() {
		moLog.debug("Constructor de la implementación DAO");
		oTabla = new HashMap<Integer, CE01Usuario>();
	}
	
	@Override
	public void saveUsuario(CE01Usuario poCEUsuario) {
		moLog.info("Guardamos el usuario " + poCEUsuario);
		if (poCEUsuario != null) {
			oTabla.put(poCEUsuario.getId(), poCEUsuario);
		}
	}

	@Override
	public CE01Usuario findUsuario(Integer pId) {
		moLog.info("Buscando el usuario " + pId);
		return (CE01Usuario) oTabla.get(pId);
	}

	@Override
	public void deleteUsuario(Integer pId) {
		moLog.info("Eliminando el usuario " + pId);
		oTabla.remove(pId);
	}

	@Override
	public List<CE01Usuario> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
