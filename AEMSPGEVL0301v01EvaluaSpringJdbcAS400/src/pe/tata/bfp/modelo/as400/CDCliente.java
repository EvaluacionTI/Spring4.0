package pe.tata.bfp.modelo.as400;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import pe.tata.bfp.entidad.as400.CECliente;
import pe.tata.bfp.servicio.as400.CICliente;

public class CDCliente implements CICliente{

	private DataSource moDataSource;
	private Connection moCxn = null;
	private CECliente moCECliente;
	private List<CECliente> moListaCliente;
	
	public void setDataSource(DataSource poDataSource){
		this.moDataSource = poDataSource;
	}

	@Override
	public void agregarCliente(CECliente poCECliente) {
		String lsComandoSQL = "INSERT INTO BFPCYFILES.CUMST (CUSCUN, CUSTID, CUSIDN, CUSNA1) VALUES (?, ?, ?, ?)";
		try{
			moCxn = moDataSource.getConnection();
			PreparedStatement moPs = moCxn.prepareStatement(lsComandoSQL) ;
			moPs.setInt(1, poCECliente.getIdCodigo());
			moPs.setString(2, poCECliente.getTipoDocumento());
			moPs.setString(3, poCECliente.getNumeroDocumento());
			moPs.setString(4,  poCECliente.getNombre());
			moPs.executeQuery();
		}catch(SQLException exSQL){
			throw new RuntimeException(exSQL);
		}finally{
			if (moCxn != null){
				try{
					moCxn.close();	
				}catch(SQLException exSQL){
					exSQL.getMessage();
				}
			}
		}
	}

	@Override
	public void actualizarCliente(CECliente poCECliente) throws SQLException {
		String lsComandoSQL = "UPDATE BFPCYFILES.CUMST " +
							  "SET CUSIDN = ?, CUSNA1 = ?, CUSTID = ?" + 
							  "WHERE CUSCUN = ?";
		try {
			moCxn = moDataSource.getConnection();
			PreparedStatement moPs = moCxn.prepareStatement(lsComandoSQL) ;
			moPs.setInt(1, poCECliente.getIdCodigo());
			moPs.setString(2, poCECliente.getTipoDocumento());
			moPs.setString(3, poCECliente.getNumeroDocumento());
			moPs.setString(4,  poCECliente.getNombre());
			moPs.executeUpdate();
		}catch(SQLException exSQL) {
			throw new RuntimeException(exSQL);
		}finally {
			if (moCxn != null) {
				try {
					moCxn.close();
				}catch(SQLException exSQL) {
					exSQL.getMessage();
				}
			}
		}
	}
	
	@Override
	public void eliminarCliente(int piIdCodigo) {
		String lsComandoSQL = "DELETE FROM BFPCYFILES.CUMST WHERE CUSCUN = ?";
		try {
			moCxn = moDataSource.getConnection();
			PreparedStatement moPs = moCxn.prepareStatement(lsComandoSQL) ;
			moPs.setInt(1, piIdCodigo);
			moPs.executeUpdate();
		}catch(SQLException exSQL) {
			throw new RuntimeException(exSQL);
		}finally {
			if (moCxn != null) {
				try {
					moCxn.close();
				}catch(SQLException exSQL) {
					exSQL.getMessage();
				}
			}
		}
	}

	@Override
	public CECliente buscarClienteporCodigo(int piIdCodigo) {
		String lsComandoSQL = "SELECT * FROM BFPCYFILES.CUMST TC WHERE TC.CUSCUN = ?";
		
		try{
			moCxn = moDataSource.getConnection();
			PreparedStatement moPs = moCxn.prepareStatement(lsComandoSQL);
			moPs.setInt(1, piIdCodigo);
			ResultSet moRs = moPs.executeQuery();
			if (moRs.next()){
				moCECliente = new CECliente(moRs.getInt("CUSCUN"), moRs.getString("CUSTID"), moRs.getString("CUSIDN"), moRs.getString("CUSNA1"));
			}
			moRs.close();
			moPs.close();
		}catch(SQLException exSQL){
			throw new RuntimeException(exSQL);
		}finally{
			if (moCxn != null){
				try{
					moCxn.close();	
				}catch(SQLException exSQL){
					exSQL.getMessage();
				}
			}
		}
		return moCECliente;
	}
	
	@Override
	public List<CECliente> listaCliente() {
		String lsComandoSQL = "SELECT * FROM BFPCYFILES.CUMST TC";
		moListaCliente = new ArrayList<CECliente>();
		try{
			moCxn = moDataSource.getConnection();
			PreparedStatement moPs = moCxn.prepareStatement(lsComandoSQL);
			ResultSet moRs = moPs.executeQuery();
			if (moRs.next()){
				moCECliente = new CECliente(moRs.getInt("CUSCUN"), moRs.getString("CUSTID"), moRs.getString("CUSIDN"), moRs.getString("CUSNA1"));
				moListaCliente.add(moCECliente);
			}
			moRs.close();
			moPs.close();
			
		}catch(SQLException exSQL){
			throw new RuntimeException(exSQL);
		}finally{
			if (moCxn != null){
				try{
					moCxn.close();	
				}catch(SQLException exSQL){
					exSQL.getMessage();
				}
			}
		}
		return moListaCliente;
	}


	
}
