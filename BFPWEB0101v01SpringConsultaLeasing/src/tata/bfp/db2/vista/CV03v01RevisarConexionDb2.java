package tata.bfp.db2.vista;

import java.sql.Connection;
import java.sql.SQLException;

import tata.bfp.db2.modelo.CDConexionAS400;

public class CV03v01RevisarConexionDb2 {
	static Connection moCxn = null;
    static String mRpta;
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CDConexionAS400 oCxnAS400 = new CDConexionAS400();
		
		try {

			moCxn = oCxnAS400.conexionAS400();
//			System.out.println(moCxn.getSchema());
			mRpta = moCxn.getCatalog();
		} finally{
			System.out.println("Conexion realizada" + mRpta);
		}
	}
}
