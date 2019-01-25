package tata.bfp.db2.vista;

import java.sql.Connection;
import java.sql.SQLException;

import tata.bfp.db2.modelo.CDConexionAS400;

public class CV02v01RevisarConexionDb2 {
	Connection moCxn = null;
    static String mRpta;
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String lstrUsuario = "BFPALEDIA";
        String lstrClave = "VASQUEZ4";
        
        CDConexionAS400 oCxnAS400 = new CDConexionAS400();
        
        try{
        	
        	Connection moCxn = oCxnAS400.conexionAS400(lstrUsuario, lstrClave);
        	 mRpta = moCxn.getCatalog();
        }finally{
            System.out.println( "Conexion Realizada .....!" + mRpta);
        }
	}
}
