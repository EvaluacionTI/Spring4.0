package pe.tata.bfp.servicio.beans;

import java.util.List;

import pe.tata.bfp.entidad.beans.CEUsuario;

public interface CIUsuario {
	public void grabaUsuario(CEUsuario poCEUsuario);
	public CEUsuario buscarUsuario(int pId);
	public void eliminaUsuario(int pId);

	@SuppressWarnings("rawtypes")
	public List listaUsuario();
}
