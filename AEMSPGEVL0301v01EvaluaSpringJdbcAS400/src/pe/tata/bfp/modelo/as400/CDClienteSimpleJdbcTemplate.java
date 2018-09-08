package pe.tata.bfp.modelo.as400;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pe.tata.bfp.entidad.as400.CECliente;
import pe.tata.bfp.servicio.as400.CICliente;

public class CDClienteSimpleJdbcTemplate implements CICliente{
	private JdbcTemplate moJdbcTemplate;
	
	private static final String SQL_INSERT = "INSERT INTO BFPCYFILES.CUMST (CUSCUN, CUSTID, CUSIDN, CUSNA1) VALUES (?, ?, ?, ?)";
	private static final String SQL_UPDATE = "UPDATE BFPCYFILES.CUMST SET CUSTID = ?, CUSIDN = ?, CUSNA1 = ? WHERE CUSCUN = ?";
	private static final String SQL_DELETE = "DELETE FROM BFPCYFILES.CUMST WHERE CUSCUN = ?";
	private static final String SQL_SELECT = "SELECT CUSCUN, CUSTID, CUSIDN, CUSNA1 FROM BFPCYFILES.CUMST";
	private static final String SQL_SELECT_BY_CUSCUN = SQL_SELECT + " WHERE CUSCUN = ?";
	private static final String SQL_SELECT_FECH = "SELECT CUSCUN, CUSTID, CUSIDN, CUSNA1 FROM BFPCYFILES.CUMST WHERE CUSTID='RUC' FETCH FIRST 1000 ROWS ONLY";
	
	public void setJdbcTemplate(JdbcTemplate poJdbcTemplate){
		this.moJdbcTemplate = poJdbcTemplate;
	}
	
	@Override
	public void agregarCliente(CECliente poCECliente) throws SQLException {
		moJdbcTemplate.update(SQL_INSERT, poCECliente.getIdCodigo(), poCECliente.getTipoDocumento(), poCECliente.getNumeroDocumento(), poCECliente.getNombre());
	}

	@Override
	public void actualizarCliente(CECliente poCECliente) throws SQLException {
		moJdbcTemplate.update(SQL_UPDATE, poCECliente.getTipoDocumento(), poCECliente.getNumeroDocumento(), poCECliente.getNombre(), poCECliente.getIdCodigo());
	}

	@Override
	public void eliminarCliente(int piIdCodigo) {
		moJdbcTemplate.update(SQL_DELETE, piIdCodigo);
	}
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see tata.bfp.servicio.as400.CICliente#buscarClienteporCodigo(int)
	 * Descripción		:	Buscar un cliente por el identificador
	 */
	public CECliente buscarClienteporCodigo(int piIdCodigo) {
		// TODO Auto-generated method stub
		
		List<CECliente> oLista = moJdbcTemplate.query(SQL_SELECT_BY_CUSCUN, 
				new RowMapper<CECliente>(){
					public CECliente mapRow(ResultSet oRs, int rowNum) throws SQLException{
						CECliente oCECliente = new CECliente();
						oCECliente.setIdCodigo(oRs.getInt(1));
						oCECliente.setTipoDocumento(oRs.getString(2));
						oCECliente.setNumeroDocumento(oRs.getString(3));
						oCECliente.setNombre(oRs.getString(4));
						return oCECliente;
					}
				}, piIdCodigo
			);
		return oLista.size() > 0 ? oLista.get(0):null; 
	}



	@Override
	/*
	 * (non-Javadoc)
	 * @see tata.bfp.servicio.as400.CICliente#listaCliente()
	 * Descripción		:	Buscar una lista de clientes
	 */
	public List<CECliente> listaCliente() {
		
		RowMapper<CECliente> oRowMapper = new RowMapper<CECliente>(){
			
			public CECliente mapRow(ResultSet oRs, int rowNum) throws SQLException{
				CECliente oCECliente = new CECliente();
				oCECliente.setIdCodigo(oRs.getInt(1));
				oCECliente.setTipoDocumento(oRs.getString(2));
				oCECliente.setNumeroDocumento(oRs.getString(3));
				oCECliente.setNombre(oRs.getString(4));
				return oCECliente;

			}
		};
		
		List<CECliente> oLista = moJdbcTemplate.query(SQL_SELECT_FECH, oRowMapper);
		if (oLista.size() > 0)
			return oLista;
		else
			return null;
	}

}
