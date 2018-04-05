package etg.bbva.modelo;

import java.util.List;

import etg.bbva.entidad.CE01Usuario;

public interface CIUsuarioDAO {
	public void saveUsuario(CE01Usuario poCEUsuario);
	public CE01Usuario findUsuario(Integer pId);
	public void deleteUsuario(Integer pId);
	public List<CE01Usuario> listAll();
}
