package pe.tata.bfp.ibs.vista;

import java.sql.Connection;
import java.sql.SQLException;

import pe.tata.bfp.ibs.modelo.CDConexionAS400;

public class CV0101v01RevisarConexionDb2 {
	static Connection moCxn = null;
    static String mRpta;
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CDConexionAS400 oCxnAS400 = new CDConexionAS400();
		
		try {

			moCxn = oCxnAS400.conexionAS400();
//			System.out.println(moCxn.getSchema());
			mRpta = moCxn.getCatalog();
			if  (mRpta == null){
				System.out.println("Conexion realizada :" + mRpta);
			}
		} finally{
			System.out.println("Conexion realizada :" + mRpta);
		}
	}
}
