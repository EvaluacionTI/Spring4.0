package etg.bbva.modelo.impl2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import etg.bbva.entidad.CE01Usuario;
import etg.bbva.modelo.CIUsuarioDAO;

public class CDUsuarioJDBCTemplate implements CIUsuarioDAO{
	private JdbcTemplate moJdbcTemplate;
	
	private static final String SQL_INSERT = "INSERT INTO dest01_usuario (id, nombre) VALUES (?, ?)";
	private static final String SQL_UPDATE = "UPDATE dest01_usuario SET nombre = ? WHERE id = ?";
	private static final String SQL_DELETE = "DELETE FROM dest01_usuario WHERE id = ?";
	private static final String SQL_SELECT = "SELECT id, nombre FROM dest01_usuario";
	private static final String SQL_SELECT_BY_ID = SQL_SELECT + " WHERE id = ?";
	
	public void setJdbcTemplate(JdbcTemplate poJdbcTemplate){
		this.moJdbcTemplate = poJdbcTemplate;
	}
	@Override
	public void saveUsuario(CE01Usuario poCEUsuario) {
		moJdbcTemplate.update(SQL_INSERT, poCEUsuario.getId(), poCEUsuario.getNombre());
	}

	@Override
	public CE01Usuario findUsuario(Integer pId) {
		List<CE01Usuario> oLista = moJdbcTemplate.query(SQL_SELECT_BY_ID, 
				new RowMapper<CE01Usuario>(){
					public CE01Usuario mapRow(ResultSet oRs, int rowNum) throws SQLException{
						CE01Usuario oCEUsuario = new CE01Usuario();
						oCEUsuario.setId(oRs.getInt(1));
						oCEUsuario.setNombre(oRs.getString(2));
						return oCEUsuario;
					}
				}, pId
			);
		return oLista.isEmpty() ? null:oLista.get(0); 
	}

	@Override
	public void deleteUsuario(Integer pId) {
		moJdbcTemplate.update(SQL_DELETE, pId);
	}

	@Override
	public List<CE01Usuario> listAll() {
		RowMapper<CE01Usuario> oRowMapper = new RowMapper<CE01Usuario>(){
			
			public CE01Usuario mapRow(ResultSet oRs, int rowNum) throws SQLException{
				CE01Usuario oCECliente = new CE01Usuario();
				oCECliente.setId(oRs.getInt(1));
				oCECliente.setNombre(oRs.getString(2));
				return oCECliente;

			}
		};
		
		List<CE01Usuario> oLista = moJdbcTemplate.query(SQL_SELECT, oRowMapper);
		if (oLista.size() > 0)
			return oLista;
		else
			return null;
	}
}
