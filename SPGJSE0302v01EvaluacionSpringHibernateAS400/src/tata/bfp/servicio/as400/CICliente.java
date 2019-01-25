package tata.bfp.servicio.as400;

import java.sql.SQLException;
import java.util.List;

import tata.bfp.entidad.as400.CECliente;

public interface CICliente {
	public void agregarCliente(CECliente poCECliente) throws SQLException;
	public void actualizarCliente(CECliente poCECliente) throws SQLException;
	public CECliente buscarClienteporCodigo(int piIdCodigo);
	public void eliminarCliente(int piIdCodigo);
	@SuppressWarnings("rawtypes")
	public List listaCliente();
}
