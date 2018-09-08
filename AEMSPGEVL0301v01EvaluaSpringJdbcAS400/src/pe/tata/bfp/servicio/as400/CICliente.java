package pe.tata.bfp.servicio.as400;

import java.sql.SQLException;
import java.util.List;

import pe.tata.bfp.entidad.as400.CECliente;

public interface CICliente {
	public void agregarCliente(CECliente poCECliente) throws SQLException;
	public void actualizarCliente(CECliente poCECliente) throws SQLException;
	public void eliminarCliente(int piIdCodigo);
	public CECliente buscarClienteporCodigo(int piIdCodigo);	
	public List<CECliente> listaCliente();
}
